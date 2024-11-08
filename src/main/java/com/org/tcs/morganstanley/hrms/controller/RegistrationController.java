package com.org.tcs.morganstanley.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.org.tcs.morganstanley.hrms.entity.Employee;
import com.org.tcs.morganstanley.hrms.service.impl.EmployeeServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RegistrationController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/registration")
	public String getMethodName(@RequestParam String param) {
		return "Hello Deepti you are registered";
	}

	@PostMapping("/createemp")
	public Employee createEmployee(@RequestBody Employee employee) {
		Gson gson = new Gson();
		log.debug(" Input Request for EMP " + gson.toJson(employee));
		employeeServiceImpl.saveEmployee(employee);
		return employee;

	}

	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestParam int id, @RequestBody Employee employee) {
		return employeeServiceImpl.updateEmployee(id, employee);

	}

	@GetMapping("/allemp")
	public List<Employee> getAllEmployee() {
		return employeeServiceImpl.getAllEmployees();
	}

	@DeleteMapping("/deleteEmployoee")
	public void deleteEmployoee(@RequestParam int id) {
		employeeServiceImpl.deleteEmployee(id);
	}

	@GetMapping("/search")
	public Employee searchEmp(@RequestParam String name, @RequestParam String mob) {
		return employeeServiceImpl.findByNameAndMob(name, mob);
	}

}
