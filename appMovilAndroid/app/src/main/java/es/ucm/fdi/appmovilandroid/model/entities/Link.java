package es.ucm.fdi.appmovilandroid.model.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Link {
    @PrimaryKey
    private long id;

    private String title;
    private String url;
    private long category;
    private boolean fav;

    public Link() {}

    public Link(boolean fav, long category, String url, String title) {
        this.fav = fav;
        this.category = category;
        this.url = url;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCategory() {
        return category;
    }

    public void setCategory(long category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
}
