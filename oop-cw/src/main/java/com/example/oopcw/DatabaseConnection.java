package com.example.oopcw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sacms";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public static void insertClubData(Club club) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String insertQuery = "INSERT INTO club (club_id,club_name,advisor_id,members,description) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, club.clubId);
            preparedStatement.setString(2, club.clubName);
            preparedStatement.setString(3, club.advisorId);
            preparedStatement.setInt(4, club.members);
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
}