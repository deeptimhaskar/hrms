package com.org.tcs.morganstanley.hrms.controller;

import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.org.tcs.morganstanley.hrms.entity.Employee;
import com.org.tcs.morganstanley.hrms.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@Slf4j
public class RegistrationController {
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/registration")
	public String getMethodName(@RequestParam String param) {
		return "Hello Deepti you are registered";
	}

	@PostMapping("/createemp")
	public Employee createEmployee(@RequestBody Employee employee) {
		Gson gson = new Gson();
		log.debug(" Input Request for EMP " + gson.toJson(employee));
		employeeRepository.save(employee);
		return employee;

	}

}
