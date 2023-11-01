package com.example.oop_cw_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label label_registerNow;

    @FXML
    private void switchToRegisterNow(ActionEvent actionEvent) throws IOException {
        FXMLLoader registerPageLoader = new FXMLLoader(getClass().getResource("Register.fxml"));
        Parent root = registerPageLoader.load();


    }
}