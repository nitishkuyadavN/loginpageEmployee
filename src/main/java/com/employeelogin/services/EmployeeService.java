package com.employeelogin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeelogin.entities.Employee;
import com.employeelogin.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	    @Autowired
	    private EmployeeRepository employeeRepository;
	    // Implement employee CRUD operations and salary calculation
	    
	    public Employee saveEmployee(Employee employee) {
	    	return employeeRepository.save(employee);
	    }
	    
	    public Employee getEmployeeByEmployeeId(String employeeId) {
	    	return employeeRepository.findByEmployeeId(employeeId);
	    }
	    
	    public List<Employee> getAllEmployees(){
	    	return employeeRepository.findAll();
	    }
	    public void deleteEmployeeById(Long id) {
	    	employeeRepository.deleteById(id);
	    }
	    public Employee calculateSalary(Employee employee) {
	    	double basic = employee.getBasic();
	    	double hra = employee.getHra();
	    	double variableAllowance = employee.getVariableAllowance();
	    	double gross = (basic * 0.6) + (hra * 0.4);
	    	double balance = gross - basic - hra;
	    	employee.setSalary(gross + variableAllowance - balance);
	    	return employee;
	    }
	}


