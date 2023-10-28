package com.example.gestionpracticasempresa;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
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
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}