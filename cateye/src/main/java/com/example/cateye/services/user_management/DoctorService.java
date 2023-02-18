package com.example.cateye.services.user_management;


import com.example.cateye.pojo.user_management.DoctorPojo;
import com.example.cateye.entity.user_management.Doctor;

import java.util.List;

public interface DoctorService {
    String saveUser(DoctorPojo doctorPojo);
    List<Doctor> fetchAll();

    Doctor fetchbyId(Integer id);

    void deleteById(Integer id);
}
