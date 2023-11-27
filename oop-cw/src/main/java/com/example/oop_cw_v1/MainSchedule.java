package com.example.oop_cw_v1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class MainSchedule {
    private  String  scheduleId;
    private String scheduleName;
    private String scheduleLocation;

    private String scheduleDescription;
    private String scheduleDate;
    private String scheduleTime;


    public static Event getEventDetailsById(String scheduleId){
        return DataBaseConnection.searchEventById(scheduleId);
    }

    public static Meeting getMeetingDetailsById(String meetingID){
        return DataBaseConnection.searchMeetingById(meetingID);
    }

    public static Workshop getWorkshopDetailsById(String scheduleId){
        return DataBaseConnection.searchWorkshopById(scheduleId);
    }



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

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(LocalDateTime scheduleTime) {
        this.scheduleTime = String.valueOf(scheduleTime);
    }



    public MainSchedule(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime) {
        this.scheduleId = scheduleId;
        this.scheduleName = scheduleName;
        this.scheduleLocation = scheduleLocation;
        this.scheduleDescription = scheduleDescription;
        this.scheduleDate = scheduleDate;
        this.scheduleTime = String.valueOf(scheduleTime);
    }




}