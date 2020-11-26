package com.system.health.repositories;

import com.system.health.models.emergency.EmergencyInfo;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface EmergencyInfoRepository extends JpaRepository<EmergencyInfo,Long> {
    List<EmergencyInfo> findAll();

}
