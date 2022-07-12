package com.example.delovik.backend.model.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.delovik.backend.model.database.entity.Schedules;

import java.util.List;

@Dao
public interface SchedulesDao {
    @Query("SELECT * FROM schedules")
    List<Schedules> getAll();

    @Query("SELECT * FROM schedules WHERE id = :id")
    Schedules getById(int id);

    @Insert
    void insert(Schedules schedules);

    @Delete
    void delete(Schedules schedules);

    @Update
    void update(Schedules schedules);
}
