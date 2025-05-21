package es.ucm.fdi.appmovilandroid.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import es.ucm.fdi.appmovilandroid.model.DAO.CategoryDAO;
import es.ucm.fdi.appmovilandroid.model.DAO.LinkDAO;
import es.ucm.fdi.appmovilandroid.model.entities.Category;
import es.ucm.fdi.appmovilandroid.model.entities.Link;

@Database(entities = {Link.class, Category.class}, version=1)

public abstract class AppDataBase extends RoomDatabase{

    public abstract LinkDAO linkDao();
    public abstract CategoryDAO categoryDAO();

    public static AppDataBase instance;
    public static AppDataBase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context, AppDataBase.class, "myappdb")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
