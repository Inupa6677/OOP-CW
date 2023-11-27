package com.example.oop_cw_v1;

import javafx.scene.control.Label;

import java.util.HashMap;

public class Student extends User{

    // Student's unique attributes
    private String studentID;

    //parameterized constructor


    public Student(String firstName, String lastName, String gender, String DoB, String contactNumber, String email, String password, String studentID) {
        super(firstName, lastName, gender, DoB, contactNumber,email,password);
        this.studentID = studentID;
    }
    public Student(){

    }

    // getters and setters for studentID


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public void displayUserInformation(String memberID, Label firstName, Label lastName, Label gender, Label DoB, Label contactNumber, Label email,Label studentID){
        HashMap<String, String> dataMap = DatabaseConnection.getAdvisorData(memberID);
        firstName.setText(dataMap.get("First Name"));

        // Check if the "Last Name" value is not null before setting it
        String retrievedLastName = dataMap.get("Last Name");
        if (retrievedLastName != null) {
            lastName.setText(retrievedLastName);
        } else {
            lastName.setText("");  // Set a default value or an empty string if it's null
        }
        gender.setText(dataMap.get("DOB"));
        DoB.setText(dataMap.get("Email"));
        contactNumber.setText(dataMap.get("Contact Number"));
        email.setText(dataMap.get("Email"));
        studentID.setText(dataMap.get("Student ID"));

    };



}
