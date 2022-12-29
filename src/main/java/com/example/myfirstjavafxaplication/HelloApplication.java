package com.example.myfirstjavafxaplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage STAGE;

    @Override
    public void start(Stage stage) throws IOException {
        STAGE = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("seamples/HeadSeample.fxml"));
        System.out.println(fxmlLoader.getLocation());
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}