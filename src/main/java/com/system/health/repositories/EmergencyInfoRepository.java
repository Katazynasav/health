package com.system.health.repositories;

import com.system.health.models.EmergencyInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmergencyInfoRepository extends CrudRepository<EmergencyInfo,Long> {
    List<EmergencyInfo> findAll();

}
