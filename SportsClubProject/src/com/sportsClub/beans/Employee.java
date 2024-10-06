package com.sportsClub.beans;

import java.time.LocalDate;

public class Employee extends Person {
	private String empDept;
	private String empDesignation;
	private LocalDate dateOfJoining;
	
	public Employee() {
		super();
	}

	public Employee(String empDept, String empDesignation, LocalDate dateOfJoining) {
		super();
		this.empDept = empDept;
		this.empDesignation = empDesignation;
		this.dateOfJoining = dateOfJoining;
	}
	
	public Employee(int pId, String pName, String mobile, String email,String empDept, String empDesignation, LocalDate dateOfJoining) {
		super(pId,pName,mobile,email);
		this.empDept = empDept;
		this.empDesignation = empDesignation;
		this.dateOfJoining = dateOfJoining;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [empDept=" + empDept + ", empDesignation=" + empDesignation + ", dateOfJoining="
				+ dateOfJoining + "]";
	}
	
	
}
