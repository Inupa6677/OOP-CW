package com.example.oop_cw_v1;

import javafx.scene.control.TextField;

import java.time.LocalDateTime;
import java.util.Date;

public class Event extends MainSchedule {
    private String eventType;

    public Event(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, Date scheduleDate, LocalDateTime localDateTime, String scheduleTime) {
        super(scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, LocalDateTime.parse(scheduleTime));
        this.eventType = getEventType();
    }


    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
