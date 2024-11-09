package com.org.tcs.morganstanley.hrms.service;

import java.util.List;

import com.org.tcs.morganstanley.hrms.entity.Admin;

public interface AdminService {
	Admin createAdmin(Admin admin,String password,String name);
	String deleteAdmin(Long id,String password,String name);
	List<Admin> getAllAdmin();
}
