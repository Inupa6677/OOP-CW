package com.example.oopcw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/database";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public static void insertClubData(Club club) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String insertQuery = "INSERT INTO club (Club_id,Club_name,Members,Advisor_id,club_description) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, club.clubId);
            preparedStatement.setString(2, club.clubName);
            preparedStatement.setInt(3, club.members);
            preparedStatement.setString(4, club.advisorId);
            preparedStatement.setString(5, club.clubDescription);

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
    public static void testDatabaseConnection() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            System.out.println("Database connected successfully.");
        } catch (SQLException e) {
            System.out.println("Database connection failed. Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}