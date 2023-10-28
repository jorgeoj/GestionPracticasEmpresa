module com.example.gestionpracticasempresa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestionpracticasempresa to javafx.fxml;
    exports com.example.gestionpracticasempresa;
}