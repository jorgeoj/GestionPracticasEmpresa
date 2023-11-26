module com.example.gestionpracticasempresa {
    requires javafx.controls;
    requires javafx.fxml;

    requires lombok;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;

    opens com.example.gestionpracticasempresa.domain.student;
    opens com.example.gestionpracticasempresa.domain.company;
    opens com.example.gestionpracticasempresa.domain.teacher;
    opens com.example.gestionpracticasempresa.domain.activity;

    opens com.example.gestionpracticasempresa to javafx.fxml;
    opens com.example.gestionpracticasempresa.controllers to javafx.fxml;



    exports com.example.gestionpracticasempresa;
    exports com.example.gestionpracticasempresa.controllers;

}