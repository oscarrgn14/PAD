package es.ucm.fdi.appmovilandroid.model.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.ucm.fdi.appmovilandroid.model.entities.Category;


@Dao
public interface CategoryDAO {
    @Insert
    long insertCategory(Category category);

    @Update
    void updateCategory(Category category);

    @Delete
    void deleteCategory(Category category);

    @Query("SELECT * FROM category ORDER BY name ASC")
    List<Category> getAllCategories();

    @Query("SELECT * FROM category WHERE id = :categoryId")
    Category getCategoryById(long categoryId);

    @Query("SELECT COUNT(*) FROM category WHERE name = :name")
    int getCategoryCountByName(String name);
}
