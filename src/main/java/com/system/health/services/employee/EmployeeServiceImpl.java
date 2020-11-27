package com.system.health.services.employee;


import com.system.health.models.users.Employee;
import com.system.health.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() { return employeeRepository.findAll(); }

    @Override
    public void createEmployee(Employee employee) {
        Employee generatedEmployee = new Employee();
        generatedEmployee.setEmployeeId((long) Math.floor(Math.random() * 9000000000L));
        employeeRepository.save(generatedEmployee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employee = findByEmail(employee.getEmail()).orElseThrow(()->
                new UsernameNotFoundException("Employee doesn't exist"));
        employeeRepository.delete(employee);
    }


    @Override
    public Optional<Employee> findByEmail(String email) {
        Employee employeeToFind = employeeRepository.findByEmail(email).orElseThrow(()->
         new UsernameNotFoundException("Employee doesn't exist"));
        return Optional.ofNullable(employeeToFind);

    }
}
