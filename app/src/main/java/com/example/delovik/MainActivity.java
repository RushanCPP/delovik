package com.example.delovik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.os.Bundle;
import android.widget.TextView;

import com.example.delovik.backend.model.database.SchedulesDatabase;
import com.example.delovik.backend.model.database.entity.Schedules;
import com.example.delovik.backend.viewmodel.ScheduleViewModel;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TEST
        ScheduleViewModel scheduleViewModel = new ViewModelProvider(this).get(ScheduleViewModel.class);
        SchedulesDatabase database =
                Room.databaseBuilder(
                        getApplicationContext(),
                        SchedulesDatabase.class,
                        "database")
                        .build();
        // TEST
    }
}