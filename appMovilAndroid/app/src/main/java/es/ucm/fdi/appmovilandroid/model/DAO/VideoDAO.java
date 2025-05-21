package es.ucm.fdi.appmovilandroid.model.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.ucm.fdi.appmovilandroid.model.entities.Video;

@Dao
public interface VideoDAO {

    @Insert
    long insertVideo(Video video);

    @Update
    void updateVideo(Video video);

    @Delete
    void deleteVideo(Video video);

    @Query("Select * from video")
    List<Video> getAllVideos();

    @Query("Select * from video where category = :catsId")
    List<Video> getVideosByCategory(long catsId);

    @Query("Select * from video where fav = 1")
    List<Video> getFavVideos();

    @Query("Select * from video where id = :videoId")
    Video getVideoById(long videoId);
}
