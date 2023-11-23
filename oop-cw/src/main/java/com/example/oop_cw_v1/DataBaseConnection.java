package com.example.oop_cw_v1;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

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

    public static void insertEventData() {
    }
}
