package com.org.tcs.morganstanley.hrms.service;

import java.util.List;
import java.util.Optional;

import com.org.tcs.morganstanley.hrms.entity.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);

	public Optional<Employee> getEmployee(int id);

	public List<Employee> getAllEmployees();

	public Employee updateEmployee(int id, Employee employee);

	public void deleteEmployee(int id);

	public Employee findByNameAndMob(String name,String mob);
}
