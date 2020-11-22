package com.system.health.services;


import com.system.health.models.Incident;

import java.util.List;

public interface IncidentService {
    List<Incident> findAll();
    void createIncident(Incident incident);


}
