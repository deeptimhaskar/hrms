package com.org.tcs.morganstanley.hrms.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RegistrationController {
@GetMapping("/registration")
public String getMethodName(@RequestParam String param) {
    return "Hello Deepti you are registered";
}

}
