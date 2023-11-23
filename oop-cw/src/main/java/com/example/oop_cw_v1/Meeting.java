package com.example.oop_cw_v1;

public class Meeting extends MainSchedule {
    private String meetingType;


    public Meeting(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime, String meetingDate) {
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
