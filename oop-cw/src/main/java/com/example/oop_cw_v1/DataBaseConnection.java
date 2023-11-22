package com.example.oop_cw_v1;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

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


    public static void saveMeetingToDatabase(Meeting meeting) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO your_meeting_table (scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime, meetingType) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, meeting.getScheduleId());
                preparedStatement.setString(2, meeting.getScheduleName());
                preparedStatement.setString(3, meeting.getScheduleLocation());
                preparedStatement.setString(4, meeting.getScheduleDescription());
                preparedStatement.setDate(5, new java.sql.Date(meeting.getScheduleDate().getTime()));
                preparedStatement.setTimestamp(6, java.sql.Timestamp.valueOf(meeting.getScheduleTime()));
                preparedStatement.setString(7, meeting.getMeetingType());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception properly in your application
        }
    }


    public static void saveWorkshopToDatabase(Workshop workshop) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO your_workshop_table (scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime, workshopConductor) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, workshop.getScheduleId());
                preparedStatement.setString(2, workshop.getScheduleName());
                preparedStatement.setString(3, workshop.getScheduleLocation());
                preparedStatement.setString(4, workshop.getScheduleDescription());
                preparedStatement.setDate(5, new java.sql.Date(workshop.getScheduleDate().getTime()));
                preparedStatement.setTimestamp(6, java.sql.Timestamp.valueOf(workshop.getScheduleTime()));
                preparedStatement.setString(7, workshop.getWorkshopConductor());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception properly in your application
        }
    }


    public static void saveGameToDatabase(Game game) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO your_game_table (scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime, gameReward) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, game.getScheduleId());
                preparedStatement.setString(2, game.getScheduleName());
                preparedStatement.setString(3, game.getScheduleLocation());
                preparedStatement.setString(4, game.getScheduleDescription());
                preparedStatement.setDate(5, new java.sql.Date(game.getScheduleDate().getTime()));
                preparedStatement.setTimestamp(6, java.sql.Timestamp.valueOf(game.getScheduleTime()));
                preparedStatement.setString(7, game.getGameReward());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception properly in your application
        }

    }

    public static Event getEventById(String eventId) {
        Event event = null;

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "SELECT * FROM your_event_table WHERE scheduleId = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, eventId);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Retrieve data from the result set and create an Event object
                        String scheduleName = resultSet.getString("scheduleName");
                        String scheduleLocation = resultSet.getString("scheduleLocation");
                        String scheduleDescription = resultSet.getString("scheduleDescription");
                        Date scheduleDate = resultSet.getDate("scheduleDate");
                        LocalDateTime scheduleTime = resultSet.getTimestamp("scheduleTime").toLocalDateTime();
                        String eventType = resultSet.getString("eventType");

                        event = new Event(eventId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime, eventType);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception properly in your application
        }

        return event;
    }

    public static void updateEventInDatabase(Event updatedEvent) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "UPDATE your_event_table SET scheduleName = ?, scheduleLocation = ?, scheduleDescription = ?, scheduleDate = ?, scheduleTime = ?, eventType = ? WHERE scheduleId = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, updatedEvent.getScheduleName());
                preparedStatement.setString(2, updatedEvent.getScheduleLocation());
                preparedStatement.setString(3, updatedEvent.getScheduleDescription());
                preparedStatement.setDate(4, new java.sql.Date(updatedEvent.getScheduleDate().getTime()));
                preparedStatement.setTimestamp(5, Timestamp.valueOf(updatedEvent.getScheduleTime()));
                preparedStatement.setString(6, updatedEvent.getEventType());
                preparedStatement.setString(7, updatedEvent.getScheduleId());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception properly in your application
        }
    }


    public static void deleteEventById(String eventIdToDelete) {
    }


    public static Meeting getMeetingById(String meetingId) {
    }

    public static void updateMeetingInDatabase(Meeting updatedMeeting) {
    }

    public static void deleteMeetingById(String meetingIdToDelete) {
    }

    public static Workshop getWorkshopById(String workshopId) {
    }

    public static void updateWorkshopInDatabase(Workshop updatedWorkshop) {
    }

    public static void deleteWorkshopById(String workshopIdToDelete) {
    }
}
