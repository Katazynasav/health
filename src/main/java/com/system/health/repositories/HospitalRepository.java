package com.system.health.repositories;

import com.system.health.models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {
    List <Hospital> findAll();

}
