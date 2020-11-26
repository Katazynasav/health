package com.system.health.repositories;

import com.system.health.models.users.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient>findAll();
}
