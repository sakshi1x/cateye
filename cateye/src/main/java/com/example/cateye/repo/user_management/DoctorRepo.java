package com.example.cateye.repo.user_management;

import com.example.cateye.entity.user_management.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
}
