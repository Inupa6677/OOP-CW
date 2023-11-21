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
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;
// Hi i am john

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












    public void searchEventIdInUpdate(ActionEvent actionEvent) {
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

    public void onsaveBtnIncreatemeeting(ActionEvent actionEvent) {
        disablePanes();

    }

    public void onBackBtnClickInCreateWorkshop(ActionEvent actionEvent) {
        disablePanes();
        selectEventTypePane.setVisible(true);
    }

    public void onSaveBtnClickInCreateWorkshop(ActionEvent actionEvent) {
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

    public void OnSavebtnincreateGame(ActionEvent actionEvent) {
    }

    public void onBackbtnincreategame(ActionEvent actionEvent) {
        disablePanes();
        selectEventTypePane.setVisible(true);
    }

    public void onSearchBtnInmeetingUpdate(ActionEvent actionEvent) {
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

    public void savebtnincreateevents(ActionEvent actionEvent) {

    }

    public void searchButtonInUpdate(ActionEvent actionEvent) {
    }

    public void onSaveBtnClickInUpdate(ActionEvent actionEvent) {
    }

    public void deleteEventBtnClick(ActionEvent actionEvent) {
    }
}