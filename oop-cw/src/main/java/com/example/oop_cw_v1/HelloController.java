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
        String eventName = eventnameincreateevent.getText();
        String eventLocation = eventlocationincreateevent.getText();
        String eventTime = eventtimeincreateevent.getText();
        String eventDescription = eventdescriptionincreateevent.getText();
        String eventType = eventtypeincreateevent.getText();
        String eventDate = String.valueOf(eventDateincreateevent.getValue());

        // save event data to db after validation
        // if(eventvalidation == true) make the validation and add the details in to the condition
        Event event1 = new Event(eventId, eventName, eventLocation, eventTime, eventDescription, eventType, eventDate);
        DataBaseConnection.insertEventData(event1.getScheduleId(), event1.getScheduleName(), event1.getScheduleLocation(), event1.getScheduleTime(), event1.getScheduleDescription(), event1.getEventType(),event1.getScheduleTime());
        clearTextFieldsInEvent();
    }

    public void searchEventIdInUpdate(ActionEvent actionEvent) {
        String searchEventId = eventIdInUpdate.getText();

        Event foundEvent = MainSchedule.getEventDetailsById(searchEventId);

        if (foundEvent != null){
            // if event found then set text to update
            eventIdInUpdate.setText(foundEvent.getScheduleId());
            eventNameInUpdate.setText(foundEvent.getScheduleName());
            eventLocationInUpdate.setText(foundEvent.getScheduleLocation());
            eventTimeInUpdate.setText(foundEvent.getScheduleTime());
            eventDescriptionInUpdate.setText(foundEvent.getScheduleDescription());
            eventTypeInUpdate.setText(foundEvent.getEventType());
            dateInUpdate.setValue( LocalDate.parse(foundEvent.getScheduleDate()));
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
        String meetingName = meetingnameIncreatemeeting.getText();
        String meetingLocation = meetinglocationIncreatemeeting.getText();
        String meetingTime = meetingtimeIncreatemeeting.getText();
        String meetingDescription = meetingdescriptionIncreatemeeting.getText();
        String meetingType = meetingtypeIncreatemeeting.getText();
        String meetingDate = String.valueOf(meetingdateIncreatemeeting.getValue());

        // save event data to db after validation
        // if(eventvalidation == true) make the validation and add the details in to the condition
        Meeting meeting1 = new Meeting(meetingId, meetingName, meetingLocation, meetingTime, meetingDescription, meetingType, meetingDate);
        DataBaseConnection.insertMeetingData(meeting1.getScheduleId(), meeting1.getScheduleName(), meeting1.getScheduleLocation(), meeting1.getScheduleTime(), meeting1.getScheduleDescription(), meeting1.getMeetingType(),meeting1.getScheduleTime());
        clearTextFieldsInMeeting();

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
            meetingdateInUpdate.setValue(null);
        }

    }

    public void deleteMeetingdetailsClick(ActionEvent actionEvent){
        // Get the event ID to delete
        String deleteMeetingId = searchidFieldInMeeting.getPromptText();

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

            // Delete the event itself
            DataBaseConnection.deleteMeeting(deleteMeetingId);

            // Provide feedback to the user (e.g., show an alert)
            showAlert("Event Deleted", "Event details have been successfully deleted.");

            // Optionally, clear the fields or set them to default values
            meetingIdInUpdate.clear();
            meetingnameInUpdate.clear();
            meetinglocationInUpdate.clear();
            meetingtimeInUpdate.clear();
            meetingdescriptionInUpdate.clear();
            meetingtypeInUpdate.clear();
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
        String workshopName = workshopnameInCreateWorkshop.getText();
        String workshopLocation = workshoplocationInCreateWorkshop.getText();
        String workshopTime = workshopTimeInCreateWorkshop.getText();
        String workshopDescription = workshopdescriptionInCreateWorkshop.getText();
        String workshopConductor = workshopConductorInCreateWorkshop.getText();
        String workshopDate = String.valueOf(workshopDateInCreateWorkshop.getValue());

        // save event data to db after validation
        // if(eventvalidation == true) make the validation and add the details in to the condition
        Workshop workshop1 = new Workshop(workshopId, workshopName, workshopLocation, workshopTime, workshopDescription, workshopConductor, workshopDate);
        DataBaseConnection.insertMeetingData(workshop1.getScheduleId(), workshop1.getScheduleName(), workshop1.getScheduleLocation(), workshop1.getScheduleTime(), workshop1.getScheduleDescription(), workshop1.getConductor(),workshop1.getScheduleTime());
        clearTextFieldsInWorkshop();
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

            // Delete the event itself
            DataBaseConnection.deleteWorkshop(deleteWorkshopId);

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
        String eventName = eventNameInUpdate.getText();
        String location = eventLocationInUpdate.getText();
        String time = eventTimeInUpdate.getText();
        String description = eventDescriptionInUpdate.getText();
        String eventType = eventTypeInUpdate.getText();
        String eventDate = String.valueOf(dateInUpdate.getValue());

        // Validate the updated details if necessary
        // if (eventValidation == true) {
        //     // Perform validation and update details accordingly
        // }

        // Update event data in the database
        DataBaseConnection.updateEventData(eventId, eventName, location, time, description, eventType, eventDate);

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

    public void onsavebtninupdatemeeting(ActionEvent actionEvent) {
        // Get the updated meeting details from the text fields
        String meetingId = meetingIdInUpdate.getText();
        String meetingName = meetingnameInUpdate.getText();
        String meetingLocation = meetinglocationInUpdate.getText();
        String meetingTime = meetingtimeInUpdate.getText();
        String meetingDescription = meetingdescriptionInUpdate.getText();
        String meetingType = meetingtypeInUpdate.getText();
        String meetingDate = String.valueOf(meetingdateInUpdate.getValue());

        // Validate the updated details if necessary
        // if (meetingValidation == true) {
        //     // Perform validation and update details accordingly
        // }

        // Update meeting data in the database
        DataBaseConnection.updateMeetingData(meetingId, meetingName, meetingLocation, meetingTime, meetingDescription, meetingType, LocalDate.parse(meetingDate));

        // Provide feedback to the user (e.g., show an alert)
        showAlert("Meeting Updated", "Meeting details have been successfully updated.");

        // Optionally, clear the fields or set them to default values
        meetingIdInUpdate.clear();
        meetingnameInUpdate.clear();
        meetinglocationInUpdate.clear();
        meetingtimeInUpdate.clear();
        meetingdescriptionInUpdate.clear();
        meetingtypeInUpdate.clear();
        meetingdateInUpdate.setValue(null);

    }


    public void saveWorkshopbtninupdate(ActionEvent actionEvent) {
        // Get the updated workshop details from the text fields
        String workshopId = workshopidInupdate.getText();
        String workshopName = workshopnameInupdate.getText();
        String workshopLocation = workshoplocationInupdate.getText();
        String workshopTime = workshoptimeInupdate.getText();
        String workshopDescription = workshopdescriptionInupdate.getText();
        String workshopConductor = workshopconductorInupdate.getText();
        String date = String.valueOf(workshopdateInupdate.getValue());

        // Validate the updated details if necessary
        // if (workshopValidation == true) {
        //     // Perform validation and update details accordingly
        // }

        // Update workshop data in the database
        DataBaseConnection.updateWorkshopData(workshopId, workshopName, workshopLocation, workshopTime, workshopDescription, workshopConductor, date);

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
    public void OnSavebtnincreateGame(ActionEvent actionEvent) {
    }

    public void ondeletebtnclickingame(ActionEvent actionEvent) {
    }

    public void onSavebtnclickingame(ActionEvent actionEvent) {
    }

    public void onGameBtnClickInselecttoupdate(ActionEvent actionEvent) {
    }
}