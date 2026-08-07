package com.fb.beans;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class Reminder {
    @Value("${id}")
    private int id;
    @Value("${description}")
    private String description;
    @Value("${priority}")
    private int priority;
    @Autowired
    private Calendar reminderDateTime;

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", reminderDateTime=" + reminderDateTime.getTime() +
                '}';
    }
}
