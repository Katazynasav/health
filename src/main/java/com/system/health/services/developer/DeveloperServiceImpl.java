package com.system.health.services.developer;

import com.system.health.models.users.Developer;
import com.system.health.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public class DeveloperServiceImpl implements DeveloperService {
    @Autowired
    DeveloperRepository developerRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<Developer> findAll() {
        return developerRepository.findAll();
    }

    @Override
    public void findById(Developer developer) {
        developerRepository.findById(developer.getDeveloperId());

    }
}
