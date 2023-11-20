package com.example.oop_cw_v1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event extends MainSchedule {
    private String eventType;


    public Event(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, Date scheduleDate, LocalDateTime scheduleTime, String eventType) {
        super(scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime);
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
