package com.chauhan.springboot.service;

import java.util.List;

import com.chauhan.springboot.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public Employee updateDelete(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findById(long id);
	public List<Employee> findByAll();
	
}
