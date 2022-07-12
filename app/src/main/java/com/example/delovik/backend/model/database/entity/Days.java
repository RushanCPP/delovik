package com.example.delovik.backend.model.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "days", foreignKeys = {
        @ForeignKey(entity = Schedules.class,
                    parentColumns = "id",
                    childColumns = "schedules_id")
})
public class Days {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name = "schedule_id")
    public int scheduleId;

    @ColumnInfo(name = "order_in")
    public int orderIn;
}
