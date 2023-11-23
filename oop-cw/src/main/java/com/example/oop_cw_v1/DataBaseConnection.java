package com.example.oop_cw_v1;

import java.time.LocalDate;

public class DataBaseConnection {

    private static final String JDBC_URL = "jdbc:mysql:sacms";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";




    public static void deleteEventById(String eventIdToDelete) {
    }


    public static Meeting getMeetingById(String meetingId) {


        return null;
    }

    public static void updateMeetingInDatabase(Meeting updatedMeeting) {
    }

    public static void deleteMeetingById(String meetingIdToDelete) {
    }

    public static Workshop getWorkshopById(String workshopId) {
        return null;
    }

    public static void updateWorkshopInDatabase(Workshop updatedWorkshop) {
    }

    public static void deleteWorkshopById(String workshopIdToDelete) {
    }

    public static void insertEventData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleTime, String scheduleDescription, String eventType, String time) {
    }

    public static Event searchEventById(String searchEventId) {
    }

    public static void deleteEventData(String deleteEventId) {
    }

    public static void deleteEvent(String deleteEventId) {
    }

    public static void insertMeetingData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleTime, String scheduleDescription, String meetingType, String scheduleTime1) {
    }

    public static Meeting searchMeetingById(String searchMeetingId) {
    }

    public static void deleteMeetingData(String deleteMeetingId) {
    }

    public static void deleteMeeting(String deleteMeetingId) {
    }

    public static Workshop searchWorkshopById(String searchWorkshopId) {
    }

    public static void deleteWorkshopData(String deleteWorkshopId) {
    }

    public static void deleteWorkshop(String deleteWorkshopId) {
    }

    public static void updateEventData(String eventId, String eventName, String location, String time, String description, String eventType, String eventDate) {
    }

    public static void updateMeetingData(String meetingId, String meetingName, String location, String time, String description, String meetingType, LocalDate date) {
    }

    public static void updateWorkshopData(String workshopId, String workshopName, String workshopLocation, String workshopTime, String workshopDescription, String workshopConductor, String date) {
    }
}
