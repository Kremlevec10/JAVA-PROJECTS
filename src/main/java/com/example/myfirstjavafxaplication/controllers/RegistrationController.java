package com.example.myfirstjavafxaplication.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.myfirstjavafxaplication.backend.CreatUser;
import com.example.myfirstjavafxaplication.backend.entity.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem aboutMenuButton;

    @FXML
    private TextField birthdayField;

    @FXML
    private MenuItem closeMenuButton;

    @FXML
    private TextField emailField;

    @FXML
    private Button loginButton;

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    private User user;
    private CreatUser creatUser;

    @FXML
    void initialize() {
        clickLoginButton();
    }

    private void clickLoginButton() {
        loginButton.setOnAction(event -> {
            user = new User();
            creatUser = new CreatUser();
            user.setFirstName(nameField.getText());
            user.seteMail(emailField.getText());
            user.setBirthdayDate(birthdayField.getText());
            user.setPassword(passwordField.getText());
            creatUser.actionWithTable(user);
        });
    }

}

