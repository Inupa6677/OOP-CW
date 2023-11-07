package com.example.oop_cw_v1;

public class DatabaseConnection {
    public void advisorFirstNameValidation() {

        if (advisorFirstName.getText().length() == 0){
            advisorFirstName.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;

        } else if (!advisorFirstName.getText().matches( "^[A-Za-z]*$")) {
            advisorFirstName.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;


        } else {
            advisorFirstName.setStyle("");

        }
    }

    public void advisorLastNameValidation() {

        if (advisorLastName.getText().length() == 0){
            advisorLastName.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;


        } else if (!advisorLastName.getText().matches( "^[A-Za-z]*$")) {
            advisorLastName.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;


        } else {
            advisorLastName.setStyle("");

        }
    }

    public void advisorUserNameValidation() {

        if (advisorUsername.getText().length() == 0) {
            advisorUsername.setStyle("-fx-border-color: red");

        } else {
            advisorUsername.setStyle("");
            allValidatedAdvisor = true;
        }

    }

    public void advisorEmailValidation() {

        if (advisorEmail.getText().length() == 0){
            advisorEmail.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;


        } else if (!advisorEmail.getText().matches( "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            advisorEmail.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;


        } else {
            advisorEmail.setStyle("");

        }

    }

    public void advisorTeachingIDValidation() {

        if (advisorTeachingID.getText().length() == 0){
            advisorTeachingID.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;


        } else if (!advisorTeachingID.getText().matches( "^[A-Za-z]{2}[0-9]{5}$")) {
            advisorTeachingID.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;


        } else {
            advisorTeachingID.setStyle("");

        }

    }

    public void advisorPasswordValidation() {


        if (! advisorConfirmPassword.getText().matches(advisorPassword.getText())) {
            advisorConfirmPassword.setStyle("-fx-border-color: red");
            allValidatedAdvisor = false;

        } else {
            advisorConfirmPassword.setStyle("");
}
}
}
