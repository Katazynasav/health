package com.system.health;

import com.system.health.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(EHealthApplication.class, args);
	}
}
