package com.example.gestionpracticasempresa.domain.student;

import com.example.gestionpracticasempresa.domain.activity.Activity;
import com.example.gestionpracticasempresa.domain.company.Company;
import com.example.gestionpracticasempresa.domain.teacher.Teacher;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
//TODO: Poner nombre de la tabla
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;
    private String first_name;
    private String last_name;
    private String password;
    private String dni;
    private String date_of_birth;
    private String email;
    private String contact_phone;
    private Integer total_dual_hours;
    private Integer total_fct_hours;
    private String observations;

    @OneToMany(mappedBy = "student")
    private List<Activity> diary_activities;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "tutor")
    private Teacher tutor;


    public String toString( ) {

        String nombreTutor = "Sin tutor asignado";
        String nombreEmpresa = "Sin empresa asignada";
        Integer numeroDiariosActividades = 0;
        if (this.tutor!=null) nombreTutor = this.tutor.getFirst_name();
        if (this.company!=null) nombreEmpresa = this.company.getCompany_name();
        return "Student{" +
                "student_id=" + student_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", access_password='" + password + '\'' +
                ", dni='" + dni + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", email='" + email + '\'' +
                ", contact_phone='" + contact_phone + '\'' +
                ", total_dual_hours=" + total_dual_hours +
                ", total_fct_hours=" + total_fct_hours +
                ", observations='" + observations + '\'' +
                ", company=" + nombreEmpresa +
                ", tutor=" + nombreTutor +
                '}';
    }
}
