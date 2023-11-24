package com.example.oop_cw_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class DataBaseConnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/sacms";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    

    public static void insertEventData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleTime, String scheduleDescription, String eventType, String scheduleDate) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO event (scheduleId, scheduleName, scheduleLocation, scheduleTime, scheduleDescription, eventType, scheduleDate) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, scheduleId);
                preparedStatement.setString(2, scheduleName);
                preparedStatement.setString(3, scheduleLocation);
                preparedStatement.setString(4, scheduleTime);
                preparedStatement.setString(5, scheduleDescription);
                preparedStatement.setString(6, eventType);
                preparedStatement.setString(7, scheduleDate);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        }
    }


    public static void insertMeetingData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleTime, String scheduleDescription, String meetingType, String scheduleDate) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO meetings (scheduleId, scheduleName, scheduleLocation, scheduleTime, scheduleDescription, meetingType, scheduleDate) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, scheduleId);
                preparedStatement.setString(2, scheduleName);
                preparedStatement.setString(3, scheduleLocation);
                preparedStatement.setString(4, scheduleTime);
                preparedStatement.setString(5, scheduleDescription);
                preparedStatement.setString(6, meetingType);
                preparedStatement.setString(7, scheduleDate);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        }
    }


    public static void insertWorkshopData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleTime, String scheduleDescription, String conductor, String scheduleDate) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO workshops (scheduleId, scheduleName, scheduleLocation, scheduleTime, scheduleDescription, conductor, scheduleDate) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, scheduleId);
                preparedStatement.setString(2, scheduleName);
                preparedStatement.setString(3, scheduleLocation);
                preparedStatement.setString(4, scheduleTime);
                preparedStatement.setString(5, scheduleDescription);
                preparedStatement.setString(6, conductor);
                preparedStatement.setString(7, scheduleDate);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        }
    }





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



    public static Event searchEventById(String searchEventId) {
        return null;
    }

    public static void deleteEventData(String deleteEventId) {
    }

    public static void deleteEvent(String deleteEventId) {
    }



    public static Meeting searchMeetingById(String searchMeetingId) {
        return null;
    }

    public static void deleteMeetingData(String deleteMeetingId) {
    }

    public static void deleteMeeting(String deleteMeetingId) {
    }

    public static Workshop searchWorkshopById(String searchWorkshopId) {
        return null;
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
