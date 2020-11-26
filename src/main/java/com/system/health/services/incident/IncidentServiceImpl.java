package com.system.health.services.incident;

import com.system.health.models.emergency.Incident;
import com.system.health.repositories.IncidentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IncidentServiceImpl implements IncidentService {

    @Resource
    private IncidentRepository incidentRepository;

    @Override
    public List<Incident> findAll() {
        return incidentRepository.findAll();
    }

    @Override
    public void createIncident(Incident incident){

        incidentRepository.save(incident);
    }
}
