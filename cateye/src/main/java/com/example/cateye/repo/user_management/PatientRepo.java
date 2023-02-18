package com.example.cateye.repo.user_management;

import com.example.cateye.entity.user_management.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, Integer> {
}

