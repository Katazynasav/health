package com.system.health.security;


import com.system.health.models.users.Employee;
import com.system.health.services.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("employeeDetailServiceImpl")
public class EmployeeDetailsServiceIml implements UserDetailsService {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeDetailsServiceIml(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Employee employee = employeeService.findByEmail(email).orElseThrow(()->
                new UsernameNotFoundException("User doesn't exist"));
        return SecurityEmployee.fromEmployee(employee);
    }
}
