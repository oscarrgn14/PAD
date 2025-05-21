package es.ucm.fdi.appmovilandroid.model.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.ucm.fdi.appmovilandroid.model.entities.Link;

@Dao
public interface LinkDAO {
    @Insert
    long insertLink(Link link);

    @Update
    void updateLink(Link link);

    @Delete
    void deleteLink(Link link);

    @Query("SELECT * FROM link ORDER BY title ASC")
    List<Link> getAllLinks();

    @Query("SELECT * FROM link WHERE category = :categoryId")
    List<Link> getLinksByCategory(long categoryId);

    @Query("SELECT * FROM link WHERE fav = 1")
    List<Link> getFavoriteLinks();

    @Query("SELECT * FROM link WHERE id = :linkId")
    Link getLinkById(long linkId);
}
