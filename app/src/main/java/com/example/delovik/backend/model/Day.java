package com.example.delovik.backend.model;


import java.util.ArrayList;
import java.util.List;

public class Day {
    private final List<Lesson> lessons;

    public Day() {
        lessons = new ArrayList<>();
    }

    public Day(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    @Override
    public String toString() {
        return "Day{" +
                "lessons=" + lessons +
                '}';
    }
}
