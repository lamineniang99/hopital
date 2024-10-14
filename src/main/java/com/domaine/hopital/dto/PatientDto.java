package com.domaine.hopital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PatientDto {
    private Long id;
    private  String nom;
    private String prenom;
    private Date birthDate;
    private boolean malade ;
    private int score ;
}
