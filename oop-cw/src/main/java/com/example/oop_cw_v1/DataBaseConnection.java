//package com.example.oop_cw_v1;
//
//import java.sql.*;
//
//public class DataBaseConnection {
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/sacms";
//    private static final String DB_USER = "root";
//    private static final String DB_PASS = "";
//
//    public static void insertEventData(String eventId, String eventName, String eventLocation, String eventTime, String eventDescription, String eventDate) {
//        // Using try-with-resources to automatically close resources like Connection and Statement
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
//            // Prepare the SQL statement with placeholders
//            String sql = "INSERT INTO events (eventId, eventName, eventLocation, eventTime, eventDescription, eventDate) VALUES (?, ?, ?, ?, ?, ?)";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                // Set values for the placeholders
//                preparedStatement.setString(1, eventId);
//                preparedStatement.setString(2, eventName);
//                preparedStatement.setString(3, eventLocation);
//                preparedStatement.setString(4, eventTime);
//                preparedStatement.setString(5, eventDescription);
//                preparedStatement.setString(6, eventDate);
//
//                // Execute the update
//                preparedStatement.executeUpdate();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
//        }
//    }
//
//    public static Event searchEventById(String eventId) {
//        Event foundEvent = null;
//
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
//            String sql = "SELECT * FROM events WHERE eventId = ?";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                preparedStatement.setString(1, eventId);
//
//                try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                    if (resultSet.next()) {
//                        // Retrieve data from the result set and create an Event object
//                        String eventName = resultSet.getString("eventName");
//                        String eventLocation = resultSet.getString("eventLocation");
//                        String eventTime = resultSet.getString("eventTime");
//                        String eventDescription = resultSet.getString("eventDescription");
//                        String eventDate = resultSet.getString("eventDate");
//
//                        foundEvent = new Event(eventId, eventName, eventLocation, eventTime, eventDescription, eventDate);
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
//        }
//
//        return foundEvent;
//    }
//
//    public static void updateEventData(String eventId, String eventName, String location, String time, String description, String date) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
//            String sql = "UPDATE events SET eventName=?, location=?, time=?, description=?, date=? WHERE eventId=?";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                preparedStatement.setString(1, eventName);
//                preparedStatement.setString(2, location);
//                preparedStatement.setString(3, time);
//                preparedStatement.setString(4, description);
//                preparedStatement.setString(5, date);
//                preparedStatement.setString(6, eventId);
//
//                preparedStatement.executeUpdate();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
//        }
//    }
//
//
//
//    public static void deleteEvent(String deleteEventId) {
//    }
//}
