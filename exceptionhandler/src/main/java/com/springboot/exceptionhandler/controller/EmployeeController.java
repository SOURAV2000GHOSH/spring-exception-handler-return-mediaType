package com.springboot.exceptionhandler.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exceptionhandler.entities.Employee;
import com.springboot.exceptionhandler.exception.EmployeeNotFoundException;
import com.springboot.exceptionhandler.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = employeeService.saveEmployee(employee);
		return saveEmployee;
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") String empId) throws EmployeeNotFoundException {
		Employee employeeById = employeeService.getEmployeeById(empId);
		return employeeById;
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
}
