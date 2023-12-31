package com.example.gestionpracticasempresa.domain.company;

import com.example.gestionpracticasempresa.domain.student.Student;
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
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;
    private String company_name;
    private String phone_number;
    private String email;
    private String company_contact;
    private String incidents;

    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private List<Student> student;

}
