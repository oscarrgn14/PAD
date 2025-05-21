package es.ucm.fdi.appmovilandroid.model.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Video {
    @PrimaryKey
    private long id;

    private String yId;
    private String title;
    private String desc;
    private long category;
    private boolean fav;

    public Video() {}

    public Video(String yId, String title, String desc, long category, boolean fav) {
        this.yId = yId;
        this.title = title;
        this.desc = desc;
        this.category = category;
        this.fav = fav;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getyId() {
        return yId;
    }

    public void setyId(String yId) {
        this.yId = yId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getCategory() {
        return category;
    }

    public void setCategory(long category) {
        this.category = category;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
}
