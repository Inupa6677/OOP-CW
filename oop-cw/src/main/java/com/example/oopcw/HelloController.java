package com.example.oopcw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

    @FXML
    private Group groupThree;
    @FXML
    private ImageView importClubImageView;


    public void disableGroups() {
        groupFirst.setVisible(false);
        groupSecond.setVisible(false);
        groupThree.setVisible(false);

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
        String clubID = txtId.getText();
        String clubName = txtName.getText();
        String members = txtMembers.getText();
        String advisorId = txtAdvisorId.getText();
        String description = txtDescription.getText();

        boolean isValid = true;

        // Validate members
        if (!isValidNumber(members)) {
            txtMembers.setStyle("-fx-text-fill: red;");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Members");
            alert.setHeaderText(null);
            alert.setContentText("Enter only integers for Members.");
            alert.showAndWait();
            isValid = false;
        }

        if (isValid) {
            // Add the data to the database
            Club club = new Club(clubID, clubName, members, advisorId, description);
            DatabaseConnection.testDatabaseConnection();
            DatabaseConnection.insertClubData(club);
        }
    }
    private boolean isValidNumber(String input) {
        try {
            int parsedValue = Integer.parseInt(input);
            return parsedValue >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void updateClub(ActionEvent actionEvent) {
    }

    public void deleteClub(ActionEvent actionEvent) {
    }

    public void searchClub(ActionEvent actionEvent) {
    }

    public void btnBackToMainClick(ActionEvent actionEvent) {
        disableGroups();
        groupFirst.setVisible(true);
    }

    public void manageClick(ActionEvent actionEvent) {
        disableGroups();
        groupThree.setVisible(true);
    }
}


