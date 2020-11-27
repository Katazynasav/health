package com.system.health.services.employee;

import com.system.health.models.users.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    void createEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Optional<Employee> findByEmail(String email);

}
