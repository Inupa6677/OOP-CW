package com.example.oop_cw_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;




import java.util.ArrayList;


public class HelloController {

    @FXML
    private Label label_registerNow;
    @FXML
    private Button btn_back;
    @FXML
    private TextField txt_email;
    @FXML
    private AnchorPane studentLoginPane;
    @FXML
    private StackPane studentRegisterPane;
    @FXML
    private AnchorPane advisorLoginAnchorPane;
    @FXML
    private StackPane advisorRegisterPane;
    @FXML
    private  AnchorPane frontPane;
    @FXML
    private TextField studentFirstNameField;
    @FXML
    private TextField studentLastNameField;
    @FXML
    private TextField studentIDField;
    @FXML
    private TextField studentGenderField;
    @FXML
    private DatePicker studentDoBField;
    @FXML
    private TextField studentcontactNumberField;
    @FXML
    private TextField studentEmailField;
    @FXML
    private PasswordField studentpasswordField;
    @FXML
    private PasswordField studentReEnterPasswordField;




    public void disablePane(){
        studentLoginPane.setVisible(false);
        studentRegisterPane.setVisible(false);
        advisorLoginAnchorPane.setVisible(false);
        advisorRegisterPane.setVisible(false);
        frontPane.setVisible(false);

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

        }else if(!studentIDField.getText().matches( "^[A-Za-z0-9]+$")) {
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
            // Display an error message, for example:
            // You can show a pop-up error message, set a label's text, or handle the error as needed
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

        // add the student data to list if validation is done
        if(studentValidation) {
            Student student  = new Student(firstName,lastName,gender,DoB,contactNumber,email,password,studentID);
            ArrayList<Student> registerStudentList = new ArrayList<>();
            registerStudentList.add(student);

        }









    }
}