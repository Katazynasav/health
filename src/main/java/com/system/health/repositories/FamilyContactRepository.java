package com.system.health.repositories;

import com.system.health.models.emergency.FamilyContact;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface FamilyContactRepository extends JpaRepository<FamilyContact,Long> {
    List<FamilyContact> findAll();
}
