package com.example.oop_cw_v1;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnection {

    private static final String JDBC_URL = "jdbc:mysql://your_database_url";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void saveEventToDatabase(Event event) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO your_event_table (scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime, eventType) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, event.getScheduleId());
                preparedStatement.setString(2, event.getScheduleName());
                preparedStatement.setString(3, event.getScheduleLocation());
                preparedStatement.setString(4, event.getScheduleDescription());
                preparedStatement.setDate(5, new java.sql.Date(event.getScheduleDate().getTime()));
                preparedStatement.setTimestamp(6, Timestamp.valueOf(event.getScheduleTime()));
                preparedStatement.setString(7, event.getEventType());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception properly in your application
        }
    }
}
