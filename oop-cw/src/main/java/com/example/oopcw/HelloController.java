package com.example.oopcw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController {
    public static void main(String[] args) {
    }

    @FXML
    private Button btnCreate;
    @FXML
    private Button btnBack;

    @FXML
    private Group groupFirst;

    @FXML
    private Group groupSecond;


    public void onClickCreateClub(ActionEvent actionEvent) {
        groupFirst.setVisible(false);
        groupSecond.setVisible(true);

    }


}