package com.system.health.repositories;

import com.system.health.models.emergency.Incident;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface IncidentRepository extends JpaRepository<Incident,Long> {
    List <Incident> findAll();
}
