package com.example.gestionpracticasempresa.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class LoginController implements Serializable {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField pswdField;
    @FXML
    private Button btnIniciarSesion;
    @FXML
    private Label info;

    @FXML
    protected void onHelloButtonClick() {
        info.setText("Welcome to JavaFX Application!");
    }
}