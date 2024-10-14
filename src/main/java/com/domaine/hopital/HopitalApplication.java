package com.domaine.hopital;

import com.domaine.hopital.dto.PatientDto;

import com.domaine.hopital.services.IPatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

	private final IPatientService patientService;
	private final Logger log = LoggerFactory.getLogger(HopitalApplication.class);

	// Injection par constructeur
	public HopitalApplication(IPatientService patientService) {
		this.patientService = patientService;
	}

	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Création de patients pour test
		patientService.createPatient(new PatientDto(null, "Lamine", "Niang", new Date(), false, 12));
		patientService.createPatient(new PatientDto(null, "Tall", "Black", new Date(), false, 12));

		log.info("=============================================================================================");
		// Affichage des patients
		patientService.getPatients().forEach(patientDto ->
				log.info(patientDto.getNom() + " " + patientDto.getPrenom())
		);
	}
}
