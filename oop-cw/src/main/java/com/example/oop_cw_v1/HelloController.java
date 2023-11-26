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

import java.time.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;


public class HelloController {

    @FXML
    private Pane createGamePane;

    @FXML
    private Pane createMeetingPane;

    @FXML
    private Pane createWorkshopPane;

    @FXML
    private DatePicker dateInCreateEvents;

    @FXML
    private DatePicker dateInUpdate;

    @FXML
    private TextField descriptionInCreateEvents;

    @FXML
    private Pane eventCreationPane;

    @FXML
    private TextField eventDescriptionInUpdate;

    @FXML
    private TextField eventIdInCreateEvents;

    @FXML
    private TextField eventIdInUpdate;

    @FXML
    private TextField eventLocationInUpdate;

    @FXML
    private TextField eventNameInCreateEvents;

    @FXML
    private TextField eventNameInUpdate;

    @FXML
    private Pane eventPane;

    @FXML
    private TextField eventTimeInUpdate;

    @FXML
    private TextField searchFieldInUpdate;

    @FXML
    private TextField meetingIdIncreatemeeting;

    @FXML
    private DatePicker meetingdateIncreatemeeting;

    @FXML
    private TextField meetingdescriptionIncreatemeeting;

    @FXML
    private TextField meetinglocationIncreatemeeting;

    @FXML
    private TextField meetingnameIncreatemeeting;

    @FXML
    private TextField meetingtimeIncreatemeeting;

    @FXML
    private TextField meetingtypeIncreatemeeting;

    @FXML
    private Pane selectEventTypePane;

    @FXML
    private TextField timeInCreateEvents;

    @FXML
    private Pane updateEvenetPane;

    @FXML
    private Pane selectEventTypeInCreatePane;

    @FXML
    private Pane updateGameDetailsPane;

    @FXML
    private Pane updateMeetingDetailsPane;

    @FXML
    private Pane updateWorkshopDetailsPane;

    @FXML
    private TextField workshopConductorInCreateWorkshop;

    @FXML
    private DatePicker workshopDateInCreateWorkshop;

    @FXML
    private TextField workshopIdInCreateWorkshop;

    @FXML
    private TextField workshopTimeInCreateWorkshop;

    @FXML
    private TextField workshopconductorInupdate;

    @FXML
    private DatePicker workshopdateInupdate;

    @FXML
    private TextField workshopdescriptionInCreateWorkshop;

    @FXML
    private TextField workshopdescriptionInupdate;

    @FXML
    private TextField workshopidInupdate;

    @FXML
    private TextField workshoplocationInCreateWorkshop;

    @FXML
    private TextField workshoplocationInupdate;

    @FXML
    private TextField workshopnameInCreateWorkshop;

    @FXML
    private TextField workshopnameInupdate;

    @FXML
    private TextField workshoptimeInupdate;

    @FXML
    private Pane selectUpdateEventTypePane;

    @FXML
    private DatePicker eventDateincreateevent;

    @FXML
    private TextField eventdescriptionincreateevent;

    @FXML
    private TextField eventidincreateevent;

    @FXML
    private TextField eventlocationincreateevent;

    @FXML
    private TextField eventnameincreateevent;

    @FXML
    private TextField eventtimeincreateevent;

    @FXML
    private TextField eventtypeincreateevent;

    @FXML
    private TextField searchidFieldInMeeting;


    @FXML
    private TextField meetingIdInUpdate;



    @FXML
    private DatePicker meetingdateInUpdate;

    @FXML
    private Pane scheduleEventPane;



    @FXML
    private TextField meetingdescriptionInUpdate;



    @FXML
    private TextField meetinglocationInUpdate;



    @FXML
    private TextField meetingnameInUpdate;

    @FXML
    private Pane updateMeetingPane;

    @FXML
    private Pane updateWorkshopPane;


    @FXML
    private TextField meetingtimeInUpdate;


    @FXML
    private TextField meetingtypeInUpdate;

    @FXML
    private TextField eventTypeInUpdate;

    @FXML
    private TextField workshopIdInSearchField;

    @FXML
    void backbtnincreateevents(ActionEvent event) {

    }





    public void disablePanes(){
        selectEventTypeInCreatePane.setVisible(false);
        scheduleEventPane.setVisible(false);
        eventCreationPane.setVisible(false);
        createMeetingPane.setVisible(false);
        createWorkshopPane.setVisible(false);
        selectUpdateEventTypePane.setVisible(false);
        updateEvenetPane.setVisible(false);
        updateMeetingPane.setVisible(false);
        updateWorkshopPane.setVisible(false);


    }

    @FXML
    private void switchToRegisterNow(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    void clickCreateBtnClick(ActionEvent event) {
        disablePanes();
        selectEventTypeInCreatePane.setVisible(true);
    }

    void backBtninselectingevents(ActionEvent event) {
        disablePanes();
        scheduleEventPane.setVisible(true);
    }

    void onBackbtnincreateevent(ActionEvent event) {
        disablePanes();
        selectEventTypeInCreatePane.setVisible(true);
    }

    void onBackBtnInCreateMeeting(ActionEvent event) {
        disablePanes();
        selectEventTypeInCreatePane.setVisible(true);
    }

    void onBackBtnClickInCreateWorkshop(ActionEvent event) {
        disablePanes();
        selectEventTypeInCreatePane.setVisible(true);
    }

    void onBackBtnClickInselecttoupdate(ActionEvent event) {
        disablePanes();
        scheduleEventPane.setVisible(true);
    }

    void clickDeleteBtnClick(ActionEvent event) {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }


    public void clickCreateBtnClick() throws IOException {
        disablePanes();
        selectEventTypeInCreatePane.setVisible(true);
    }

    public void clickUpdateBtnClick() throws IOException {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }
    public void clickDeleteBtnClick() throws IOException {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }


    public void backBtninselectingevents() throws IOException {
        disablePanes();
        scheduleEventPane.setVisible(true);
    }
    public void onBackBtnClickInselecttoupdate() throws IOException {
        disablePanes();
        scheduleEventPane.setVisible(true);
    }

    public void clickBackToEventPane() throws IOException {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }

    public void eventBtninselectingevents() throws IOException {
        disablePanes();
        eventCreationPane.setVisible(true);
    }

    public void meetingBtninselectingevents() throws IOException {
        disablePanes();
        createMeetingPane.setVisible(true);
    }

    public void workshopBtninselectingevents() throws IOException {
        disablePanes();
        createWorkshopPane.setVisible(true);
    }

    public void onBackBtnInCreateMeeting() throws IOException {
        disablePanes();
        selectEventTypeInCreatePane.setVisible(true);
    }

    public void onBackBtnClickInCreateWorkshop() throws IOException {
        disablePanes();
        selectEventTypeInCreatePane.setVisible(true);
    }

    public void onBackbtnincreateevent() throws IOException {
        disablePanes();
        selectEventTypeInCreatePane.setVisible(true);
    }

    public void onEventBtnClickInselecttoupdate() throws IOException {
        disablePanes();
        updateEvenetPane.setVisible(true);
    }

    public void onMeetingBtnClickInselecttoupdate() throws IOException {
        disablePanes();
        updateMeetingPane.setVisible(true);
    }

    public void onWorkshopBtnClickInselecttoupdate() throws IOException {
        disablePanes();
        updateWorkshopPane.setVisible(true);
    }

    public void backBtnInUpdateEventPane() throws IOException {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }

    public void backBtnInUpdateMeeting() throws IOException {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }

    public void backWorkshopbtninupdate() throws IOException {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }

    @FXML
    void workshopBtninselectingevents(ActionEvent event) {
        disablePanes();
        createWorkshopPane.setVisible(true);

    }

    @FXML
    void eventBtninselectingevents(ActionEvent event) {
        disablePanes();
        eventCreationPane.setVisible(true);

    }

    @FXML
    void gameBtninselectingevents(ActionEvent event) {
        disablePanes();createGamePane.setVisible(true);


    }

    @FXML
    void meetingBtninselectingevents(ActionEvent event) {
        disablePanes();
        createMeetingPane.setVisible(true);
    }



    public void onEventBtnClickInselecttoupdate(ActionEvent actionEvent) {
        disablePanes();
        updateEvenetPane.setVisible(true);
    }

    public void onMeetingBtnClickInselecttoupdate(ActionEvent actionEvent) {
        disablePanes();
        updateMeetingPane.setVisible(true);
    }

    public void onWorkshopBtnClickInselecttoupdate(ActionEvent actionEvent) {
       disablePanes();
        updateWorkshopPane.setVisible(true);
    }

    public void onBackbtnincreategame(ActionEvent actionEvent) {
        disablePanes();
        selectEventTypePane.setVisible(true);
    }

    public void backWorkshopbtninupdate(ActionEvent actionEvent) {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }


    public void onsavebtnincreateevent(ActionEvent actionEvent) {
        // Getting data from the text fields
        String eventId = eventidincreateevent.getText();
        eventIdValidationInCreateEvents();
        String eventName = eventnameincreateevent.getText();
        eventNameValidationInCreateEvents();
        String eventLocation = eventlocationincreateevent.getText();
        eventLocationValidationInCreateEvents();
        String eventTime = eventtimeincreateevent.getText();
        eventTimeValidationInCreateEvents();
        String eventDescription = eventdescriptionincreateevent.getText();
        String eventType = eventtypeincreateevent.getText();
        eventTypeValidationInCreateEvents();
        String eventDate = String.valueOf(eventDateincreateevent.getValue());
        eventDateValidationInCreateEvents();

        // save event data to db after validation
        // if(eventvalidation == true) make the validation and add the details in to the condition
        Event event1 = new Event(eventId, eventName, eventLocation, eventDescription, eventDate, eventTime , eventType);
        DataBaseConnection.insertEventData(event1.getScheduleId(), event1.getScheduleName(),event1.getScheduleLocation(), event1.getScheduleDescription(),event1.getScheduleDate(),  event1.getScheduleTime(), event1.getEventType());
        clearTextFieldsInEvent();
    }

    //User Input Validation (create events)

    boolean createEventsAllValidation = true;
    public void eventIdValidationInCreateEvents() {
        if (eventidincreateevent.getText().length() == 0){
            eventidincreateevent.setStyle("-fx-border-color: red");
            createEventsAllValidation = false;

        } else {
            eventidincreateevent.setStyle("");
        }
    }

    public void eventNameValidationInCreateEvents() {
        String eventName = eventnameincreateevent.getText();

        // Validate event name
        if (eventName == null || eventName.length() == 0 || !eventName.matches("^[A-Za-z]*$")) {
            eventnameincreateevent.setStyle("-fx-border-color: red");
            createEventsAllValidation = false;
        } else {
            eventnameincreateevent.setStyle("");
        }
    }


    public void eventLocationValidationInCreateEvents() {
        String eventLocation = eventlocationincreateevent.getText();

        // Validate event location
        if (eventLocation == null || eventLocation.length() == 0 || !eventLocation.matches("^[A-Za-z]*$")) {
            eventlocationincreateevent.setStyle("-fx-border-color: red");
            createEventsAllValidation = false;
        } else {
            eventlocationincreateevent.setStyle("");
        }
    }



    public void eventTimeValidationInCreateEvents() {
        String eventTime = eventtimeincreateevent.getText();

        // Validate event time
        if (!validateEventTime(eventTime)) {
            eventtimeincreateevent.setStyle("-fx-border-color: red");
            createEventsAllValidation = false;
        } else {
            eventtimeincreateevent.setStyle("");
        }
    }
    public boolean validateEventTime(String time) {
        return time.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }

    public void eventTypeValidationInCreateEvents() {
        String eventType = eventtypeincreateevent.getText();

        // Validate event type
        if (!validateEventType(eventType)) {
            eventtypeincreateevent.setStyle("-fx-border-color: red");
            createEventsAllValidation = false;
        } else {
            eventtypeincreateevent.setStyle("");
        }
    }
    public boolean validateEventType(String eventType) {
        // Check if the event type is not null and is either "online" or "physical"
        return eventType != null && (eventType.equalsIgnoreCase("online") || eventType.equalsIgnoreCase("physical"));
    }

    public void eventDateValidationInCreateEvents() {
        LocalDate selectedDate = eventDateincreateevent.getValue();

        // Validate event date
        if (selectedDate == null) {
            eventDateincreateevent.setStyle("-fx-border-color: red");
            createEventsAllValidation = false;
        } else {
            eventDateincreateevent.setStyle("");
        }
    }


    public void searchEventIdInUpdate(ActionEvent actionEvent) {
        String searchEventId = searchFieldInUpdate.getText();

        Event foundEvent = MainSchedule.getEventDetailsById(searchEventId);

        if (foundEvent != null){
            // if event found then set text to update
            eventIdInUpdate.setText(foundEvent.getScheduleId());
            eventNameInUpdate.setText(foundEvent.getScheduleName());
            eventLocationInUpdate.setText(foundEvent.getScheduleLocation());
            eventDescriptionInUpdate.setText(foundEvent.getScheduleDescription());
            dateInUpdate.setValue( LocalDate.parse(foundEvent.getScheduleDate()));
            eventTimeInUpdate.setText(foundEvent.getScheduleTime());
            eventTypeInUpdate.setText(foundEvent.getEventType());

        } else {
            // Event not found, provide feedback to the user (e.g., show an alert)
            showAlert("Event not found", "The event with ID " + searchEventId + " was not found.");

            // Clear the fields or set them to default values as needed
            eventIdInUpdate.clear();
            eventNameInUpdate.clear();
            eventLocationInUpdate.clear();
            eventTimeInUpdate.clear();
            eventDescriptionInUpdate.clear();
            eventTypeInUpdate.clear();
            dateInUpdate.setValue(null);
        }

    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void deleteEventBtnClick(ActionEvent actionEvent){
        // Get the event ID to delete
        String deleteEventId = searchFieldInUpdate.getText();
        System.out.println(deleteEventId);

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



            // Provide feedback to the user (e.g., show an alert)
            showAlert("Event Deleted", "Event details have been successfully deleted.");

            // Optionally, clear the fields or set them to default values
            eventIdInUpdate.clear();
            eventNameInUpdate.clear();
            eventLocationInUpdate.clear();
            eventTimeInUpdate.clear();
            eventDescriptionInUpdate.clear();
            eventTypeInUpdate.clear();
            dateInUpdate.setValue(null);
        }

    }

    private void clearTextFieldsInEvent() {
        // Clear the text fields in meeting
        eventidincreateevent.clear();
        eventnameincreateevent.clear();
        eventlocationincreateevent.clear();
        eventtimeincreateevent.clear();
        eventdescriptionincreateevent.clear();
        eventtypeincreateevent.clear();
        eventDateincreateevent.getEditor().clear();
    }

    public void onsaveBtnIncreatemeeting(ActionEvent actionEvent) {
        String meetingId = meetingIdIncreatemeeting.getText();
        meetingIdValidationInCreateEvents();
        String meetingName = meetingnameIncreatemeeting.getText();
        meetingNameValidationInCreateEvents();
        String meetingLocation = meetinglocationIncreatemeeting.getText();
        meetingLocationValidationInCreateEvents();
        String meetingTime = meetingtimeIncreatemeeting.getText();
        meetingTimeValidationInCreateEvents();
        String meetingDescription = meetingdescriptionIncreatemeeting.getText();
        String meetingType = meetingtypeIncreatemeeting.getText();
        meetingTypeValidationInCreateEvents();
        String meetingDate = String.valueOf(meetingdateIncreatemeeting.getValue());
        meetingDateValidationInCreateEvents();

        // save event data to db after validation
        // if(eventvalidation == true) make the validation and add the details in to the condition
        Meeting meeting1 = new Meeting(meetingId, meetingName, meetingLocation, meetingDescription, meetingDate, meetingTime, meetingType);
        DataBaseConnection.insertMeetingData(meeting1.getScheduleId(), meeting1.getScheduleName(), meeting1.getScheduleLocation(), meeting1.getScheduleDescription(), meeting1.getScheduleDate(), meeting1.getScheduleTime(),  meeting1.getMeetingType());
        clearTextFieldsInMeeting();

    }

    boolean createMeetingAllValidation = true;
    public void meetingIdValidationInCreateEvents() {
        if (meetingIdIncreatemeeting.getText().length() == 0){
            meetingIdIncreatemeeting.setStyle("-fx-border-color: red");
            createMeetingAllValidation = false;

        } else {
            meetingIdIncreatemeeting.setStyle("");
        }
    }

    public void meetingNameValidationInCreateEvents() {
        String eventName = meetingnameIncreatemeeting.getText();

        // Validate event name
        if (eventName == null || eventName.length() == 0 || !eventName.matches("^[A-Za-z]*$")) {
            meetingnameIncreatemeeting.setStyle("-fx-border-color: red");
            createMeetingAllValidation = false;
        } else {
            meetingnameIncreatemeeting.setStyle("");
        }
    }


    public void meetingLocationValidationInCreateEvents() {
        String eventLocation = meetinglocationIncreatemeeting.getText();

        // Validate event location
        if (eventLocation == null || eventLocation.length() == 0 || !eventLocation.matches("^[A-Za-z]*$")) {
            meetinglocationIncreatemeeting.setStyle("-fx-border-color: red");
            createMeetingAllValidation = false;
        } else {
            meetinglocationIncreatemeeting.setStyle("");
        }
    }



    public void meetingTimeValidationInCreateEvents() {
        String meetingTime = meetingtimeIncreatemeeting.getText();

        // Validate event time
        if (!validateMeetingTime(meetingTime)) {
            meetingtimeIncreatemeeting.setStyle("-fx-border-color: red");
            createMeetingAllValidation = false;
        } else {
            meetingtimeIncreatemeeting.setStyle("");
        }
    }
    public boolean validateMeetingTime(String meetingTime) {
        return meetingTime.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }



    public void meetingTypeValidationInCreateEvents() {
        String meetingType = meetingtypeIncreatemeeting.getText();

        // Validate event type
        if (!validateMeetingType(meetingType)) {
            meetingtypeIncreatemeeting.setStyle("-fx-border-color: red");
            createMeetingAllValidation = false;
        } else {
            meetingtypeIncreatemeeting.setStyle("");
        }
    }
    public boolean validateMeetingType(String meetingType) {
        // Check if the event type is not null and is either "online" or "physical"
        return meetingType != null && (meetingType.equalsIgnoreCase("online") || meetingType.equalsIgnoreCase("physical"));
    }

    public void meetingDateValidationInCreateEvents() {
        LocalDate selectedMeetingDate = meetingdateIncreatemeeting.getValue();

        // Validate event date
        if (!validateMeetingDate(selectedMeetingDate)) {
            meetingdateIncreatemeeting.setStyle("-fx-border-color: red");
            createMeetingAllValidation = false;
        } else {
            meetingdateIncreatemeeting.setStyle("");
        }
    }
    public boolean validateMeetingDate(LocalDate selectedMeetingDate) {
        // Check if the selected date is not null and is in the future
        return selectedMeetingDate != null && selectedMeetingDate.isAfter(LocalDate.now());
    }




    public void onSearchBtnInmeetingUpdate(ActionEvent actionEvent) {
        String searchMeetingId = searchidFieldInMeeting.getText();

        Meeting foundMeeting = MainSchedule.getMeetingDetailsById(searchMeetingId);

        if (foundMeeting != null){
            // if event found then set text to update
            meetingIdInUpdate.setText(foundMeeting.getScheduleId());
            meetingnameInUpdate.setText(foundMeeting.getScheduleName());
            meetinglocationInUpdate.setText(foundMeeting.getScheduleLocation());
            meetingtimeInUpdate.setText(foundMeeting.getScheduleTime());
            meetingdescriptionInUpdate.setText(foundMeeting.getScheduleDescription());
            meetingtypeInUpdate.setText(foundMeeting.getMeetingType());
            meetingdateInUpdate.setValue(LocalDate.parse(foundMeeting.getScheduleDate()));
        } else {
            // Event not found, provide feedback to the user (e.g., show an alert)
            showAlert("Event not found", "The event with ID " + searchMeetingId + " was not found.");

            // Clear the fields or set them to default values as needed
            meetingIdInUpdate.clear();
            meetingnameInUpdate.clear();
            meetinglocationInUpdate.clear();
            meetingtimeInUpdate.clear();
            meetingdescriptionInUpdate.clear();
            meetingtypeInUpdate.clear();
            searchidFieldInMeeting.clear();
            meetingdateInUpdate.setValue(null);
        }

    }

    public void deleteMeetingdetailsClick(ActionEvent actionEvent){
        // Get the event ID to delete
        String deleteMeetingId = searchidFieldInMeeting.getText();

        // Confirm deletion with the user (you can customize this based on your UI framework)
        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Confirm Deletion");
        confirmAlert.setHeaderText(null);
        confirmAlert.setContentText("Are you sure you want to delete the event with ID " + deleteMeetingId + "?");

        Optional<ButtonType> result = confirmAlert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            // User confirmed deletion, proceed with deletion

            // Delete event details from the database
            DataBaseConnection.deleteMeetingData(deleteMeetingId);



            // Provide feedback to the user (e.g., show an alert)
            showAlert("Event Deleted", "Event details have been successfully deleted.");

            // Optionally, clear the fields or set them to default values
            meetingIdInUpdate.clear();
            meetingnameInUpdate.clear();
            meetinglocationInUpdate.clear();
            meetingtimeInUpdate.clear();
            meetingdescriptionInUpdate.clear();
            meetingtypeInUpdate.clear();
            searchidFieldInMeeting.clear();
            meetingdateInUpdate.setValue(null);
        }
    }

    private void clearTextFieldsInMeeting() {
        // Clear the text fields in meeting
        meetingIdIncreatemeeting.clear();
        meetingnameIncreatemeeting.clear();
        meetinglocationIncreatemeeting.clear();
        meetingtimeIncreatemeeting.clear();
        meetingdescriptionIncreatemeeting.clear();
        meetingtypeIncreatemeeting.clear();
        meetingdateIncreatemeeting.getEditor().clear();
    }


    public void onSaveBtnClickInCreateWorkshop(ActionEvent actionEvent) {
        String workshopId = workshopIdInCreateWorkshop.getText();
        workshopIdValidationInCreateWorkshop();
        String workshopName = workshopnameInCreateWorkshop.getText();
        workshopNameValidationInCreateWorkshop();
        String workshopLocation = workshoplocationInCreateWorkshop.getText();
        workshopLocationValidationInCreateWorkshop();
        String workshopTime = workshopTimeInCreateWorkshop.getText();
        workshopTimeValidationInCreateWorkshop();
        String workshopDescription = workshopdescriptionInCreateWorkshop.getText();
        String workshopConductor = workshopConductorInCreateWorkshop.getText();
        workshopConductorValidationInCreateWorkshop();
        String workshopDate = String.valueOf(workshopDateInCreateWorkshop.getValue());
        workshopDateValidationInCreateWorkshop();

        // save event data to db after validation
        // if(eventvalidation == true) make the validation and add the details in to the condition
        Workshop workshop1 = new Workshop(workshopId, workshopName, workshopLocation, workshopDescription, workshopDate, workshopTime,  workshopConductor);
        DataBaseConnection.insertWorkshopData(workshop1.getScheduleId(), workshop1.getScheduleName(), workshop1.getScheduleLocation(), workshop1.getScheduleDescription(), workshop1.getScheduleDate(), workshop1.getScheduleTime(), workshop1.getConductor());
        clearTextFieldsInWorkshop();
    }


    boolean createWorkshopAllValidation = true;
    public void workshopIdValidationInCreateWorkshop() {
        if (workshopIdInCreateWorkshop.getText().length() == 0){
            workshopIdInCreateWorkshop.setStyle("-fx-border-color: red");
            createWorkshopAllValidation = false;

        } else {
            workshopIdInCreateWorkshop.setStyle("");
        }
    }

    public void workshopNameValidationInCreateWorkshop() {
        String eventName = workshopnameInCreateWorkshop.getText();

        // Validate event name
        if (eventName == null || eventName.length() == 0 || !eventName.matches("^[A-Za-z]*$")) {
            workshopnameInCreateWorkshop.setStyle("-fx-border-color: red");
            createWorkshopAllValidation = false;
        } else {
            workshopnameInCreateWorkshop.setStyle("");
        }
    }


    public void workshopLocationValidationInCreateWorkshop() {
        String eventLocation = workshoplocationInCreateWorkshop.getText();

        // Validate event location
        if (eventLocation == null || eventLocation.length() == 0 || !eventLocation.matches("^[A-Za-z]*$")) {
            workshoplocationInCreateWorkshop.setStyle("-fx-border-color: red");
            createWorkshopAllValidation = false;
        } else {
            workshoplocationInCreateWorkshop.setStyle("");
        }
    }



    public void workshopTimeValidationInCreateWorkshop() {
        String workshopTime = workshopTimeInCreateWorkshop.getText();

        // Validate event time
        if (!validateWorkshopTime(workshopTime)) {
            workshopTimeInCreateWorkshop.setStyle("-fx-border-color: red");
            createWorkshopAllValidation = false;
        } else {
            workshopTimeInCreateWorkshop.setStyle("");
        }
    }
    public boolean validateWorkshopTime(String workshopTime) {
        return workshopTime.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }

    public void workshopConductorValidationInCreateWorkshop() {
        String workshopConductor = workshopConductorInCreateWorkshop.getText();

        // Validate workshop conductor
        if (workshopConductor == null || workshopConductor.length() == 0 || !workshopConductor.matches("^[A-Za-z ]+$")) {
            workshopConductorInCreateWorkshop.setStyle("-fx-border-color: red");
            createWorkshopAllValidation = false;
        } else {
            workshopConductorInCreateWorkshop.setStyle("");
        }
    }


    public void workshopDateValidationInCreateWorkshop() {
        LocalDate selectedMeetingDate = workshopDateInCreateWorkshop.getValue();

        // Validate event date
        if (!validateWorkshopDate(selectedMeetingDate)) {
            workshopDateInCreateWorkshop.setStyle("-fx-border-color: red");
            createWorkshopAllValidation = false;
        } else {
            workshopDateInCreateWorkshop.setStyle("");
        }
    }
    public boolean validateWorkshopDate(LocalDate selectedWorkshopDate) {
        // Check if the selected date is not null and is in the future
        return selectedWorkshopDate != null && selectedWorkshopDate.isAfter(LocalDate.now());
    }

    public void searchBtnInUpdateWorkshop(ActionEvent actionEvent) {
        String searchWorkshopId = workshopIdInSearchField.getText();

        Workshop foundWorkshop = MainSchedule.getWorkshopDetailsById(searchWorkshopId);


        if (foundWorkshop != null){
            // if event found then set text to update
            workshopidInupdate.setText(foundWorkshop.getScheduleId());
            workshopnameInupdate.setText(foundWorkshop.getScheduleName());
            workshoplocationInupdate.setText(foundWorkshop.getScheduleLocation());
            workshoptimeInupdate.setText(foundWorkshop.getScheduleTime());
            workshopdescriptionInupdate.setText(foundWorkshop.getScheduleDescription());
            workshopconductorInupdate.setText(foundWorkshop.getConductor());
            workshopdateInupdate.setValue(LocalDate.parse(foundWorkshop.getScheduleDate()));

        } else {
            // Event not found, provide feedback to the user (e.g., show an alert)
            showAlert("Event not found", "The event with ID " + searchWorkshopId + " was not found.");

            // Clear the fields or set them to default values as needed
            workshopidInupdate.clear();
            workshopnameInupdate.clear();
            workshoplocationInupdate.clear();
            workshoptimeInupdate.clear();
            workshopdescriptionInupdate.clear();
            workshopconductorInupdate.clear();
            workshopdateInupdate.setValue(null);
        }
    }

    public void deleteWorkshopbtninupdate(ActionEvent actionEvent){
        // Get the event ID to delete
        String deleteWorkshopId = workshopIdInSearchField.getText();

        // Confirm deletion with the user (you can customize this based on your UI framework)
        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Confirm Deletion");
        confirmAlert.setHeaderText(null);
        confirmAlert.setContentText("Are you sure you want to delete the event with ID " + deleteWorkshopId + "?");

        Optional<ButtonType> result = confirmAlert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            // User confirmed deletion, proceed with deletion

            // Delete event details from the database
            DataBaseConnection.deleteWorkshopData(deleteWorkshopId);

            // Provide feedback to the user (e.g., show an alert)
            showAlert("Event Deleted", "Event details have been successfully deleted.");

            // Optionally, clear the fields or set them to default values
            workshopidInupdate.clear();
            workshopnameInupdate.clear();
            workshoplocationInupdate.clear();
            workshoptimeInupdate.clear();
            workshopdescriptionInupdate.clear();
            workshopconductorInupdate.clear();
            workshopdateInupdate.setValue(null);
        }
    }



    private void clearTextFieldsInWorkshop() {
        // Clear the text fields in meeting
        workshopIdInCreateWorkshop.clear();
        workshopnameInCreateWorkshop.clear();
        workshoplocationInCreateWorkshop.clear();
        workshopTimeInCreateWorkshop.clear();
        workshopdescriptionInCreateWorkshop.clear();
        workshopConductorInCreateWorkshop.clear();
        workshopDateInCreateWorkshop.getEditor().clear();
    }

    public void onSaveBtnClickInUpdateevents(ActionEvent actionEvent) {
        // Get the updated event details from the text fields
        String eventId = eventIdInUpdate.getText();
        eventIdValidationInUpdateEvents();
        String eventName = eventNameInUpdate.getText();
        eventNameValidationInUpdateEvents();
        String location = eventLocationInUpdate.getText();
        eventLocationValidationInUpdateEvents();
        String description = eventDescriptionInUpdate.getText();
        String eventDate = String.valueOf(dateInUpdate.getValue());
        eventDateValidationInUpdateEvents();
        String time = eventTimeInUpdate.getText();
        eventTimeValidationInUpdateEvents();
        String eventType = eventTypeInUpdate.getText();
        eventTypeValidationInUpdateEvents();
        if (updateEventsAllValidation) {

            // Validate the updated details if necessary
            // if (eventValidation == true) {
            //     // Perform validation and update details accordingly
            // }

            // Update event data in the database
            DataBaseConnection.updateEventData(eventId, eventName, location, description, eventDate, time, eventType);

            // Provide feedback to the user (e.g., show an alert)
            showAlert("Event Updated", "Event details have been successfully updated.");

            // Optionally, clear the fields or set them to default values
            eventIdInUpdate.clear();
            eventNameInUpdate.clear();
            eventLocationInUpdate.clear();
            eventTimeInUpdate.clear();
            eventDescriptionInUpdate.clear();
            eventTypeInUpdate.clear();
            dateInUpdate.setValue(null);

        }
    }


    // validate in updates

    boolean updateEventsAllValidation = true;
    public void eventIdValidationInUpdateEvents() {
        if (eventIdInUpdate.getText().length() == 0){
            eventIdInUpdate.setStyle("-fx-border-color: red");
            updateEventsAllValidation = false;

        } else {
            eventIdInUpdate.setStyle("");
        }
    }

    public void eventNameValidationInUpdateEvents() {
        String eventName = eventNameInUpdate.getText();

        // Validate event name
        if (eventName == null || eventName.length() == 0 || !eventName.matches("^[A-Za-z]*$")) {
            eventNameInUpdate.setStyle("-fx-border-color: red");
            updateEventsAllValidation = false;
        } else {
            eventNameInUpdate.setStyle("");
        }
    }


    public void eventLocationValidationInUpdateEvents() {
        String eventLocation = eventLocationInUpdate.getText();

        // Validate event location
        if (eventLocation == null || eventLocation.length() == 0 || !eventLocation.matches("^[A-Za-z]*$")) {
            eventLocationInUpdate.setStyle("-fx-border-color: red");
            updateEventsAllValidation = false;
        } else {
            eventLocationInUpdate.setStyle("");
        }
    }



    public void eventTimeValidationInUpdateEvents() {
        String eventTime = eventTimeInUpdate.getText();

        // Validate event time
        if (!validateEventTimeUpdate(eventTime)) {
            eventTimeInUpdate.setStyle("-fx-border-color: red");
            updateEventsAllValidation = false;
        } else {
            eventTimeInUpdate.setStyle("");
        }
    }

    public boolean validateEventTimeUpdate(String time) {
        // Allow an empty time field
        if (time == null || time.trim().isEmpty()) {
            return true;
        }

        // Validate time format (HH:mm)
        return time.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }



    public void eventTypeValidationInUpdateEvents() {
        String eventType = eventTypeInUpdate.getText();

        // Validate event type
        if (!validateEventTypeUpdate(eventType)) {
            eventTypeInUpdate.setStyle("-fx-border-color: red");
            updateEventsAllValidation = false;
        } else {
            eventTypeInUpdate.setStyle("");
        }
    }
    public boolean validateEventTypeUpdate(String eventType) {
        // Check if the event type is not null and is either "online" or "physical"
        return eventType != null && (eventType.equalsIgnoreCase("online") || eventType.equalsIgnoreCase("physical"));
    }

    public void eventDateValidationInUpdateEvents() {
        LocalDate selectedDate = dateInUpdate.getValue();

        // Validate event date
        if (!validateEventDateUpdate(selectedDate)) {
            dateInUpdate.setStyle("-fx-border-color: red");
            updateEventsAllValidation = false;
        } else {
            dateInUpdate.setStyle("");
        }
    }
    public boolean validateEventDateUpdate(LocalDate selectedDate) {
        // Check if the selected date is not null and is in the future
        return selectedDate != null && selectedDate.isAfter(LocalDate.now());
    }





    public void onsavebtninupdatemeeting(ActionEvent actionEvent) {
        // Get the updated meeting details from the text fields
        String meetingId = meetingIdInUpdate.getText();
        eventIdValidationInUpdateMeeting();
        String meetingName = meetingnameInUpdate.getText();
        eventNameValidationInUpdateMeeting();
        String meetingLocation = meetinglocationInUpdate.getText();
        eventLocationValidationInUpdateMeeting();
        String meetingDescription = meetingdescriptionInUpdate.getText();
        String meetingDate = String.valueOf(meetingdateInUpdate.getValue());
        eventDateValidationInUpdateMeeting();
        String meetingTime = meetingtimeInUpdate.getText();
        eventTimeValidationInUpdateMeeting();
        String meetingType = meetingtypeInUpdate.getText();
        eventTypeValidationInUpdateMeeting();
        if (updateMeetingAllValidation){

            // Update meeting data in the database
            DataBaseConnection.updateMeetingData(meetingId, meetingName, meetingLocation, meetingDescription, meetingDate, meetingTime, meetingType);

            // Provide feedback to the user (e.g., show an alert)
            showAlert("Meeting Updated", "Meeting details have been successfully updated.");

            // Optionally, clear the fields or set them to default values
            meetingIdInUpdate.clear();
            meetingnameInUpdate.clear();
            meetinglocationInUpdate.clear();
            meetingtimeInUpdate.clear();
            meetingdescriptionInUpdate.clear();
            meetingtypeInUpdate.clear();
            searchidFieldInMeeting.clear();
            meetingdateInUpdate.setValue(null);

        }

    }


    boolean updateMeetingAllValidation = true;
    public void eventIdValidationInUpdateMeeting() {
        if (meetingIdInUpdate.getText().length() == 0){
            meetingIdInUpdate.setStyle("-fx-border-color: red");
            updateMeetingAllValidation = false;

        } else {
            meetingIdInUpdate.setStyle("");
        }
    }

    public void eventNameValidationInUpdateMeeting() {
        String eventName = meetingnameInUpdate.getText();

        // Validate event name
        if (eventName == null || eventName.length() == 0 || !eventName.matches("^[A-Za-z]*$")) {
            meetingnameInUpdate.setStyle("-fx-border-color: red");
            updateMeetingAllValidation = false;
        } else {
            meetingnameInUpdate.setStyle("");
        }
    }


    public void eventLocationValidationInUpdateMeeting() {
        String eventLocation = meetinglocationInUpdate.getText();

        // Validate event location
        if (eventLocation == null || eventLocation.length() == 0 || !eventLocation.matches("^[A-Za-z]*$")) {
            meetinglocationInUpdate.setStyle("-fx-border-color: red");
            updateMeetingAllValidation = false;
        } else {
            meetinglocationInUpdate.setStyle("");
        }
    }



    public void eventTimeValidationInUpdateMeeting() {
        String eventTime = meetingtimeInUpdate.getText();

        // Validate event time
        if (!validateMeetingTimeUpdate(eventTime)) {
            meetingtimeInUpdate.setStyle("-fx-border-color: red");
            updateMeetingAllValidation = false;
        } else {
            meetingtimeInUpdate.setStyle("");
        }
    }

    public boolean validateMeetingTimeUpdate(String time) {
        // Allow an empty time field
        if (time == null || time.trim().isEmpty()) {
            return true;
        }

        // Validate time format (HH:mm)
        return time.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }



    public void eventTypeValidationInUpdateMeeting() {
        String eventType = meetingtypeInUpdate.getText();

        // Validate event type
        if (!validateMeetingTypeUpdate(eventType)) {
            meetingtypeInUpdate.setStyle("-fx-border-color: red");
            updateMeetingAllValidation = false;
        } else {
            meetingtypeInUpdate.setStyle("");
        }
    }
    public boolean validateMeetingTypeUpdate(String eventType) {
        // Check if the event type is not null and is either "online" or "physical"
        return eventType != null && (eventType.equalsIgnoreCase("online") || eventType.equalsIgnoreCase("physical"));
    }

    public void eventDateValidationInUpdateMeeting() {
        LocalDate selectedDate = meetingdateInUpdate.getValue();

        // Validate event date
        if (!validateMeetingDateUpdate(selectedDate)) {
            meetingdateInUpdate.setStyle("-fx-border-color: red");
            updateMeetingAllValidation = false;
        } else {
            meetingdateInUpdate.setStyle("");
        }
    }
    public boolean validateMeetingDateUpdate(LocalDate selectedDate) {
        // Check if the selected date is not null and is in the future
        return selectedDate != null && selectedDate.isAfter(LocalDate.now());
    }


    public void saveWorkshopbtninupdate(ActionEvent actionEvent) {
        // Get the updated workshop details from the text fields
        String workshopId = workshopidInupdate.getText();
        eventIdValidationInUpdateWorkshop();
        String workshopName = workshopnameInupdate.getText();
        eventNameValidationInUpdateWorkshop();
        String workshopLocation = workshoplocationInupdate.getText();
        eventLocationValidationInUpdateWorkshop();
        String workshopDescription = workshopdescriptionInupdate.getText();
        String date = String.valueOf(workshopdateInupdate.getValue());
        eventDateValidationInUpdateWorkshop();
        String workshopTime = workshoptimeInupdate.getText();
        eventTimeValidationInUpdateWorkshop();
        String workshopConductor = workshopconductorInupdate.getText();
        workshopConductorValidationInUpdateWorkshop();


        // Validate the updated details if necessary
        // if (workshopValidation == true) {
        //     // Perform validation and update details accordingly
        // }

        // Update workshop data in the database
        DataBaseConnection.updateWorkshopData(workshopId, workshopName, workshopLocation,  workshopDescription, date, workshopTime, workshopConductor);

        // Provide feedback to the user (e.g., show an alert)
        showAlert("Workshop Updated", "Workshop details have been successfully updated.");

        // Optionally, clear the fields or set them to default values
        workshopidInupdate.clear();
        workshopnameInupdate.clear();
        workshoplocationInupdate.clear();
        workshoptimeInupdate.clear();
        workshopdescriptionInupdate.clear();
        workshopconductorInupdate.clear();
        workshopdateInupdate.setValue(null);

    }


    boolean updateWorkshopAllValidation = true;
    public void eventIdValidationInUpdateWorkshop() {
        if (meetingIdInUpdate.getText().length() == 0){
            meetingIdInUpdate.setStyle("-fx-border-color: red");
            updateWorkshopAllValidation = false;

        } else {
            meetingIdInUpdate.setStyle("");
        }
    }

    public void eventNameValidationInUpdateWorkshop() {
        String eventName = meetingnameInUpdate.getText();

        // Validate event name
        if (eventName == null || eventName.length() == 0 || !eventName.matches("^[A-Za-z]*$")) {
            meetingnameInUpdate.setStyle("-fx-border-color: red");
            updateWorkshopAllValidation = false;
        } else {
            meetingnameInUpdate.setStyle("");
        }
    }


    public void eventLocationValidationInUpdateWorkshop() {
        String eventLocation = meetinglocationInUpdate.getText();

        // Validate event location
        if (eventLocation == null || eventLocation.length() == 0 || !eventLocation.matches("^[A-Za-z]*$")) {
            meetinglocationInUpdate.setStyle("-fx-border-color: red");
            updateWorkshopAllValidation = false;
        } else {
            meetinglocationInUpdate.setStyle("");
        }
    }



    public void eventTimeValidationInUpdateWorkshop() {
        String eventTime = meetingtimeInUpdate.getText();

        // Validate event time
        if (!validateWorkshopTimeUpdate(eventTime)) {
            meetingtimeInUpdate.setStyle("-fx-border-color: red");
            updateWorkshopAllValidation = false;
        } else {
            meetingtimeInUpdate.setStyle("");
        }
    }

    public boolean validateWorkshopTimeUpdate(String time) {
        // Allow an empty time field
        if (time == null || time.trim().isEmpty()) {
            return true;
        }

        // Validate time format (HH:mm)
        return time.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }

    public void workshopConductorValidationInUpdateWorkshop() {
        String workshopConductor = workshopconductorInupdate.getText();

        // Validate workshop conductor
        if (workshopConductor == null || workshopConductor.length() == 0 || !workshopConductor.matches("^[A-Za-z ]+$")) {
            workshopconductorInupdate.setStyle("-fx-border-color: red");
            createWorkshopAllValidation = false;
        } else {
            workshopconductorInupdate.setStyle("");
        }
    }


    public void eventDateValidationInUpdateWorkshop() {
        LocalDate selectedDate = meetingdateInUpdate.getValue();

        // Validate event date
        if (!validateWorkshopDateUpdate(selectedDate)) {
            meetingdateInUpdate.setStyle("-fx-border-color: red");
            updateWorkshopAllValidation = false;
        } else {
            meetingdateInUpdate.setStyle("");
        }
    }
    public boolean validateWorkshopDateUpdate(LocalDate selectedDate) {
        // Check if the selected date is not null and is in the future
        return selectedDate != null && selectedDate.isAfter(LocalDate.now());
    }

    
}