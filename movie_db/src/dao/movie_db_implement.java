package dao;

import java.util.List;
import model.movie_db_model;

public interface movie_db_implement {
    void insert(movie_db_model movie);
    void update(movie_db_model movie);
    void delete(int id);
    List<movie_db_model> getAll();
}
