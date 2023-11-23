package com.example.oop_cw_v1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sacms";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    // insert data to student table in the database
    public static void insertStudentData(String studentID,String firstName, String lastName, String DoB, String email, String password, String contactNumber, String gender) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String insertQuery = "INSERT INTO student (student_id,first_name,last_name,dob,email,password,contact_number,gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, studentID);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, DoB);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, password);
            preparedStatement.setString(7, contactNumber);
            preparedStatement.setString(8, gender);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Data insertion failed.");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // inserting data to advisor table in the database
    public static void insertAdvisorData(String advisorID,String firstName, String lastName, String DoB, String email, String password, String contactNumber, String gender) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String insertQuery = "INSERT INTO advisor (advisor_id,first_name,last_name,dob,email,password,contact_number,gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, advisorID);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, DoB);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, password);
            preparedStatement.setString(7, contactNumber);
            preparedStatement.setString(8, gender);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Data insertion failed.");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // retrieving data from student to check the user credential.
    public static boolean checkStudentLogin(String inputEmail, String inputPassword) {
        String insertQuery = "SELECT email, password FROM student WHERE email = ?";

        try (
                Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)
        ) {
            preparedStatement.setString(1, inputEmail);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // User found, check the password
                    String storedPassword = resultSet.getString("password");
                    return storedPassword.equals(inputPassword);
                } else {
                    // User not found
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;

        }

    }

    // retrieving data from advisor to check the user credential.
    public static boolean checkAdvisorLogin(String inputEmail, String inputPassword) {
        String insertQuery = "SELECT email, password FROM advisor WHERE email = ?";

        try (
                Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)
        ) {
            preparedStatement.setString(1, inputEmail);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // User found, check the password
                    String storedPassword = resultSet.getString("password");
                    return storedPassword.equals(inputPassword);
                } else {
                    // User not found
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;

        }

    }



    public static void displayTabels() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement statement = connection.createStatement();

            // SQL query to list all databases
            String sql = "SHOW DATABASES";

            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("List of MySQL databases:");
            while (resultSet.next()) {
                String dbName = resultSet.getString("Database");
                System.out.println(dbName);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //Getting data to combobox in the attendance
    public List<String> fetchDataForComboBox(String query){
        List<String> data = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                data.add(resultSet.getString(1));
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    //get relevant events for the selected club
    public List<String> fetchEventsForComboBox(String selectedClub) {
        List<String> eventData = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            //query to fetch events based on the selected club
            String query = "SELECT ce.event_name FROM club_event ce JOIN club c ON c.club_id = ce.club_id WHERE c.club_name = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, selectedClub);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                eventData.add(resultSet.getString("event_name"));
            }
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return eventData;
    }

    //getting student info to tableview of attendance track
    public List<AttendanceData> fetchStudentDetails(String selectedClub) {
        List<AttendanceData> studentDetails = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            // Prepare a query to fetch student details based on the selected club
            String query = "SELECT s.student_id, s.first_name, s.last_name FROM student s JOIN join_club jc ON s.student_id = jc.student_id JOIN club cl ON cl.club_id = jc.club_id WHERE cl.club_name = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, selectedClub);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String studentID = resultSet.getString("student_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                boolean attendance = resultSet.getBoolean("attendance");

                AttendanceData attendanceData = new AttendanceData(studentID, firstName, lastName, attendance);
                studentDetails.add(attendanceData);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentDetails;
    }

}




