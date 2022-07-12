package com.example.delovik.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private final List<Day> days;
    private String name;

    public List<Day> getDays() {
        return days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDay(Day day) {
        days.add(day);
    }

    public Schedule(String name) {
        this.name = name;
        days = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "days=" + days +
                ", name='" + name + '\'' +
                '}';
    }
}
