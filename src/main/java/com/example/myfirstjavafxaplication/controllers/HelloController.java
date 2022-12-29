package com.example.myfirstjavafxaplication.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.myfirstjavafxaplication.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem aboutMenuButton;

    @FXML
    private MenuItem closeMenuButton;

    @FXML
    private Button registrationButton;

    @FXML
    private Button singUpButton;

    @FXML
    void initialize() {
        clickExitMenu();
        clickAboutMenu();
        clickRegistrationButton();
    }

    private void clickAboutMenu() {
        aboutMenuButton.setOnAction(event -> {
            aboutMenuButton.getParentMenu().getParentPopup().getScene().getWindow().hide();
        });
    }

    private void clickExitMenu() {
        closeMenuButton.setOnAction(event -> System.exit(0));
    }

    private void clickRegistrationButton() {
        registrationButton.setOnAction(event -> {
//                registrationButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("seamples/RegistrationSeample.fxml"));
            Stage registrationStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            try {
                registrationStage.setScene(new Scene(loader.load()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            registrationStage.show();
        });
    }



}