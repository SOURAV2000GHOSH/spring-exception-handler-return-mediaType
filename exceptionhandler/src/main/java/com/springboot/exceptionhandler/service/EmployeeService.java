package com.springboot.exceptionhandler.service;

import java.util.List;

import com.springboot.exceptionhandler.entities.Employee;
import com.springboot.exceptionhandler.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(String empId) throws EmployeeNotFoundException;

}
