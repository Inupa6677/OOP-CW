package com.example.oopcw;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sacms";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public static void insertClubData(Club club) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String insertQuery = "INSERT INTO club (Club_id,Club_name,Members,Advisor_id,description) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, club.getClubId());
            preparedStatement.setString(2, club.getClubName());
            preparedStatement.setInt(3, club.getMembers());
            preparedStatement.setString(4, club.getAdvisorId());
            preparedStatement.setString(5, club.getClubDescription());

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

    public static List<Club> getClubData() {
        List<Club> clubList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            String selectQuery = "SELECT * FROM club";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Club club = new Club(
                        resultSet.getString("Club_id"),
                        resultSet.getString("Club_name"),
                        resultSet.getString("Members"),
                        resultSet.getString("Advisor_id"),
                        resultSet.getString("description")
                );
                clubList.add(club);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clubList;
    }

    public static Club getClubDetails(String clubId) {
        List<Club> clubList = getClubData();
        for (Club club : clubList) {
            if (club.getClubId().equals(clubId)) {
                return club;
            }
        }
        return null; // Club not found
    }


    public static void deleteClub(Club club) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sacms", "root", "")) {
            String sql = "DELETE FROM club WHERE club_id = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, club.getClubId());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Club searchClub(String clubId) {
        List<Club> clubList = getClubData();

        for (Club club : clubList) {
            if (club.getClubId().equals(clubId)) {
                return club;
            }
        }

        return null;
    }


    public static void updateClubDetails(Club club) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String updateQuery = "UPDATE club SET club_name = ?, members = ?, advisor_id = ?, description = ? WHERE Club_id = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                preparedStatement.setString(1, club.getClubName());
                preparedStatement.setInt(2, club.getMembers());
                preparedStatement.setString(3, club.getAdvisorId());
                preparedStatement.setString(4, club.getClubDescription());
                preparedStatement.setString(5, club.getClubId());

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Club details updated successfully.");
                } else {
                    System.out.println("Club details update failed.");
                }
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}