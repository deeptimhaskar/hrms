package com.org.tcs.morganstanley.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.tcs.morganstanley.hrms.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long>{

}
