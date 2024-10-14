package com.domaine.hopital.repositories;

import com.domaine.hopital.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<PatientEntity, Long> {
}
