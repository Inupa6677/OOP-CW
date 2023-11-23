package com.example.oop_cw_v1;

import java.time.LocalDateTime;
import java.util.Date;

public class Meeting extends MainSchedule {
    private String meetingType;


    public Meeting(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime) {
        super(scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime);
        this.meetingType = getMeetingType();
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }
}
