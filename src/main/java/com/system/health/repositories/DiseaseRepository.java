package com.system.health.repositories;

import com.system.health.models.Disease;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiseaseRepository extends CrudRepository<Disease,Long> {
    List<Disease> findAll();

}
