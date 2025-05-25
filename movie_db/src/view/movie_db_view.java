package view;

import javax.swing.JTable;
import javax.swing.JTextField;
import controller.movie_db_controller;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.movie_db_model;

public class movie_db_view extends javax.swing.JFrame {

    movie_db_controller movieController;
    
    public movie_db_view() {
        initComponents();
        movieController = new movie_db_controller(this);
        movieController.isiTabel(); // Panggil isiTabel dari controller biar tabel langsung terisi

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_movie_db = new javax.swing.JTable();
        jLabeljudul = new javax.swing.JLabel();
        jTextjudul = new javax.swing.JTextField();
        jLabelalur = new javax.swing.JLabel();
        jTextalur = new javax.swing.JTextField();
        jLabelpenokohan = new javax.swing.JLabel();
        jTextpenokohan = new javax.swing.JTextField();
        jLabelakting = new javax.swing.JLabel();
        jTextakting = new javax.swing.JTextField();
        Tambah = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_movie_db.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_movie_db);

        jLabeljudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabeljudul.setText("Judul");

        jLabelalur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelalur.setText("Alur");

        jLabelpenokohan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelpenokohan.setText("Penokohan");

        jLabelakting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelakting.setText("Akting");

        Tambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextpenokohan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jTextalur, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabeljudul, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelalur, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelpenokohan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelakting, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextjudul, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextakting))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(Delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabeljudul)
                        .addGap(12, 12, 12)
                        .addComponent(jTextjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelalur)
                        .addGap(15, 15, 15)
                        .addComponent(jTextalur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelpenokohan)
                        .addGap(15, 15, 15)
                        .addComponent(jTextpenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelakting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextakting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Tambah)
                        .addGap(18, 18, 18)
                        .addComponent(Update)
                        .addGap(18, 18, 18)
                        .addComponent(Delete)
                        .addGap(18, 18, 18)
                        .addComponent(Clear))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        movieController.insert();
        movieController.isiTabel();
        clearField();
    }//GEN-LAST:event_TambahActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        movieController.update();
        movieController.isiTabel();
        clearField();
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        movieController.delete();
        movieController.isiTabel();
        clearField();
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void table_movie_dbMouseClicked(java.awt.event.MouseEvent evt) {                                            
        int row = table_movie_db.getSelectedRow();
        jTextjudul.setText(table_movie_db.getValueAt(row, 0).toString());
        jTextalur.setText(table_movie_db.getValueAt(row, 1).toString());
        jTextpenokohan.setText(table_movie_db.getValueAt(row, 2).toString());
        jTextakting.setText(table_movie_db.getValueAt(row, 3).toString());
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movie_db_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabelakting;
    private javax.swing.JLabel jLabelalur;
    private javax.swing.JLabel jLabeljudul;
    private javax.swing.JLabel jLabelpenokohan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextakting;
    private javax.swing.JTextField jTextalur;
    private javax.swing.JTextField jTextjudul;
    private javax.swing.JTextField jTextpenokohan;
    private javax.swing.JTable table_movie_db;
    // End of variables declaration//GEN-END:variables

    public Object getTable_data() {
        return table_movie_db;
    }
    
    public void setTable_data(JTable table_movie_db) {
        this.table_movie_db = table_movie_db;
    }

    public void setTableModel(List<movie_db_model> data) {
        DefaultTableModel model = new DefaultTableModel(new Object[]{
            "ID", "Judul", "Alur", "Penokohan", "Akting", "Rating"
        }, 0);

        for (movie_db_model m : data) {
            Object[] row = new Object[]{
                m.getId(), m.getJudul(), m.getAlur(), m.getPenokohan(), m.getAkting(), m.getRating()
            };
            model.addRow(row);
        }
        table_movie_db.setModel(model);

        // sembunyiin kolom id biar gak keliatan
        table_movie_db.getColumnModel().getColumn(0).setMinWidth(0);
        table_movie_db.getColumnModel().getColumn(0).setMaxWidth(0);
        table_movie_db.getColumnModel().getColumn(0).setWidth(0);
        table_movie_db.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void setForm(movie_db_model film) {
        jTextjudul.setText(film.getJudul());
        jTextalur.setText(String.valueOf(film.getAlur()));
        jTextpenokohan.setText(String.valueOf(film.getPenokohan()));
        jTextakting.setText(String.valueOf(film.getAkting()));
    }
    
    public movie_db_model getForm() {
        movie_db_model film = new movie_db_model();
        // id diambil dari selected row 
        int selectedRow = table_movie_db.getSelectedRow();
        if (selectedRow >= 0) {
            Object idValue = table_movie_db.getValueAt(selectedRow, 0);
            film.setId(idValue != null ? (int) idValue : 0);
        } else {
            film.setId(0); // 0 untuk id baru
        }

        film.setJudul(jTextjudul.getText());
        try {
            film.setAlur(Double.parseDouble(jTextalur.getText()));
            film.setPenokohan(Double.parseDouble(jTextpenokohan.getText()));
            film.setAkting(Double.parseDouble(jTextakting.getText()));
        } catch (NumberFormatException e) {
            film.setAlur(0);
            film.setPenokohan(0);
            film.setAkting(0);
        }
        return film;
    }

    public void clear() {
        jTextjudul.setText("");
        jTextalur.setText("");
        jTextpenokohan.setText("");
        jTextakting.setText("");
        table_movie_db.clearSelection();
    }

    public int getSelectedId() {
        int selectedRow = table_movie_db.getSelectedRow();
        if (selectedRow >= 0) {
            Object idValue = table_movie_db.getValueAt(selectedRow, 0);
            if (idValue != null) {
                return (int) idValue;
            }
        }
        return -1;
    }

    private void clearField() {
        jTextjudul.setText("");
        jTextalur.setText("");
        jTextpenokohan.setText("");
        jTextakting.setText("");
    }

    public JTextField getjTextakting() {
        return jTextakting;
    }

    public void setjTextakting(JTextField jTextakting) {
        this.jTextakting = jTextakting;
    }

    public JTextField getjTextalur() {
        return jTextalur;
    }

    public void setjTextalur(JTextField jTextalur) {
        this.jTextalur = jTextalur;
    }

    public JTextField getjTextjudul() {
        return jTextjudul;
    }

    public void setjTextjudul(JTextField jTextjudul) {
        this.jTextjudul = jTextjudul;
    }

    public JTextField getjTextpenokohan() {
        return jTextpenokohan;
    }

    public void setjTextpenokohan(JTextField jTextpenokohan) {
        this.jTextpenokohan = jTextpenokohan;
    }

    public JTable getTable_movie_db() {
        return table_movie_db;
    }

    public void setTable_movie_db(JTable table_movie_db) {
        this.table_movie_db = table_movie_db;
    }
    
    
}
