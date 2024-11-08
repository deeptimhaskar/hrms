package com.org.tcs.morganstanley.hrms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.tcs.morganstanley.hrms.entity.Employee;
import com.org.tcs.morganstanley.hrms.repository.EmployeeRepository;
import com.org.tcs.morganstanley.hrms.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		log.info("Inside Save Emp " + employee.toString());
		return employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> getEmployee(int id) {
		log.info("Inside getEmployee " + id);
		return employeeRepository.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		log.debug("Inside alll Employee");
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		log.info("Employee ID " + id + "Employee Object " + employee.toString());
		Optional<Employee> emp = employeeRepository.findById(id);
		if (emp.isPresent()) {
			Employee e = emp.get();
			e.setCity("PUNE");
			e.setName(employee.getName());
			e.setMobnumber(employee.getMobnumber());
			log.info("Employee found with " + e.toString());
			return employeeRepository.save(e);
		}
		{
			log.info("Employee Not found ");
			return null;
		}

	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee findByNameAndMob(String name, String mob) {
		return employeeRepository.findByNameAndMobnumber(name, mob);
	}

}
