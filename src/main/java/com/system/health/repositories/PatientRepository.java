package com.system.health.repositories;

import com.system.health.models.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends CrudRepository <Patient,Long> {
    List<Patient>findAll();
}
