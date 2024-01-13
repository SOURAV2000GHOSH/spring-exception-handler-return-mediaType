package com.springboot.exceptionhandler.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springboot.exceptionhandler.entities.Employee;
import com.springboot.exceptionhandler.exception.EmployeeNotFoundException;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	List<Employee> store=new ArrayList<>();

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getEmpId()==null || employee.getEmpId().isEmpty()) {
			employee.setEmpId(UUID.randomUUID().toString());
		}
		store.add(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return store;
	}

	@Override
	public Employee getEmployeeById(String empId) throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		return store.stream().filter((emp)->emp.getEmpId().equals(empId)).findFirst().orElseThrow(()->new EmployeeNotFoundException("Employee not found with id no: "+empId));
	}

}
