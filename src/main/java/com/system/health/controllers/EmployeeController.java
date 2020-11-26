package com.system.health.controllers;

import com.system.health.models.users.Employee;
import com.system.health.services.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping
    public Optional<Employee> findByEmail(@RequestBody Employee employee){
        return employeeService.findByEmail(employee.getEmail());
    }

    @PostMapping
    public void createEmployee(@RequestBody Employee employee ){
        employeeService.createEmployee(employee);
    }

}
