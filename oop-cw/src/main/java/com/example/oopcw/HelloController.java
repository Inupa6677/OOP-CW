package com.example.oopcw;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {


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
    private TableView<Club> clubTable;
    @FXML
    private TableColumn<Club, String> colClubId;
    @FXML
    private TableColumn<Club, String> colClubName;
    @FXML
    private TableColumn<Club, Integer> colMembers;
    @FXML
    private TableColumn<Club, String> colAdvisorId;
    @FXML
    private TableColumn<Club, String> colClubDescription;

    @FXML
    private TextField txtSearchClubId;

    @FXML
    private TextField txtManageAdvisorId;

    @FXML
    private TextField txtManageClubDescription;

    @FXML
    private TextField txtManageClubName;

    @FXML
    private TextField txtManageMembers;

    @FXML
    private Group groupFirst;

    @FXML
    private Group groupSecond;

    @FXML
    private Group groupThree;

    private ObservableList<Club> clubObservableList = FXCollections.observableArrayList();

    public void disableGroups(){
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

            txtId.clear();
            txtName.clear();
            txtMembers.clear();
            txtAdvisorId.clear();
            txtDescription.clear();
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

    public void btnBackToMainClick(ActionEvent actionEvent) {
        disableGroups();
        groupFirst.setVisible(true);
    }

    public void manageClick(ActionEvent actionEvent) {
        disableGroups();
        groupThree.setVisible(true);
        populateClubTable();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){
        //Initial the table columns
        colClubId.setCellValueFactory(new PropertyValueFactory<>("clubId"));
        colClubName.setCellValueFactory(new PropertyValueFactory<>("clubName"));
        colMembers.setCellValueFactory(new  PropertyValueFactory<>("members"));
        colAdvisorId.setCellValueFactory(new PropertyValueFactory<>("advisorId"));
        colClubDescription.setCellValueFactory(new PropertyValueFactory<>("clubDescription"));

    }

    public void populateClubTable(){
        List<Club> clubList = DatabaseConnection.getClubData();
        clubTable.getItems().setAll(clubList);
    }

    public void handleTable(MouseEvent event) {
        if (event.getClickCount() == 1){
            Club selectedClub = clubTable.getSelectionModel().getSelectedItem();
        }
    }
    public void deleteClub(ActionEvent actionEvent) {
        Club selectedClub = clubTable.getSelectionModel().getSelectedItem();
        if (selectedClub != null){
            DatabaseConnection.deleteClub(selectedClub);
            populateClubTable();

            Alert alertCon = new Alert(Alert.AlertType.INFORMATION);
            alertCon.setTitle("Club Deleted Successfully");
            alertCon.setHeaderText(null);
            alertCon.setContentText("Club has been deleted successfully.");
            alertCon.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No club selected");
            alert.setHeaderText(null);
            alert.setContentText("Select a club to delete");
            alert.showAndWait();
        }
    }

    public void searchClub(ActionEvent actionEvent) {
        String searchId = txtSearchClubId.getText();
        Club club = DatabaseConnection.searchClub(searchId);

        if (club != null){
            txtManageClubName.setText(club.getClubName());
            txtManageMembers.setText(String.valueOf(club.getMembers()));
            txtManageAdvisorId.setText(club.getAdvisorId());
            txtManageClubDescription.setText(club.getClubDescription());
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Club Not Found");
            alert.setHeaderText(null);
            alert.setContentText("Club With " + searchId + " Not Found");
            alert.showAndWait();
        }
    }

    public void updateClub(ActionEvent actionEvent) {
    }
}



