package com.example.gestionpracticasempresa.controllers;

import com.example.gestionpracticasempresa.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField pswdField;
    @FXML
    private Button btnIniciarSesion;
    @FXML
    private Label info;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
    @FXML
    public void login(ActionEvent actionEvent) {
        String user = txtUsuario.getText();
        String pass = pswdField.getText();

        if (user.length() < 4 || pass.length() < 4) {
            info.setText("Introduce los datos");
            info.setStyle("-fx-text-fill: red;");

        } else {
            //TODO : Mirar como controlar el tipo de usuario y cambiar lo de abajo para inciar sesion

            // ACCESO A BASE DE DATOS PARA LA VALIDACION
            /*
            User u = (new UserDAOImp()).validateUser(user, pass);

            if (u == null) {
                info.setText("Error, datos incorrectos");
                info.setStyle("-fx-text-fill: red;");
            } else {
                Sesion.setCurrentUser(u);

                // Guardar usuario en sesión e ir a la próxima ventana
                Main.loadWindow("ventana-principal.fxml");
            }
            */
        }
    }
}