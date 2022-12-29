module com.example.myfirstjavafxaplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens com.example.myfirstjavafxaplication to javafx.fxml;
    requires java.persistence;
    exports com.example.myfirstjavafxaplication;
    exports com.example.myfirstjavafxaplication.controllers;
    opens com.example.myfirstjavafxaplication.controllers to javafx.fxml;
}