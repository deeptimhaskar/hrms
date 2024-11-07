package com.org.tcs.morganstanley.hrms.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AttendanceController {

	@GetMapping("/attendance")
	public String getMethodName() {

		log.info("Inside attendance method");
		String abc = "XYZ";
		abc = abc.concat("ABC");
		log.debug("abc value  :" + abc);
		String response = "You are present";
		log.error("this is error");
		return response;
	}

	@GetMapping("/testlogger")
	public void testLogs() {
		log.info("Inside testlogger method");
		for (int i = 0; i < 100000; i++) {
			log.info("i Value is " + i);
			log.info(" Date " + new Date());
		}
		log.info("Task Finished");
	}
}
