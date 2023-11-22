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
    private TextField eventtypeInCreateEvents;

    @FXML
    private DatePicker gameDateInCreateGame;

    @FXML
    private TextField gameDescriptionInCreateGame;

    @FXML
    private TextField gameIdInCreateGame;

    @FXML
    private TextField gameLocationInCreateGame;

    @FXML
    private TextField gameNameInCreateGame;

    @FXML
    private TextField gameRewardInCreateGame;

    @FXML
    private TextField gameTimeInCreateGame;

    @FXML
    private DatePicker gamedateinupdate;

    @FXML
    private TextField gamedescriptioninupdate;

    @FXML
    private TextField gameidinupdate;

    @FXML
    private TextField gamelocationinupdate;

    @FXML
    private TextField gamenameinupdate;

    @FXML
    private TextField gamerewardinupdate;

    @FXML
    private TextField gametimeinupdate;

    @FXML
    private TextField locationInCreateEvents;

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
    void backbtnincreateevents(ActionEvent event) {

    }



    @FXML
    void clickCreateBtnClick(ActionEvent event) {

    }







    public void disablePanes(){
        eventPane.setVisible(false);
        updateEvenetPane.setVisible(false);
        eventCreationPane.setVisible(false);
        selectEventTypePane.setVisible(false);
        createMeetingPane.setVisible(false);
        createWorkshopPane.setVisible(false);
        selectEventTypePane.setVisible(false);
        createGamePane.setVisible(false);
        updateEvenetPane.setVisible(false);
        updateMeetingDetailsPane.setVisible(false);
        updateWorkshopDetailsPane.setVisible(false);
        updateGameDetailsPane.setVisible(false);
    }

    @FXML
    private void switchToRegisterNow(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
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
        selectEventTypePane.setVisible(true);
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
//        disablePanes();
//        selectEventTypePane.setVisible(true);
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


    public void backBtninselectingevents(ActionEvent actionEvent) {
        disablePanes();
        eventPane.setVisible(true);
    }

    public void onBackBtnInCreateMeeting(ActionEvent actionEvent) {
        disablePanes();
        selectEventTypePane.setVisible(true);
    }



    public void onBackBtnClickInCreateWorkshop(ActionEvent actionEvent) {
        disablePanes();
        selectEventTypePane.setVisible(true);
    }



    public void onEventBtnClickInselecttoupdate(ActionEvent actionEvent) {
        disablePanes();
        updateEvenetPane.setVisible(true);
    }

    public void onMeetingBtnClickInselecttoupdate(ActionEvent actionEvent) {
        disablePanes();
        updateMeetingDetailsPane.setVisible(true);
    }

    public void onWorkshopBtnClickInselecttoupdate(ActionEvent actionEvent) {
       disablePanes();
       updateWorkshopDetailsPane.setVisible(true);
    }

    public void onGameBtnClickInselecttoupdate(ActionEvent actionEvent) {
        disablePanes();
        updateGameDetailsPane.setVisible(true);
    }

    public void onBackBtnClickInselecttoupdate(ActionEvent actionEvent) {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }

    public void onBackbtnincreategame(ActionEvent actionEvent) {
        disablePanes();
        selectEventTypePane.setVisible(true);
    }

    public void deleteWorkshopbtninupdate(ActionEvent actionEvent) {
    }

    public void saveWorkshopbtninupdate(ActionEvent actionEvent) {
    }

    public void backWorkshopbtninupdate(ActionEvent actionEvent) {
        disablePanes();
        selectUpdateEventTypePane.setVisible(true);
    }

    public void ondeletebtnclickingame(ActionEvent actionEvent) {
    }

    public void onSavebtnclickingame(ActionEvent actionEvent) {
    }

    public void onbackbtnclickingame(ActionEvent actionEvent) {
        disablePanes();
        selectEventTypePane.setVisible(true);
    }

    public void onsavebtnincreateevent(ActionEvent actionEvent) {
        // Getting data from the text fields
        String eventId = eventidincreateevent.getText();
        String eventName = eventnameincreateevent.getText();
        String eventLocation = eventlocationincreateevent.getText();
        String eventTime = eventtimeincreateevent.getText();
        String eventDescription = eventdescriptionincreateevent.getText();
        String eventType = eventtypeincreateevent.getText();
        LocalDate eventDate = eventDateincreateevent.getValue();

        // Convert eventTime to LocalDateTime
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.of(eventDate, LocalTime.parse(eventTime, timeFormatter));

        // Convert LocalDateTime to Date
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        // Create an instance of the Event class
        Event event = new Event(eventId, eventName, eventLocation, eventDescription, date, localDateTime, eventType);

        DataBaseConnection.saveEventToDatabase(event);

        clearTextFieldsInEvent();

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
        // Getting data from the text fields

        String meetingId = meetingIdIncreatemeeting.getText();
        String meetingName = meetingnameIncreatemeeting.getText();
        String meetingLocation = meetinglocationIncreatemeeting.getText();
        String meetingTime = meetingtimeIncreatemeeting.getText();
        String meetingDescription = meetingdescriptionIncreatemeeting.getText();
        String meetingType = meetingtypeIncreatemeeting.getText();
        LocalDate meetingDate = meetingdateIncreatemeeting.getValue();

        // Convert eventTime to LocalDateTime
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.of(meetingDate, LocalTime.parse(meetingTime, timeFormatter));

        // Convert LocalDateTime to Date
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        // Create an instance of the Event class
        Meeting meeting = new Meeting(meetingId, meetingName, meetingLocation, meetingDescription, date, localDateTime, meetingType);
        DataBaseConnection.saveMeetingToDatabase(meeting);

        clearTextFieldsInMeeting();

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
        // Getting data from the text fields

        String workshopId = workshopIdInCreateWorkshop.getText();
        String workshopName = workshopnameInCreateWorkshop.getText();
        String workshopLocation = workshoplocationInCreateWorkshop.getText();
        String workshopTime = workshopTimeInCreateWorkshop.getText();
        String workshopDescription = workshopdescriptionInCreateWorkshop.getText();
        String workshopConductor = workshopConductorInCreateWorkshop.getText();
        LocalDate workshopDate = workshopDateInCreateWorkshop.getValue();

        // Convert eventTime to LocalDateTime
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.of(workshopDate, LocalTime.parse(workshopTime, timeFormatter));

        // Convert LocalDateTime to Date
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        // Create an instance of the Event class
        Workshop workshop = new Workshop(workshopId, workshopName, workshopLocation, workshopDescription, date, localDateTime, workshopConductor);

        DataBaseConnection.saveWorkshopToDatabase(workshop);

        clearTextFieldsInWorkshop();

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


    public void OnSavebtnincreateGame(ActionEvent actionEvent) {
        // Getting data from the text fields

        String gameId = gameIdInCreateGame.getText();
        String gameName = gameNameInCreateGame.getText();
        String gameLocation = gameLocationInCreateGame.getText();
        String gameTime = gameTimeInCreateGame.getText();
        String gameDescription = gameDescriptionInCreateGame.getText();
        String gameReward = gameRewardInCreateGame.getText();
        LocalDate gameDate = gameDateInCreateGame.getValue();

        // Convert eventTime to LocalDateTime
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.of(gameDate, LocalTime.parse(gameTime, timeFormatter));

        // Convert LocalDateTime to Date
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        // Create an instance of the Event class
        Game game = new Game(gameId, gameName, gameLocation, gameDescription, date, localDateTime, gameReward);

        DataBaseConnection.saveGameToDatabase(game);

        clearTextFieldsInGame();

    }

    private void clearTextFieldsInGame() {
        // Clear the text fields in meeting
        gameIdInCreateGame.clear();
        gameNameInCreateGame.clear();
        gameLocationInCreateGame.clear();
        gameTimeInCreateGame.clear();
        gameDescriptionInCreateGame.clear();
        gameRewardInCreateGame.clear();
        gameDateInCreateGame.getEditor().clear();
    }



    public void searchEventIdInUpdate(ActionEvent actionEvent) {
        // Assuming eventIdTextField is a TextField where users input the event ID
        String eventId = searchFieldInUpdate.getText();

        Event event = DataBaseConnection.getEventById(eventId);

        if (event != null) {
            // Set prompt text for each text field with the retrieved event data
            eventidincreateevent.setText(event.getScheduleId());
            eventnameincreateevent.setText(event.getScheduleName());
            eventlocationincreateevent.setText(event.getScheduleLocation());
            eventtimeincreateevent.setText(event.getScheduleTime().format(String.valueOf(DateTimeFormatter.ofPattern("HH:mm:ss"))));
            eventdescriptionincreateevent.setText(event.getScheduleDescription());
            eventtypeincreateevent.setText(event.getEventType());

            // For the date field, you can convert the date to a string and set it as prompt text
            eventDateincreateevent.setPromptText(event.getScheduleDate().toString());
        } else {
            // Handle the case when the event with the given ID is not found
            // You can display a message or clear the fields
            clearTextFieldsInEvent();
        }
    }

    public void onSaveBtnClickInUpdateevents(ActionEvent actionEvent) {
        // Assuming you have the updated details in the prompt text fields
        String eventId = eventidincreateevent.getText();
        String eventName = eventnameincreateevent.getText();
        String eventLocation = eventlocationincreateevent.getText();
        String eventDescription = eventdescriptionincreateevent.getText();
        LocalDateTime eventTime = LocalDateTime.parse(eventtimeincreateevent.getText(), DateTimeFormatter.ofPattern("HH:mm:ss"));
        String eventType = eventtypeincreateevent.getText();
        LocalDate eventDate = LocalDate.parse(eventDateincreateevent.getPromptText());

        // Convert eventTime to LocalDateTime
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.of(eventDate, LocalTime.parse(eventTime, timeFormatter));

        // Convert LocalDateTime to Date
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        Event updatedEvent = new Event(eventId, eventName, eventLocation, eventDescription, date, localDateTime, eventType);

        // Update the event in the database
        DataBaseConnection.updateEventInDatabase(updatedEvent);

    }

    // make editions in this method
    public void deleteEventBtnClick(ActionEvent actionEvent) {
        // Assuming eventIdTextField is a TextField where users input the event ID to delete
        String eventIdToDelete = searchFieldInUpdate.getText();

        // Delete the event from the database
        DataBaseConnection.deleteEventById(eventIdToDelete);

        // Optionally, you can clear the text fields or update the UI as needed
        clearTextFieldsInEvent();
    }


    public void onSearchBtnInmeetingUpdate(ActionEvent actionEvent) {
        // Assuming eventIdTextField is a TextField where users input the event ID
        String eventId = searchFieldInUpdate.getText();

        Event event = DataBaseConnection.getEventById(eventId);

        if (event != null) {
            // Set prompt text for each text field with the retrieved event data
            eventidincreateevent.setText(event.getScheduleId());
            eventnameincreateevent.setText(event.getScheduleName());
            eventlocationincreateevent.setText(event.getScheduleLocation());
            eventtimeincreateevent.setText(event.getScheduleTime().format(String.valueOf(DateTimeFormatter.ofPattern("HH:mm:ss"))));
            eventdescriptionincreateevent.setText(event.getScheduleDescription());
            eventtypeincreateevent.setText(event.getEventType());

            // For the date field, you can convert the date to a string and set it as prompt text
            eventDateincreateevent.setPromptText(event.getScheduleDate().toString());
        } else {
            // Handle the case when the event with the given ID is not found
            // You can display a message or clear the fields
            clearTextFieldsInEvent();
        }
    }









}