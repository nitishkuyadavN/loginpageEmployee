package com.employeelogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employeelogin.entities.Employee;
import com.employeelogin.services.EmployeeService;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/api/employees")
public class EmployeeControleer {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/add")
    public String showAddEmployeeForm(Model model) {
        // ...
        return "api/employees/add"; // Check this view name
    }

	@GetMapping("/")
	public String open() {
		return "registrationPage";
	}

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/{employeeId}")
	public Employee getEmployeeByEmployeeId(@PathVariable String employeeId) {
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}

	@GetMapping("/all")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}

	@PostMapping("/calculateSalary")
	public Employee calculateSalary(@RequestBody Employee employee) {
		return employeeService.calculateSalary(employee);
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("userId") String userId, @RequestParam("password") String password, Model model) {

		return "redirect:/dashboard";
	}

	@GetMapping("/register")
	public String registrationPage() {
		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute Employee employee, Model model) {

		return "login";
	}
}
