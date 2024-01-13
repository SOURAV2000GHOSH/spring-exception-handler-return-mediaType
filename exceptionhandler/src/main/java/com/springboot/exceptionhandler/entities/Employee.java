package com.springboot.exceptionhandler.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String empId;
	private String name;
	private String email;
	private String status;
	public Employee(String empId, String name, String email, String status) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.status = status;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", status=" + status + "]";
	}
	

}
