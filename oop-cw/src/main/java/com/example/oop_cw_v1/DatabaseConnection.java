package com.example.oop_cw_v1;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sacms";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    // insert data to student table in the database
    public static void insertStudentData(String studentID, String firstName, String lastName, String DoB, String email, String password, String contactNumber, String gender) {
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
    public static void insertAdvisorData(String advisorID, String firstName, String lastName, String DoB, String email, String password, String contactNumber, String gender) {
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
    public List<String> fetchDataForComboBox(String query) {
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

            while (resultSet.next()) {
                eventData.add(resultSet.getString("event_name"));
            }
            connection.close();
        } catch (SQLException e) {
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
            String query = "SELECT s.student_id, s.first_name, s.last_name, FALSE as attendance FROM student s JOIN join_club jc ON s.student_id = jc.student_id JOIN club cl ON cl.club_id = jc.club_id WHERE cl.club_name = ?";

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

    // New method to fetch student details based on the selected club and event
    public List<AttendanceData> fetchStudentDetails(String selectedClub, String selectedEvent, String eventID) {
        List<AttendanceData> studentDetails = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            // Prepare a query to fetch student details based on the selected club and event
            String query = "SELECT s.student_id, s.first_name, s.last_name, FALSE as attendance FROM student s JOIN join_club jc ON s.student_id = jc.student_id JOIN club cl ON cl.club_id = jc.club_id JOIN club_event ce ON ce.club_id = cl.club_id WHERE cl.club_name = ? AND ce.event_name = ? AND ce.event_id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, selectedClub);
            preparedStatement.setString(2, selectedEvent);
            preparedStatement.setString(3, eventID);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String studentID = resultSet.getString("student_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                boolean attendance = resultSet.getBoolean("attendance");

                AttendanceData attendanceData = new AttendanceData(studentID, firstName, lastName, attendance, eventID);
                studentDetails.add(attendanceData);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentDetails;
    }

    //fetching the eventID based on club and event name
    public String fetchEventID(String selectedClub, String selectedEvent) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            // Prepare a query to fetch the event ID based on the selected club and event name
            String query = "SELECT event_id FROM club_event ce JOIN club c ON c.club_id = ce.club_id WHERE c.club_name = ? AND ce.event_name = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, selectedClub);
            preparedStatement.setString(2, selectedEvent);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String eventID = resultSet.getString("event_id");
                connection.close();
                return eventID;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean saveAttendance(List<AttendanceData> attendanceDataList) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String query = "INSERT INTO attendance (student_id, event_id, attendance_date, is_present) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            for (AttendanceData data : attendanceDataList) {
                preparedStatement.setString(1, data.getStudentID());
                preparedStatement.setString(2, data.getEventID());
                preparedStatement.setDate(3, java.sql.Date.valueOf(LocalDate.now())); // Assuming today's date
                preparedStatement.setBoolean(4, data.getAttendance());

                preparedStatement.addBatch();
            }

            // if attendance is duplicated
            int[] results;
            try {
                results = preparedStatement.executeBatch();
            } catch (BatchUpdateException batchUpdateException) {
                // Handle duplicate entry error
                System.out.println("Warning: Attendance already exists for some students in the selected event.");
                return false;
            }

            connection.close();

            // Check if any rows were affected
            for (int result : results) {
                if (result <= 0) {
                    return false;
                }
            }

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<AttendanceData> getAllAttendanceData() {
        List<AttendanceData> allAttendanceData = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             Statement statement = connection.createStatement()) {

            // Execute a SQL query to retrieve all attendance data
            String query = "SELECT attendance.attendance_date, attendance.event_id, club_event.event_name, attendance.student_id,student.first_name,student.last_name,attendance.is_present FROM `attendance`JOIN`club_event` ON attendance.event_id = club_event.event_id JOIN `student` ON attendance.student_id = student.student_id ORDER BY `attendance`.`attendance_date` ASC;";
            ResultSet resultSet = statement.executeQuery(query);

            // Iterate through the result set and populate the list
            while (resultSet.next()) {
                AttendanceData attendanceData = new AttendanceData();
                attendanceData.setAttendance_date(resultSet.getDate("attendance_date"));
                // Set other properties based on your table columns

                allAttendanceData.add(attendanceData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately in your application
        }

        return allAttendanceData;
    }
}




