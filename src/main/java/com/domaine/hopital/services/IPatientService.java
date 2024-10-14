package com.domaine.hopital.services;

import com.domaine.hopital.dto.PatientDto;

import java.util.List;

public interface IPatientService {
    List<PatientDto> getPatients();
    PatientDto createPatient(PatientDto patientDto);
}
