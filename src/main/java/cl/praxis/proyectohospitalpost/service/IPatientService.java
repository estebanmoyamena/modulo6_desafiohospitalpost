package cl.praxis.proyectohospitalpost.service;

import cl.praxis.proyectohospitalpost.entity.Patient;

import java.util.List;

public interface IPatientService {

    Patient getPatient(Long id);
    List<Patient> getAllPatients();
    Patient savePatient(Patient patient);
    Patient updatePatient(Patient patient);
    void deletePatient(Patient patient);
    void deletePatientsbyId(Long id);
}
