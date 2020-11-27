package com.system.health.services.incident;

import com.system.health.models.emergency.Incident;
import com.system.health.models.users.Employee;
import com.system.health.repositories.EmployeeRepository;
import com.system.health.repositories.IncidentRepository;
import com.system.health.services.employee.EmployeeService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        setIncidentDate(incident);
        incidentRepository.save(incident);
    }

    private static void setIncidentDate(Incident incident){
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:mm");
        String dateNow  = dateTimeFormatter.format(localDate);
        incident.setIncidentDate(dateNow);

    }
}
