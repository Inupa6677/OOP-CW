package com.example.oop_cw_v1;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;

public abstract class MainSchedule {
    private  String  scheduleId;
    private String scheduleName;
    private String scheduleLocation;

    private String scheduleDescription;
    private Date scheduleDate;
    private LocalDateTime scheduleTime;

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public String getScheduleLocation() {
        return scheduleLocation;
    }

    public void setScheduleLocation(String scheduleLocation) {
        this.scheduleLocation = scheduleLocation;
    }

    public String getScheduleDescription() {
        return scheduleDescription;
    }

    public void setScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public LocalDateTime getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(LocalDateTime scheduleTime) {
        this.scheduleTime = scheduleTime;
    }



    public MainSchedule(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, Date scheduleDate, LocalDateTime scheduleTime) {
        this.scheduleId = scheduleId;
        this.scheduleName = scheduleName;
        this.scheduleLocation = scheduleLocation;
        this.scheduleDescription = scheduleDescription;
        this.scheduleDate = scheduleDate;
        this.scheduleTime = scheduleTime;
    }




}
