package com.example.cateye.services.user_management;


import com.example.cateye.pojo.user_management.PatientPojo;
import com.example.cateye.entity.user_management.Patient;

import java.util.List;

public interface PatientService {
    String saveUser(PatientPojo patientPojo);
    List<Patient> fetchAll();

    Patient fetchbyId(Integer id);

    void deleteById(Integer id);
}
