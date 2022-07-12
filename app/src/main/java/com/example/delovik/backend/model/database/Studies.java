package com.example.delovik.backend.model.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "studies",
        foreignKeys = {
            @ForeignKey(entity = Lessons.class,
                        parentColumns = "id",
                        childColumns = "lesson_id"),
            @ForeignKey(entity = Days.class,
                        parentColumns = "id",
                        childColumns = "lesson_id")
        })
public class Studies {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name = "lesson_id")
    public int lessonId;
    @ColumnInfo(name = "day_id")
    public int dayId;

    @ColumnInfo(name = "order_in")
    public int orderIn;
}
