package com.org.tcs.morganstanley.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.tcs.morganstanley.hrms.entity.Admin;
import com.org.tcs.morganstanley.hrms.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/create")
	public Admin createAdmin(@RequestBody Admin admin,@RequestParam String password,@RequestParam String name) {
		return adminService.createAdmin(admin, password, name);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAdmin(@PathVariable Long id,@RequestParam String password,@RequestParam String name) {
		return adminService.deleteAdmin(id, password, name);
	}
	
	@GetMapping("/getAll")
	public List<Admin> getAllAdmins(){
		return adminService.getAllAdmin();
	}
}

