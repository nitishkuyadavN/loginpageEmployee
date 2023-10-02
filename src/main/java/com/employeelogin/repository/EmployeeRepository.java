package com.employeelogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeelogin.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Add custom queries if needed
	Employee findByEmployeeId(String employeeId);
	Employee findByDesignation(String designation);
	Employee findBySalary(double salary);
}
