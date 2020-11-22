package com.system.health.repositories;

import com.system.health.models.FamilyContact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FamilyContactRepository extends CrudRepository<FamilyContact,Long> {
    List<FamilyContact> findAll();
}
