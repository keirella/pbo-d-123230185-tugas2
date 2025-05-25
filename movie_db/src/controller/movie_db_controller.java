package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.movie_db_model;
import dao.movie_db_implement;
import dao.movie_db_table;
import javax.swing.JTable;
import view.movie_db_view;

public class movie_db_controller {
    movie_db_view view;
    movie_db_implement dao;
    List<movie_db_model> data;

    public movie_db_controller(movie_db_view view) {
        this.view = view;
        dao = new movie_db_table();
        data = dao.getAll();
        addTableListener();
        isiTabel();
    }

    public void isiTabel() {
        List<movie_db_model> data = dao.getAll();
        view.setTableModel(data);
    }

    public void insert() {
        movie_db_model film = view.getForm();
        if (isValid(film)) {
            dao.insert(film);
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
        }
        isiTabel();
        view.clear();
    }

    public void update() {
        movie_db_model film = view.getForm();
        if (isValid(film)) {
            dao.update(film);
            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!");
        }
        isiTabel();
        view.clear();
    }

    public void delete() {
        int id = view.getSelectedId();
        if (id != -1) {
            dao.delete(id);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        } else {
            JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus!");
        }
        isiTabel();
        view.clear();
    }

    public void getDataField(int row) {
        movie_db_model film = data.get(row);
        JTable table = view.getTable_movie_db();

        film.setId((int) table.getValueAt(row, 0));
        film.setJudul((String) table.getValueAt(row, 1));
        film.setAlur((double) table.getValueAt(row, 2));
        film.setPenokohan((double) table.getValueAt(row, 3));
        film.setAkting((double) table.getValueAt(row, 4));
        view.setForm(film);
    }

    private boolean isValid(movie_db_model film) {
        if (film.getAlur() < 0 || film.getAlur() > 5) {
            JOptionPane.showMessageDialog(null, "Nilai alur harus antara 0 - 5");
            return false;
        }
        if (film.getPenokohan() < 0 || film.getPenokohan() > 5) {
            JOptionPane.showMessageDialog(null, "Nilai penokohan harus antara 0 - 5");
            return false;
        }
        if (film.getAkting() < 0 || film.getAkting() > 5) {
            JOptionPane.showMessageDialog(null, "Nilai akting harus antara 0 - 5");
            return false;
        }
        return true;
    }
   
    private void addTableListener() {
    view.getTable_movie_db().addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = view.getTable_movie_db().getSelectedRow();
            if (row >= 0 && row < data.size()) {
                movie_db_model film = data.get(row);
                view.setForm(film);
            }
        }
    });
}

    
}
