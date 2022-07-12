package com.example.delovik.backend.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.delovik.backend.model.Day;
import com.example.delovik.backend.model.Lesson;
import com.example.delovik.backend.model.Schedule;

import java.time.LocalTime;

public class ScheduleViewModel extends ViewModel {
    int id;
    private final MutableLiveData<Schedule> scheduleMutableLiveData = new MutableLiveData<>(getValue());
    private Schedule getValue() {
        Schedule schedule = new Schedule("Schedule 1");
        for (int i = 0; i < 2; ++i) {
            Day day = new Day();
            for (int j = 0; j < i + 1; ++j) {
                day.addLesson(new Lesson("Math", LocalTime.now(), LocalTime.now().plusSeconds(10)));
            }
            schedule.addDay(day);
        }
        return schedule;
    }

    public LiveData<Schedule> getScheduleMutableLiveData() {
        return scheduleMutableLiveData;
    }

    public void notifyChanges() {

    }
}
