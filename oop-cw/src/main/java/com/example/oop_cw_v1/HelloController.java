package com.example.oop_cw_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloController {

    @FXML
    private Label label_registerNow;
    @FXML
    private Button btn_back;
    @FXML
    private Label label_error;
    @FXML
    private TextField txt_email;
    @FXML
    private AnchorPane LoginAnchorPane;
    @FXML
    private StackPane registerStackPane;



    public void disablePane(){
        LoginAnchorPane.setVisible(false);
        registerStackPane.setVisible(false);

    }

    public void switchToRegisterNow(MouseEvent mouseEvent) {
        disablePane();
        registerStackPane.setVisible(true);
    }

    public void switchTosLogin(ActionEvent actionEvent) {
        disablePane();
        LoginAnchorPane.setVisible(true);
    }

    public void switchToLogin() {
    }
}