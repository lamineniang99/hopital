package com.domaine.hopital.mappers;

import com.domaine.hopital.dto.PatientDto;
import com.domaine.hopital.entities.PatientEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPatientMapper {
    List<PatientDto> listPatientEntityToPatientDto(List<PatientEntity> patientEntities);
    PatientDto patientEntityToPatientDto(PatientEntity patientEntity);
    PatientEntity patientDtoToPatientEntity(PatientDto patientDto);
}
