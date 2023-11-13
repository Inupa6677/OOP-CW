package com.example.oopcw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController {


    @FXML
    private Button btnCreate;
    @FXML
    private Button btnBack;

    @FXML
    private Button btnCreateClubData;

    @FXML
    private TextField txtAdvisorId;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtMembers;

    @FXML
    private TextField txtName;

    @FXML
    private Group groupFirst;

    @FXML
    private Group groupSecond;

        // Example database connection details (replace with your actual details)
        private static final String DB_URL = "jdbc:mysql://localhost:3306/sacms";

        private static final String DB_USERNAME = "root";
        private static final String DB_PASSWORD = "";

        private DataBaseConnector dataBaseConnector = new DataBaseConnector(DB_URL, DB_USERNAME, DB_PASSWORD);

    public void disableGroups(){
        groupFirst.setVisible(false);
        groupSecond.setVisible(false);
    }
    public void onClickCreateClub(ActionEvent actionEvent) {
        disableGroups();
        groupSecond.setVisible(true);

    }


    public void backToAdvisorClick(ActionEvent actionEvent) {
        disableGroups();
        groupFirst.setVisible(true);

    }
    @FXML
    void createClubData(ActionEvent event) {
        if (event.getSource() ==  btnCreateClubData){
            String clubId = txtId.getText();
            String clubName = txtName.getText();
            String advisorId = txtAdvisorId.getText();
            String members = txtMembers.getText();
            String clubDescription = txtDescription.getText();

            try {
                // Create ClubCreation instance
                ClubCreation creation = new ClubCreation(clubId,clubName,members,advisorId,clubDescription);


                // Connect to the database
                dataBaseConnector.connect();

                // Add club to the database
                dataBaseConnector.addClub(creation);

                // Optionally, you can display a success message or reset the input fields
                System.out.println("Club data saved successfully!");

                // Reset input fields
                txtId.clear();
                txtName.clear();
                txtMembers.clear();
                txtAdvisorId.clear();
                txtDescription.clear();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle database connection or query errors
            } finally {
                // Disconnect from the database
                try {
                    dataBaseConnector.disconnect();
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle disconnection errors
                }
            }
        }
    }




}