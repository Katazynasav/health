package com.system.health.services.developer;


import com.system.health.models.users.Developer;

import java.util.List;

public interface DeveloperService {
    List<Developer> findAll();
    void createDeveloper(Developer developer);
    void deleteDeveloper(Developer developer);
    void findById(Developer developer);
}
