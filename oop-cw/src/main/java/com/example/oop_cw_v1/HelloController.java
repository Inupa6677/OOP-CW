package com.example.oop_cw_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;
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

    @FXML
    private DatePicker dateInUpdate;

    @FXML
    private TextField eventDescriptionInUpdate;

    @FXML
    private TextField eventIdInUpdate;

    @FXML
    private TextField eventLocationInUpdate;

    @FXML
    private TextField eventNameInUpdate;

    @FXML
    private TextField eventTimeInUpdate;




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

        // save event data to the database after the validation
        //if (eventValidation == true)  make the validation and add the details in to the condition
        Event event1 = new Event(eventId, eventName, location, time, description, date);
        DataBaseConnection.insertEventData(event1.getEventId(), event1.getEventName(), event1.getEventLocation(), event1.getEventTime(), event1.getEventDescription(), event1.getEventDate());



        // Clear the text fields
        eventIdInCreateEvents.setText("");
        eventNameInCreateEvents.setText("");
        locationInCreateEvents.setText("");
        timeInCreateEvents.setText("");
        descriptionInCreateEvents.setText("");
        dateInCreateEvents.setValue(null);


    }



    public void searchButtonInUpdate(ActionEvent actionEvent) {
        // Get the event ID to search for
        String searchEventId = eventIdInUpdate.getText(); // Assuming eventIdInUpdate is a TextField for input

        // Perform a search in the database
        Event foundEvent = DataBaseConnection.searchEventById(searchEventId);

        if (foundEvent != null) {
            // Event found, set the prompt text or update fields
            eventIdInUpdate.setPromptText(foundEvent.getEventId());
            eventNameInUpdate.setText(foundEvent.getEventName());
            eventLocationInUpdate.setText(foundEvent.getEventLocation());
            eventTimeInUpdate.setText(foundEvent.getEventTime());
            eventDescriptionInUpdate.setText(foundEvent.getEventDescription());
            dateInUpdate.setValue(LocalDate.parse(foundEvent.getEventDate())); // Assuming date is stored as a String

            // Optionally, you can enable/disable or set other properties based on your requirements

        } else {
            // Event not found, provide feedback to the user (e.g., show an alert)
            showAlert("Event not found", "The event with ID " + searchEventId + " was not found.");

            // Clear the fields or set them to default values as needed
            eventIdInUpdate.clear();
            eventNameInUpdate.clear();
            eventLocationInUpdate.clear();
            eventTimeInUpdate.clear();
            eventDescriptionInUpdate.clear();
            dateInUpdate.setValue(null);
        }
    }

    // Add a method to show an alert (you can customize this based on your UI framework)
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }


    @FXML
    void onSaveBtnClickInUpdate(ActionEvent event) {
        // Get the updated event details from the text fields
        String eventId = eventIdInUpdate.getPromptText(); // Assuming prompt text is set to the current event ID
        String eventName = eventNameInUpdate.getText();
        String location = eventLocationInUpdate.getText();
        String time = eventTimeInUpdate.getText();
        String description = eventDescriptionInUpdate.getText();
        String date = String.valueOf(dateInUpdate.getValue());

        // Validate the updated details if necessary
        // if (eventValidation == true) {
        //     // Perform validation and update details accordingly
        // }

        // Update event data in the database
        DataBaseConnection.updateEventData(eventId, eventName, location, time, description, date);

        // Provide feedback to the user (e.g., show an alert)
        showAlert("Event Updated", "Event details have been successfully updated.");

        // Optionally, clear the fields or set them to default values
        eventIdInUpdate.clear();
        eventNameInUpdate.clear();
        eventLocationInUpdate.clear();
        eventTimeInUpdate.clear();
        eventDescriptionInUpdate.clear();
        dateInUpdate.setValue(null);

        // Optionally, reset prompt text for the next search
        eventIdInUpdate.setPromptText("Enter Event ID");

    }

    public void deleteEventBtnClick(ActionEvent actionEvent) {
        // Get the event ID to delete
        String deleteEventId = eventIdInUpdate.getPromptText(); // Assuming prompt text is set to the current event ID

        // Confirm deletion with the user (you can customize this based on your UI framework)
        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Confirm Deletion");
        confirmAlert.setHeaderText(null);
        confirmAlert.setContentText("Are you sure you want to delete the event with ID " + deleteEventId + "?");

        Optional<ButtonType> result = confirmAlert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            // User confirmed deletion, proceed with deletion

            // Delete event details from the database
            DataBaseConnection.deleteEventData(deleteEventId);

            // Delete the event itself
            DataBaseConnection.deleteEvent(deleteEventId);

            // Provide feedback to the user (e.g., show an alert)
            showAlert("Event Deleted", "Event details have been successfully deleted.");

            // Optionally, clear the fields or set them to default values
            eventIdInUpdate.clear();
            eventNameInUpdate.clear();
            eventLocationInUpdate.clear();
            eventTimeInUpdate.clear();
            eventDescriptionInUpdate.clear();
            dateInUpdate.setValue(null);

            // Optionally, reset prompt text for the next search
            eventIdInUpdate.setPromptText("Enter Event ID");
        }
    }



}