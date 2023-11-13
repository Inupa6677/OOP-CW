package com.example.oopcw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DataBaseConnector {
    private Connection connection;
    private final String url;
    private final String userName;
    private final String password;

    public DataBaseConnector(String url,String userName,String password){
        this.url = url;
        this.userName = userName;
        this.password = password;
    }
    public void connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to the database!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException("Unable to connect to the database.", e);
        }
    }





    public void disconnect() throws SQLException{
        if (connection != null &&! connection.isClosed()){
            connection.close();
        }
    }

    public void addClub(ClubCreation creation) throws SQLException{
        String insertQuery = "INSERT INTO club(Club_id,Club_name,Members,Advisor_id,club_description) VALUES(?,?,?,?,?)";

        try(PreparedStatement statement = connection.prepareStatement(insertQuery)){
            statement.setString(1,creation.getClubId());
            statement.setString(2,creation.getClubName());
            statement.setInt(3,creation.getMembers());
            statement.setString(4,creation.getAdvisorId());
            statement.setString(5,creation.getClubDescription());
            statement.executeUpdate();
        }
    }

}
