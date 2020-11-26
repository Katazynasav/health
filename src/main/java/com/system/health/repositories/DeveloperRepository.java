package com.system.health.repositories;

import com.system.health.models.emergency.Disease;
import com.system.health.models.users.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeveloperRepository extends JpaRepository<Developer,Long> {
    List<Developer> findAll();
}
