package com.domaine.hopital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom", nullable = false, length = 50)
    private  String nom;
    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(name = "malade", nullable = false)
    private boolean malade ;
    @Column(name = "score", nullable = false)
    private int score ;
}
