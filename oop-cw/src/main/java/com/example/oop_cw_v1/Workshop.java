package com.example.oop_cw_v1;

import java.time.LocalDateTime;
import java.util.Date;

public class Workshop extends MainSchedule {
    private String conductor;

    public Workshop(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, Date scheduleDate, LocalDateTime scheduleTime, String conductor) {
        super(scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime);
        this.conductor = conductor;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
}