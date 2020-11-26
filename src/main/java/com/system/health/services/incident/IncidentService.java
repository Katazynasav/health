package com.system.health.services.incident;


import com.system.health.models.emergency.Incident;

import java.util.List;

public interface IncidentService {
    List<Incident> findAll();
    void createIncident(Incident incident);


}
