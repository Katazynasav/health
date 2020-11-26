package com.system.health.services.employee;


import com.system.health.models.users.Employee;
import com.system.health.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


//    @Autowired
//    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() { return employeeRepository.findAll(); }

    @Override
    public void createEmployee(Employee employee) {
        Employee generatedEmployee = new Employee();
        generatedEmployee.setEmployeeId((long) Math.floor(Math.random() * 9000000000L));
//        generatedEmployee.setPassword(bCryptPasswordEncoder.encode(generatedEmployee.getPassword()));
        employeeRepository.save(generatedEmployee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void findById(Employee employee) {
        employeeRepository.findById(employee.getEmployeeId());

    }

    @Override
    public Optional<Employee> findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

//    @Override
//    public Employee findByEmail(String email) {
//        return employeeRepository.findByEmail(email);
//    }


}
