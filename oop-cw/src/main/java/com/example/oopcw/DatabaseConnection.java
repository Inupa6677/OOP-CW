package com.example.oopcw;

import java.sql.*;


public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sacms";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public static void insertClubData(Club club) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String insertQuery = "INSERT INTO club (Club_id,Club_name,Members,Advisor_id,description) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, club.clubId);
            preparedStatement.setString(2, club.clubName);
            preparedStatement.setInt(3, club.members);
            preparedStatement.setString(4, club.advisorId);
            preparedStatement.setString(5, club.clubDescription);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data added for database successfully.");
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

    public static Club getClubId(String clubId){
        Club club = null;
        try {
            Connection connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            String selectQuery = "SELECT * FROM club WHERE Club_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, clubId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                club = new Club(
                        resultSet.getString("Club_id"),
                        resultSet.getString("Club_name"),
                        resultSet.getString("Members"),
                        resultSet.getString("Advisor_id"),
                        resultSet.getString("description")

                );
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return club;
    }
}