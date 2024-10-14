package com.domaine.hopital.web;

import com.domaine.hopital.dto.PatientDto;
import com.domaine.hopital.services.IPatientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private IPatientService patientService;

    @GetMapping(path = "/patients")
    public String patients(Model model) {
        List<PatientDto> patientDtos = patientService.getPatients();
        model.addAttribute("patients", patientDtos);
        return "patients/patients";
    }

    @GetMapping(path = "index")
    public String index(){
        return "index";
    }
}
