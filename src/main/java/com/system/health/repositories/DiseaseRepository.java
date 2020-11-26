package com.system.health.repositories;

import com.system.health.models.emergency.Disease;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface DiseaseRepository extends JpaRepository<Disease,Long> {
    List<Disease> findAll();

}
