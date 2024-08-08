package cl.praxis.proyectohospitalpost.service.serviceimpl;
import cl.praxis.proyectohospitalpost.entity.Patient;
import cl.praxis.proyectohospitalpost.repository.IPatientRepository;
import cl.praxis.proyectohospitalpost.service.IPatientService;
import org.hibernate.annotations.processing.Find;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("patientServiceImpl")
public class PatientServiceImpl implements IPatientService {
    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public Patient getPatient(Long id) {
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return null;
    }

    @Override
    public void deletePatient(Patient patient) {

    }

    @Override
    public void deletePatientsbyId(Long id) {
        patientRepository.deleteById(id);
    }
}
