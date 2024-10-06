package com.sportsClub.beans;

import java.time.LocalDate;

public class SalariedEmp extends Employee {
	
	private int salary;

	public SalariedEmp() {
		super();
	}

	public SalariedEmp(int salary) {
		super();
		this.salary = salary;
	}
	
	public SalariedEmp(int pId, String pName, String mobile, String email,String empDept, String empDesignation, LocalDate dateOfJoining,int salary) {
		super(pId,pName,mobile,email,empDept,empDesignation,dateOfJoining);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [salary=" + salary + "]";
	}
	
	
}
