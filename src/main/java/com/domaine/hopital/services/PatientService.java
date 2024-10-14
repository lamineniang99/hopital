package com.domaine.hopital.services;

import com.domaine.hopital.dto.PatientDto;
import com.domaine.hopital.mappers.IPatientMapper;
import com.domaine.hopital.repositories.IPatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class PatientService implements IPatientService{

    private IPatientRepository patientRepository;
    private IPatientMapper patientMapper;


    @Override
    public List<PatientDto> getPatients() {
        return patientMapper.listPatientEntityToPatientDto(patientRepository.findAll());
    }

    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        return patientMapper.patientEntityToPatientDto(patientRepository.save(patientMapper.patientDtoToPatientEntity(patientDto)));
    }
}
