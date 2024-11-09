package com.org.tcs.morganstanley.hrms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.tcs.morganstanley.hrms.entity.Admin;
import com.org.tcs.morganstanley.hrms.repository.AdminRepo;
import com.org.tcs.morganstanley.hrms.service.AdminService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepo adminRepo;
	
	private boolean checkAdmin(String password,String name) {
		if(password.equals("admin") && name.equals("admin")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	@Override
	public Admin createAdmin(Admin admin, String password, String name) {
		log.info("inside the admin create service");
		if(checkAdmin(password, name)) {
			return adminRepo.save(admin);
		}
		return null;
	}

	@Override
	public String deleteAdmin(Long id, String password, String name) {
		log.info("inside the admin delete service");
		if(checkAdmin(password, name)) {
			adminRepo.deleteById(id);
			return "delete success";
		}else {
			return "failed";
		}
	}

	@Override
	public List<Admin> getAllAdmin() {
			return adminRepo.findAll();
	}


}
