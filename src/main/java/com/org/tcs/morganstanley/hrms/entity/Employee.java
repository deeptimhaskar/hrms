package com.org.tcs.morganstanley.hrms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EMP_DETAILS")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 5)
	private int empId;

	@Column(name = "emp_Name", length = 50, nullable = true)
	private String name;

	private String perAddress;

	@Column(name = "city", length = 5)
	private String city;

	private String mobnumber;
	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "vehicleNo", length = 50)
	private String vehicleNo;
}
