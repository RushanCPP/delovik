package com.example.delovik.backend.model.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.delovik.backend.model.database.dao.SchedulesDao;
import com.example.delovik.backend.model.database.entity.*;

@Database(entities = {Schedules.class,
                    Days.class,
                    Lessons.class,
                    Studies.class},
        version = 1)
public abstract class SchedulesDatabase extends RoomDatabase {
    public abstract SchedulesDao dao();
}
