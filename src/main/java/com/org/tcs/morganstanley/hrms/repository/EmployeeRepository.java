package com.org.tcs.morganstanley.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.tcs.morganstanley.hrms.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findByNameAndMobnumber(String name,String mob);
}
