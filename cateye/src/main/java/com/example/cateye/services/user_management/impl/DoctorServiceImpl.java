package com.example.cateye.services.user_management.impl;

import com.example.cateye.pojo.user_management.DoctorPojo;
import com.example.cateye.repo.user_management.DoctorRepo;
import com.example.cateye.services.user_management.DoctorService;
import com.example.cateye.entity.user_management.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepo doctorRepo;

    @Override
    public String saveUser(DoctorPojo doctorPojo) {
        Doctor doctor = new Doctor();
        if (doctorPojo.getId()!= null){
            doctor.setId(doctorPojo.getId());
        }

        doctor.setQualification( doctorPojo.getEmail());
        doctor.setFullname( doctorPojo.getFullname());
        doctor.setTime( doctorPojo.getTime());
        doctor.setFeild( doctorPojo.getFeild());
        doctorRepo.save(doctor);
        return "created";
    }

    public List<Doctor> fetchAll() {
        return this.doctorRepo.findAll();

    }
    @Override
    public Doctor fetchbyId(Integer id){
        return doctorRepo.findById(id).orElseThrow(()-> new RuntimeException("not found"));
    }

    @Override
    public void deleteById(Integer id) {
        doctorRepo.deleteById(id);

    }


}