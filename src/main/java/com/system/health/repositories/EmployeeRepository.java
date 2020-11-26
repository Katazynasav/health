package com.system.health.repositories;

import com.system.health.models.users.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee>findAll();
//    Employee findByEmail(String email);
      Optional<Employee> findByEmail(String email);


}
