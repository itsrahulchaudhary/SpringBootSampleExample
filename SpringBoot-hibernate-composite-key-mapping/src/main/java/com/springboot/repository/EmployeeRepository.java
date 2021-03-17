package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Employee;
import com.springboot.entity.EmployeeIdentity;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity>{

}
