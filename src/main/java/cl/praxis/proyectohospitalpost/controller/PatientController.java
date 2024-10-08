package cl.praxis.proyectohospitalpost.controller;
import cl.praxis.proyectohospitalpost.entity.Patient;
import cl.praxis.proyectohospitalpost.service.IPatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("/")
public class PatientController {

    private static final Logger LOG = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    private IPatientService patientService;

    @GetMapping()
    public String getAllPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("pacientes", patients);
        LOG.info("estoy obteniendo pacientes");
        return "patient";
    }

    @PostMapping("/create")
    public String createPatiente(@ModelAttribute Patient patient)    {
        patientService.savePatient(patient);
        return "redirect:/";

    }
    @DeleteMapping("/delete")
    public String deletePatient(@RequestParam Long id) {
        patientService.deletePatientsbyId(id);
        return "redirect:/";

    }

}

