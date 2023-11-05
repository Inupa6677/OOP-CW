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
    private TextField txt_email;
    @FXML
    private AnchorPane studentLoginPane;
    @FXML
    private StackPane studentRegisterPane;
    @FXML
    private AnchorPane advisorLoginAnchorPane;
    @FXML
    private StackPane advisorRegisterPane;



    public void disablePane(){
        studentLoginPane.setVisible(false);
        studentRegisterPane.setVisible(false);
        advisorLoginAnchorPane.setVisible(false);
        advisorRegisterPane.setVisible(false);

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
        advisorRegisterPane.setVisible(true);
    }


}