package com.example.oop_cw_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.IOException;
// Hi i am john

public class HelloController {

    @FXML
    private Label label_registerNow;
    @FXML
    private Button btn_back;
    @FXML
    private Label label_error;
    @FXML
    private TextField txt_email;
    @FXML
    private DatePicker dateInCreateEvents;

    @FXML
    private TextField descriptionInCreateEvents;

    @FXML
    private Pane eventCreationPane;

    @FXML
    private TextField eventIdInCreateEvents;

    @FXML
    private TextField eventNameInCreateEvents;

    @FXML
    private Pane eventPane;

    @FXML
    private TextField locationInCreateEvents;

    @FXML
    private TextField timeInCreateEvents;

    @FXML
    private Pane updateEvenetPane;


    public void disablePanes(){
        eventPane.setVisible(false);
        updateEvenetPane.setVisible(false);
        eventCreationPane.setVisible(false);
    }

    @FXML
    private void switchToRegisterNow(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToLogin(ActionEvent event) throws IOException {
        Stage stage = (Stage) btn_back.getScene().getWindow(); // Assuming backButton is the ID of your back button

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void backbtnincreateevents() {
        disablePanes();
        eventPane.setVisible(true);
    }



    public void clickCreateBtnClick() throws IOException {
        disablePanes();
        eventCreationPane.setVisible(true);
    }

    public void clickUpdateBtnClick(ActionEvent actionEvent) {
        disablePanes();
        updateEvenetPane.setVisible(true);
    }

    public void clickDeleteBtnClick(ActionEvent actionEvent) {
        disablePanes();
        updateEvenetPane.setVisible(true);

    }
    public void clickBackToEventPane(ActionEvent actionEvent) {
        disablePanes();
        eventPane.setVisible(true);
    }



    public void savebtnincreateevents(ActionEvent actionEvent) {
        String eventId = eventIdInCreateEvents.getText();
        String eventName = eventNameInCreateEvents.getText();
        String location = locationInCreateEvents.getText();
        String time = timeInCreateEvents.getText();
        String description = descriptionInCreateEvents.getText();
        String date = String.valueOf(dateInCreateEvents.getValue());

        

    }



    public void deleteEventBtnClick(ActionEvent actionEvent) {
    }


}