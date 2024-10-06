package com.sportsClub.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee {
	
	private int noHrsWorked;
	private int perHrRate;
	
	public ContractEmp() {
		super();
	}

	public ContractEmp(int noHrsWorked, int perHrRate) {
		super();
		this.noHrsWorked = noHrsWorked;
		this.perHrRate = perHrRate;
	}
	
	public ContractEmp(int pId, String pName, String mobile, String email,String empDept, String empDesignation, LocalDate dateOfJoining,int noHrsWorked, int perHrRate) {
		super(pId,pName,mobile,email,empDept,empDesignation,dateOfJoining);
		this.noHrsWorked = noHrsWorked;
		this.perHrRate = perHrRate;
	}

	public int getNoHrsWorked() {
		return noHrsWorked;
	}

	public void setNoHrsWorked(int noHrsWorked) {
		this.noHrsWorked = noHrsWorked;
	}

	public int getPerHrRate() {
		return perHrRate;
	}

	public void setPerHrRate(int perHrRate) {
		this.perHrRate = perHrRate;
	}

	@Override
	public String toString() {
		return super.toString()+"ContractEmp [noHrsWorked=" + noHrsWorked + ", perHrRate=" + perHrRate + "]";
	}
	
	
	
}
