package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.entity.Employee;
import com.springboot.entity.EmployeeIdentity;
import com.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootHibernateCompositeKeyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateCompositeKeyMappingApplication.class, args);

	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee(new EmployeeIdentity("E-100", "C-100"), "Umesh", "umesh34@gmail.com",
				"8899776644");
		employeeRepository.save(employee);

	}

}
