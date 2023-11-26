package com.example.oop_cw_v1;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


import java.util.List;


public class HelloController {


    @FXML
    private CheckBox advisorCheckBox;

    @FXML
    private Pane advisorClubPane;

    @FXML
    private TextField advisorContactNumberField;

    @FXML
    private Pane advisorDashBoardPane;

    @FXML
    private DatePicker advisorDoBField;

    @FXML
    private TextField advisorEmailField;

    @FXML
    private TextField advisorFirstNameField;

    @FXML
    private TextField advisorGenderField;

    @FXML
    private TextField advisorIDField;

    @FXML
    private TextField advisorLastNameField;

    @FXML
    private AnchorPane advisorLoginAnchorPane;

    @FXML
    private AnchorPane advisorMainPane;

    @FXML
    private PasswordField advisorPasswordField;

    @FXML
    private PasswordField advisorReEnterPasswordField;

    @FXML
    private StackPane advisorRegisterPane;

    @FXML
    private Button btn_back;

    @FXML
    private Button btn_back1;

    @FXML
    private Button btn_google;

    @FXML
    private Button btn_google1;

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_login1;

    @FXML
    private AnchorPane frontGifPane;

    @FXML
    private AnchorPane frontPane;

    @FXML
    private Label label_error;

    @FXML
    private Label label_error1;

    @FXML
    private Label label_forgotPw;

    @FXML
    private Label label_forgotPw1;

    @FXML
    private Label label_registerNow;

    @FXML
    private Label label_registerNow1;

    @FXML
    private TextField loginAdvisorEmaillField;

    @FXML
    private PasswordField loginAdvisorPasswordField;

    @FXML
    private TextField loginStudentEmailField;

    @FXML
    private PasswordField loginStudentPasswordField;

    @FXML
    private TableColumn<AcademicClub, String> studentAcedemicCol;

    @FXML
    private CheckBox studentCheckBox;

    @FXML
    private TableColumn<Club, String> studentClubDescriptionCol;

    @FXML
    private TableColumn<Club, String> studentClubIdCol;

    @FXML
    private Label studentClubMemberLable1;

    @FXML
    private TableColumn<Club, Integer> studentClubMemeberCol;

    @FXML
    private TableColumn<Club, String> studentClubNameCol;

    @FXML
    private Label studentClubNameLable1;

    @FXML
    private Pane studentClubPane;

    @FXML
    private TextField studentClubSearchField;

    @FXML
    private TableView<Club> studentClubTableView;

    @FXML
    private Pane studentDashBoardPane;

    @FXML
    private Label studentDescriptionLabel1;

    @FXML
    private DatePicker studentDoBField;

    @FXML
    private TextField studentEmailField;

    @FXML
    private TextField studentFirstNameField;

    @FXML
    private TextField studentGenderField;

    @FXML
    private TextField studentIDField;

    @FXML
    private TextField studentLastNameField;

    @FXML
    private AnchorPane studentLoginPane;

    @FXML
    private AnchorPane studentMainPane;

    @FXML
    private PasswordField studentReEnterPasswordField;

    @FXML
    private StackPane studentRegisterPane;

    @FXML
    private TableColumn<SportClub, String> studentSportCol;

    @FXML
    private Pane studentTaskBarPane;

    @FXML
    private Pane studentTaskBarPane1;

    @FXML
    private TextField studentcontactNumberField;

    @FXML
    private PasswordField studentpasswordField;

    private String selectedStudentID;
    private String selectedClubID;



    public void disablePane(){
        studentLoginPane.setVisible(false);
        studentRegisterPane.setVisible(false);
        advisorLoginAnchorPane.setVisible(false);
        advisorRegisterPane.setVisible(false);
        frontPane.setVisible(false);
        frontGifPane.setVisible(false);
        studentMainPane.setVisible(false);
        advisorMainPane.setVisible(false);
        studentDashBoardPane.setVisible(false);
        studentClubPane.setVisible(false);
        advisorClubPane.setVisible(false);
        advisorDashBoardPane.setVisible(false);


    }

    public void switchToStudentRegisterNow(MouseEvent mouseEvent) {
        disablePane();
        studentRegisterPane.setVisible(true);
    }
    public void switchToAdvisorRegisterNow(MouseEvent mouseEvent) {
        disablePane();
        advisorRegisterPane.setVisible(true);
    }

    public void switchToStudentLogin(ActionEvent actionEvent) {
        disablePane();
        studentLoginPane.setVisible(true);
    }
    public void switchToAdvisorLogin(ActionEvent actionEvent) {
        disablePane();
        advisorLoginAnchorPane.setVisible(true);
    }


    public void advisorLoginClick(ActionEvent actionEvent) {
        disablePane();
        advisorLoginAnchorPane.setVisible(true);

    }

    public void studentLoginClick(ActionEvent actionEvent) {
        disablePane();
        studentLoginPane.setVisible(true);

    }

    public void backToFrontPaneClick(ActionEvent actionEvent) {
        disablePane();
        frontPane.setVisible(true);
    }

    public void studentRegisterClick(ActionEvent actionEvent) {
        String firstName = studentFirstNameField.getText();
        String lastName =  studentLastNameField.getText();
        String studentID = studentIDField.getText();
        String gender = studentGenderField.getText();
        String DoB = String.valueOf(studentDoBField.getValue());
        String contactNumber = studentcontactNumberField.getText();
        String email = studentEmailField.getText();
        String password = studentpasswordField.getText();


        // Validation for students attributes
        boolean studentValidation = true;
        // validation for first name
        if(studentFirstNameField.getText().isEmpty()){
            studentValidation = false;
            studentFirstNameField.setStyle("-fx-border-color: red");
        } else if(!studentFirstNameField.getText().matches( "^[A-Za-z]*$")) {
            studentValidation = false;
            studentFirstNameField.setStyle("-fx-border-color: red");
        }else{
            studentFirstNameField.setStyle("");
        }
        // validation for last name
        if(studentLastNameField.getText().isEmpty()){
            studentValidation = false;
            studentLastNameField.setStyle("-fx-border-color: red");
        } else if(!studentLastNameField.getText().matches( "^[A-Za-z]*$")) {
            studentValidation = false;
            studentLastNameField.setStyle("-fx-border-color: red");
        }else{
            studentValidation = true;
            studentLastNameField.setStyle("");
        }
        // validation for student ID
        if(studentIDField.getText().isEmpty()){
            studentValidation = false;
            studentIDField.setStyle("-fx-border-color: red");
        }else if(studentIDField.getText().length()>4){
            studentValidation = false;
            studentIDField.setStyle("-fx-border-color: red");

        }else if(!studentIDField.getText().matches("^[A-Za-z0-9]*$")) {
            studentValidation = false;
            studentIDField.setStyle("-fx-border-color: red");
        }else{
            studentValidation = true;
            studentIDField.setStyle("");
        }
        // validation for gender
        String genderInput = studentGenderField.getText().toLowerCase(); // Convert input to lowercase for validation
        if(studentGenderField.getText().isEmpty()){
            studentValidation = false;
            studentGenderField.setStyle("-fx-border-color: red");
        } else if(!genderInput.equals("male") && !genderInput.equals("female")) {
            studentValidation = false;
            studentGenderField.setStyle("-fx-border-color: red");

        }else{
            studentGenderField.setStyle("");
        }
        // validation for DoB
        if(studentDoBField.getValue() == null){
            studentValidation = false;
            studentDoBField.setStyle("-fx-border-color: red");
        }else{
            studentDoBField.setStyle("");
        }
        // validation for contact number
        if(studentcontactNumberField.getText().isEmpty()){
            studentValidation = false;
            studentcontactNumberField.setStyle("-fx-border-color: red");
        }else if(!studentcontactNumberField.getText().matches( "^[0-9]{10}$")){
            studentValidation = false;
            studentcontactNumberField.setStyle("-fx-border-color: red");
        }else if(studentcontactNumberField.getText().length() != 10){
            studentValidation = false;
            studentcontactNumberField.setStyle("-fx-border-color: red");
        }else {
            studentcontactNumberField.setStyle("");
        }
        // validation for email
        if(studentEmailField.getText().isEmpty()){
            studentValidation = false;
            studentEmailField.setStyle("-fx-border-color: red");
        }else if(!studentEmailField.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            studentValidation = false;
            studentEmailField.setStyle("-fx-border-color: red");
        }else{
            studentEmailField.setStyle("");
        }
        // validation for password
        if(!studentReEnterPasswordField.getText().matches(studentpasswordField.getText())){
            studentValidation = false;
            studentReEnterPasswordField.setStyle("-fx-border-color: red");
            studentpasswordField.setStyle("-fx-border-color: red");
        }else if(studentpasswordField.getText().isEmpty() || studentReEnterPasswordField.getText().isEmpty()){
            studentValidation = false;
            studentReEnterPasswordField.setStyle("-fx-border-color: red");
            studentpasswordField.setStyle("-fx-border-color: red");
        }else{
            studentpasswordField.setStyle("");
            studentReEnterPasswordField.setStyle("");
        }


        // add the student data to database if validation is done
        if(studentValidation == true) {
            Student student  = new Student(firstName,lastName,gender,DoB,contactNumber,email,password,studentID);
            DatabaseConnection.insertStudentData(student.getStudentID(),student.getFirstName(),student.getLastName(),student.getDoB(),student.getEmail(),student.getPassword(),student.getContactNumber(),student.getGender());

        }

    }


    public void advisorRegisterClick(ActionEvent actionEvent) {
        String firstName = advisorFirstNameField.getText();
        String lastName =  advisorLastNameField.getText();
        String advisorID = advisorIDField.getText();
        String gender = advisorGenderField.getText();
        String DoB = String.valueOf(advisorDoBField.getValue());
        String contactNumber = advisorContactNumberField.getText();
        String email = advisorEmailField.getText();
        String password = advisorPasswordField.getText();

        // Validation for advisor's attributes
        boolean advisorValidation = true;
        // validation for first name
        if(advisorFirstNameField.getText().isEmpty()){
            advisorValidation = false;
            advisorFirstNameField.setStyle("-fx-border-color: red");
        } else if(!advisorFirstNameField.getText().matches( "^[A-Za-z]*$")) {
            advisorValidation = false;
            advisorFirstNameField.setStyle("-fx-border-color: red");
        }else{
            advisorFirstNameField.setStyle("");
        }
        // validation for last name
        if(advisorLastNameField.getText().isEmpty()){
            advisorValidation = false;
            advisorLastNameField.setStyle("-fx-border-color: red");
        } else if(!advisorLastNameField.getText().matches( "^[A-Za-z]*$")) {
            advisorValidation = false;
            advisorLastNameField.setStyle("-fx-border-color: red");
        }else{
            advisorValidation = true;
            advisorLastNameField.setStyle("");
        }
        // validation for advisor ID
        if(advisorIDField.getText().isEmpty()){
            advisorValidation = false;
            advisorIDField.setStyle("-fx-border-color: red");
        }else if(advisorIDField.getText().length()>4){
            advisorValidation = false;
            advisorIDField.setStyle("-fx-border-color: red");

        }else if(!advisorIDField.getText().matches("^[A-Za-z0-9]*$")) {
            advisorValidation = false;
            advisorIDField.setStyle("-fx-border-color: red");
        }else{
            advisorValidation = true;
            advisorIDField.setStyle("");
        }
        // validation for gender
        String genderInput = advisorGenderField.getText().toLowerCase(); // Convert input to lowercase for validation
        if(advisorGenderField.getText().isEmpty()){
            advisorValidation = false;
            advisorGenderField.setStyle("-fx-border-color: red");
        } else if(!genderInput.equals("male") && !genderInput.equals("female")) {
            advisorValidation = false;
            advisorGenderField.setStyle("-fx-border-color: red");

        }else{
            advisorGenderField.setStyle("");
        }
        // validation for DoB
        if(advisorDoBField.getValue() == null){
            advisorValidation = false;
            advisorDoBField.setStyle("-fx-border-color: red");
        }else{
            advisorDoBField.setStyle("");
        }
        // validation for contact number
        if(advisorContactNumberField.getText().isEmpty()){
            advisorValidation = false;
            advisorContactNumberField.setStyle("-fx-border-color: red");
        }else if(!advisorContactNumberField.getText().matches( "^[0-9]{10}$")){
            advisorValidation = false;
            advisorContactNumberField.setStyle("-fx-border-color: red");
        }else if(advisorContactNumberField.getText().length() != 10){
            advisorValidation = false;
            advisorContactNumberField.setStyle("-fx-border-color: red");
        }else {
            advisorContactNumberField.setStyle("");
        }
        // validation for email
        if(advisorEmailField.getText().isEmpty()){
            advisorValidation = false;
            advisorEmailField.setStyle("-fx-border-color: red");
        }else if(!advisorEmailField.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            advisorValidation = false;
            advisorEmailField.setStyle("-fx-border-color: red");
        }else{
            advisorEmailField.setStyle("");
        }
        // validation for password
        if(!advisorReEnterPasswordField.getText().matches(advisorPasswordField.getText())){
            advisorValidation = false;
            advisorReEnterPasswordField.setStyle("-fx-border-color: red");
            advisorPasswordField.setStyle("-fx-border-color: red");
        }else if(advisorPasswordField.getText().isEmpty() || advisorReEnterPasswordField.getText().isEmpty()){
            advisorValidation = false;
            advisorReEnterPasswordField.setStyle("-fx-border-color: red");
            advisorPasswordField.setStyle("-fx-border-color: red");
        }else{
            advisorPasswordField.setStyle("");
            advisorReEnterPasswordField.setStyle("");
        }

        // add the student data to database if validation is done
        if(advisorValidation){
            Advisor advisor = new Advisor(firstName,lastName,gender,DoB,contactNumber,email,password,advisorID);
            DatabaseConnection.insertAdvisorData(advisor.getAdvisorID(),advisor.getFirstName(),advisor.getLastName(),advisor.getDoB(),advisor.getEmail(),advisor.getPassword(),advisor.getContactNumber(),advisor.getGender());

        }else{
            System.out.println("Check the inputs");
        }
    }
    // code for student login to sacms.
    public void loginStudentClick(ActionEvent actionEvent) {
        String id = loginStudentEmailField.getText();
        String password = loginStudentPasswordField.getText();
        if (DatabaseConnection.checkStudentLogin(id,password)){
            System.out.println("Student logged in successfully");
            disablePane();
            studentMainPane.setVisible(true);
            studentDashBoardPane.setVisible(true);

        }else{
            System.out.println("Student login failed");
        }
    }

    // code for student login to sacms.
    public void loginAdvisorClick(ActionEvent actionEvent) {
        String id = loginAdvisorEmaillField.getText();
        String password = loginAdvisorPasswordField.getText();
        if (DatabaseConnection.checkAdvisorLogin(id,password)){
            System.out.println("Advisor logged in successfully");
            disablePane();
            advisorMainPane.setVisible(true);
            advisorDashBoardPane.setVisible(true);


        }else{
            System.out.println("Advisor login failed");
        }
    }

    public void getStartClick(ActionEvent actionEvent) {
        disablePane();
        frontPane.setVisible(true);
    }

    public void studentDashboradClick(ActionEvent actionEvent) {
        disablePane();
        studentMainPane.setVisible(true);
        studentDashBoardPane.setVisible(true);
    }

    // initializing the student club view table
    @FXML
    void initialize() {
        // Set up columns
        studentClubIdCol.setCellValueFactory(new PropertyValueFactory<>("clubId"));
        studentClubNameCol.setCellValueFactory(new PropertyValueFactory<>("clubName"));
        studentClubDescriptionCol.setCellValueFactory(new PropertyValueFactory<>("clubDescription"));
        studentClubMemeberCol.setCellValueFactory(new PropertyValueFactory<>("members"));
        studentSportCol.setCellValueFactory(new PropertyValueFactory<>("sport"));
        studentAcedemicCol.setCellValueFactory(new PropertyValueFactory<>("academicType"));

        // Retrieve and set data in the table
        List<Club> clubList = DatabaseConnection.getClubData();
        studentClubTableView.setItems(FXCollections.observableList(clubList).sorted());
    }


    public void studentClubViewClick(ActionEvent actionEvent) {
        disablePane();
        studentMainPane.setVisible(true);
        studentClubPane.setVisible(true);

    }

    public void studentEventViewClick(ActionEvent actionEvent) {
        // Inupa has created this one
    }

    public void advisorDashboardClick(ActionEvent actionEvent) {
        disablePane();
        advisorMainPane.setVisible(true);
        advisorDashBoardPane.setVisible(true);
    }

    public void advisiorClubViewClick(ActionEvent actionEvent) {
        disablePane();
        advisorMainPane.setVisible(true);
        advisorClubPane.setVisible(true);
    }

    public void advisorEventViewClick(ActionEvent actionEvent) {
    }

    public void advisorAttendenceTrackingViewClick(ActionEvent actionEvent) {
    }

    public void studentClubJoinClick(ActionEvent actionEvent) {

        String studentId = loginStudentEmailField.getText();
        Club selectedClub = studentClubTableView.getSelectionModel().getSelectedItem();


        if (selectedClub != null && studentId != null) {
            // Store the IDs in variables

            selectedClubID = selectedClub.getClubId();

            // Call the method to add the student to the club
            DatabaseConnection.addStudentToClub(studentId, selectedClubID);
            System.out.println("Student joined the club!");

        } else {
            System.out.println("Please select a student and a club.");
        }



    }
}