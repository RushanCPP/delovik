package com.example.delovik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.example.delovik.backend.viewmodel.ScheduleViewModel;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TEST
        ScheduleViewModel scheduleViewModel = new ViewModelProvider(this).get(ScheduleViewModel.class);
        ((TextView) findViewById(R.id.first_label)).setText(scheduleViewModel.getScheduleMutableLiveData().getValue().toString());
        // TEST
    }
}