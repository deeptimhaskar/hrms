package com.org.tcs.morganstanley.hrms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AttendanceController {
	
	@GetMapping("/attendance")
	public String getMethodName() {
		return "You are present";
	}
	

}
