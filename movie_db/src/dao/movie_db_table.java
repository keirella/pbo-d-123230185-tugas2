package dao;

import java.sql.*;
import java.util.*;
import model.movie_db_model;
import helper.movie_db_helper;

public class movie_db_table implements movie_db_implement {
    Connection connection;

    public movie_db_table() {
        connection = movie_db_helper.getConnection();
    }

    @Override
    public void insert(movie_db_model movie) {
        String insert = "INSERT INTO movie_db (judul, alur, penokohan, akting, rating) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(insert);
            ps.setString(1, movie.getJudul());
            ps.setDouble(2, movie.getAlur());
            ps.setDouble(3, movie.getPenokohan());
            ps.setDouble(4, movie.getAkting());
            ps.setDouble(5, movie.getRating());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    @Override
    public void update(movie_db_model movie) {
        String update = "UPDATE movie_db SET judul=?, alur=?, penokohan=?, akting=?, rating=? WHERE id_movie=?";
        try {
            PreparedStatement ps = connection.prepareStatement(update);
            ps.setString(1, movie.getJudul());
            ps.setDouble(2, movie.getAlur());
            ps.setDouble(3, movie.getPenokohan());
            ps.setDouble(4, movie.getAkting());
            ps.setDouble(5, movie.getRating());
            ps.setInt(6, movie.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        String delete = "DELETE FROM movie_db WHERE id_movie=?";
        try {
            PreparedStatement ps = connection.prepareStatement(delete);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
        }
    }

    @Override
    public List<movie_db_model> getAll() {
        List<movie_db_model> list = new ArrayList<>();
        String sql = "SELECT * FROM movie_db";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                movie_db_model m = new movie_db_model();
                m.setId(rs.getInt("id_movie"));
                m.setJudul(rs.getString("judul"));
                m.setAlur(rs.getDouble("alur"));
                m.setPenokohan(rs.getDouble("penokohan"));
                m.setAkting(rs.getDouble("akting"));
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Select error: " + e.getMessage());
        }
        return list;
    }
}
