package com.example.oop_cw_v1;

import javafx.scene.control.Alert;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBaseConnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/sacms";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";


    public static void insertEventData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime, String eventType) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO event (scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate , scheduleTime, eventType) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, scheduleId);
                preparedStatement.setString(2, scheduleName);
                preparedStatement.setString(3, scheduleLocation);
                preparedStatement.setString(4, scheduleDescription);
                preparedStatement.setString(5, scheduleDate);
                preparedStatement.setString(6, scheduleTime);
                preparedStatement.setString(7, eventType);

                preparedStatement.executeUpdate();
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        }
    }


    public static void insertMeetingData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime, String meetingType) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO meeting (scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime,  meetingType ) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, scheduleId);
                preparedStatement.setString(2, scheduleName);
                preparedStatement.setString(3, scheduleLocation);
                preparedStatement.setString(4, scheduleDescription);
                preparedStatement.setString(5, scheduleDate);
                preparedStatement.setString(6, scheduleTime);
                preparedStatement.setString(7, meetingType);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        }
    }


    public static void insertWorkshopData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime, String conductor) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO workshop (scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime,  conductor ) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, scheduleId);
                preparedStatement.setString(2, scheduleName);
                preparedStatement.setString(3, scheduleLocation);
                preparedStatement.setString(4, scheduleDescription);
                preparedStatement.setString(5, scheduleDate);
                preparedStatement.setString(6, scheduleTime);
                preparedStatement.setString(7, conductor);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        }
    }


    public static Event searchEventById(String scheduleId) {
        // You need to implement this method to query the database and return the Event
        // You can use JDBC to execute a SELECT query and retrieve the details

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Event foundEvent = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            String sql = "SELECT * FROM event WHERE scheduleId = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, scheduleId);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Create an Event object with retrieved data
                foundEvent = new Event(
                        resultSet.getString("scheduleId"),
                        resultSet.getString("scheduleName"),
                        resultSet.getString("scheduleLocation"),
                        resultSet.getString("scheduleDescription"),
                        resultSet.getString("scheduleDate"),
                        resultSet.getString("scheduleTime"),
                        resultSet.getString("eventType")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }

        return foundEvent;
    }


    public static Meeting searchMeetingById(String scheduleId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Meeting foundMeeting = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            String sql = "SELECT * FROM meeting WHERE scheduleId = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, scheduleId);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Create a Meeting object with retrieved data
                foundMeeting = new Meeting(
                        resultSet.getString("scheduleId"),
                        resultSet.getString("scheduleName"),
                        resultSet.getString("scheduleLocation"),
                        resultSet.getString("scheduleDescription"),
                        resultSet.getString("scheduleDate"),
                        resultSet.getString("scheduleTime"),
                        resultSet.getString("meetingType")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }

        return foundMeeting;
    }

    public static Workshop searchWorkshopById(String scheduleId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Workshop foundWorkshop = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            String sql = "SELECT * FROM workshop WHERE scheduleId = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, scheduleId);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Create a Workshop object with retrieved data
                foundWorkshop = new Workshop(
                        resultSet.getString("scheduleId"),
                        resultSet.getString("scheduleName"),
                        resultSet.getString("scheduleLocation"),
                        resultSet.getString("scheduleDescription"),
                        resultSet.getString("scheduleDate"),
                        resultSet.getString("scheduleTime"),
                        resultSet.getString("conductor")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }

        return foundWorkshop;
    }


    public static void updateEventData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime, String eventType) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Check if the updated event ID is different and already exists in the database
            if (!scheduleId.equals(getOriginalScheduleIdEvent(scheduleId, connection)) && !isEventIdUnique(scheduleId, connection)) {
                // Display an alert or handle the case where the new event ID is not unique
                showAlert("Duplicate Event ID", "Event ID must be unique. Please choose a different Event ID.");
                return;
            }

            String sql = "UPDATE event SET scheduleId=?, scheduleName=?, scheduleLocation=?, scheduleDescription=?, scheduleDate=?, scheduleTime=?, eventType=? WHERE scheduleId=?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, scheduleId);
            preparedStatement.setString(2, scheduleName);
            preparedStatement.setString(3, scheduleLocation);
            preparedStatement.setString(4, scheduleDescription);
            preparedStatement.setString(5, scheduleDate);
            preparedStatement.setString(6, scheduleTime);
            preparedStatement.setString(7, eventType);
            preparedStatement.setString(8, scheduleId); // Set original scheduleId in the WHERE clause

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }
    }

    // Get the original scheduleId for event
    private static String getOriginalScheduleIdEvent(String newScheduleId, Connection connection) throws SQLException {
        String originalScheduleId = null;
        String sql = "SELECT scheduleId FROM event WHERE scheduleId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, newScheduleId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    originalScheduleId = resultSet.getString("scheduleId");
                }
            }
        }
        return originalScheduleId;
    }

    // Check if the given event ID is unique in the event table
    private static boolean isEventIdUnique(String eventId, Connection connection) throws SQLException {
        String sql = "SELECT COUNT(*) FROM event WHERE scheduleId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, eventId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                return resultSet.getInt(1) == 0;
            }
        }
    }


    private static void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void updateMeetingData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime, String meetingType) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Check if the updated meeting ID is different and already exists in the database
            if (!scheduleId.equals(getOriginalScheduleId(scheduleId, connection)) && !isMeetingIdUnique(scheduleId, connection)) {
                // Display an alert or handle the case where the new meeting ID is not unique
                showAlert("Duplicate Meeting ID", "Meeting ID must be unique. Please choose a different Meeting ID.");
                return;
            }

            String sql = "UPDATE meeting SET scheduleId=?, scheduleName=?, scheduleLocation=?, scheduleDescription=?, scheduleDate=?, scheduleTime=?, meetingType=? WHERE scheduleId=?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, scheduleId);
            preparedStatement.setString(2, scheduleName);
            preparedStatement.setString(3, scheduleLocation);
            preparedStatement.setString(4, scheduleDescription);
            preparedStatement.setString(5, scheduleDate);
            preparedStatement.setString(6, scheduleTime);
            preparedStatement.setString(7, meetingType);
            preparedStatement.setString(8, scheduleId); // Set original scheduleId in the WHERE clause

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }
    }

    public static boolean isMeetingIdUnique(String scheduleId, Connection connection) throws SQLException {
        String sql = "SELECT COUNT(*) FROM meeting WHERE scheduleId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, scheduleId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                return resultSet.getInt(1) == 0;
            }
        }
    }

    public static String getOriginalScheduleId(String newScheduleId, Connection connection) throws SQLException {
        String originalScheduleId = null;
        String sql = "SELECT scheduleId FROM meeting WHERE scheduleId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, newScheduleId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    originalScheduleId = resultSet.getString("scheduleId");
                }
            }
        }
        return originalScheduleId;
    }


    public static void updateWorkshopData(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, String scheduleDate, String scheduleTime, String conductor) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Check if the updated workshop ID is different and already exists in the database
            if (!scheduleId.equals(getOriginalScheduleIdWorkshop(scheduleId, connection)) && !isWorkshopIdUnique(scheduleId, connection)) {
                // Display an alert or handle the case where the new workshop ID is not unique
                showAlert("Duplicate Workshop ID", "Workshop ID must be unique. Please choose a different Workshop ID.");
                return;
            }

            String sql = "UPDATE workshop SET scheduleId=?, scheduleName=?, scheduleLocation=?, scheduleDescription=?, scheduleDate=?, scheduleTime=?, conductor=? WHERE scheduleId=?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, scheduleId);
            preparedStatement.setString(2, scheduleName);
            preparedStatement.setString(3, scheduleLocation);
            preparedStatement.setString(4, scheduleDescription);
            preparedStatement.setString(5, scheduleDate);
            preparedStatement.setString(6, scheduleTime);
            preparedStatement.setString(7, conductor);
            preparedStatement.setString(8, scheduleId); // Set original scheduleId in the WHERE clause

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }
    }

    public static String getOriginalScheduleIdWorkshop(String newScheduleId, Connection connection) throws SQLException {
        String originalScheduleId = null;
        String sql = "SELECT scheduleId FROM workshop WHERE scheduleId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, newScheduleId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    originalScheduleId = resultSet.getString("scheduleId");
                }
            }
        }
        return originalScheduleId;
    }

    public static boolean isWorkshopIdUnique(String scheduleId, Connection connection) throws SQLException {
        String sql = "SELECT COUNT(*) FROM workshop WHERE scheduleId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, scheduleId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                return resultSet.getInt(1) == 0;
            }
        }
    }

    public static void deleteEventData(String scheduleId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Delete event details associated with the given event ID
            String sql = "DELETE FROM event WHERE scheduleId=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, scheduleId);
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Event details deleted successfully.");
            } else {
                System.out.println("No event details found with ID: " + scheduleId);
            }

            // Optionally, you can also delete other related tables if needed

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }
    }


    public static void deleteMeetingData(String scheduleId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Delete event details associated with the given event ID
            String sql = "DELETE FROM meeting WHERE scheduleId=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, scheduleId);
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Event details deleted successfully.");
            } else {
                System.out.println("No event details found with ID: " + scheduleId);
            }

            // Optionally, you can also delete other related tables if needed

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }
    }


    public static void deleteWorkshopData(String scheduleId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Delete event details associated with the given event ID
            String sql = "DELETE FROM workshop WHERE scheduleId=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, scheduleId);
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Event details deleted successfully.");
            } else {
                System.out.println("No event details found with ID: " + scheduleId);
            }

            // Optionally, you can also delete other related tables if needed

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately (log it, throw a custom exception, etc.)
            }
        }
    }

    //  1
    public static List<Event> getEventData() {  // new one for getting event data for the table
        List<Event> eventData = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            String sql = "SELECT * FROM event";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Event event = new Event(
                        resultSet.getString("scheduleId"),
                        resultSet.getString("scheduleName"),
                        resultSet.getString("scheduleLocation"),
                        resultSet.getString("scheduleDescription"),
                        resultSet.getString("scheduleDate"),
                        resultSet.getString("scheduleTime"),
                        resultSet.getString("eventType")
                );
                eventData.add(event);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log it, show an error message, etc.)
        }

        return eventData;
    }


   }