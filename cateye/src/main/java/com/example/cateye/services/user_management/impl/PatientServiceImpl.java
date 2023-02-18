package com.example.cateye.services.user_management.impl;

import com.example.cateye.pojo.user_management.PatientPojo;
import com.example.cateye.repo.user_management.PatientRepo;
import com.example.cateye.services.user_management.PatientService;
import com.example.cateye.entity.user_management.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepo patientRepo;

    @Override
    public String saveUser(PatientPojo patientPojo) {
        Patient patient = new Patient();
        if (patientPojo.getId()!= null){
            patient.setId(patientPojo.getId());
        }

        patient.setEmail(patientPojo.getEmail());
        patient.setFname(patientPojo.getFname());
        patient.setMobileNo(patientPojo.getMobile_no());
        patient.setDob(patientPojo.getDob());
        patient.setDoc(patientPojo.getDoc());
        patient.setLname(patientPojo.getLname());
        patient.setTreatment(patient.getTreatment());
        patientRepo.save(patient);
        return "created";
    }

    public List<Patient> fetchAll() {
        return this.patientRepo.findAll();

    }
    @Override
    public Patient fetchbyId(Integer id){
        return patientRepo.findById(id).orElseThrow(()-> new RuntimeException("not found"));
    }

    @Override
    public void deleteById(Integer id) {
        patientRepo.deleteById(id);

    }


}