package com.sportsClub.beans;

import java.time.LocalDate;

public class VendorsEmp extends Employee {
	
	private int noOfEmps;
	private int amount;
	
	public VendorsEmp() {
		super();
	}

	public VendorsEmp(int noOfEmps, int amount) {
		super();
		this.noOfEmps = noOfEmps;
		this.amount = amount;
	}
	
	public VendorsEmp(int pId, String pName, String mobile, String email,String empDept, String empDesignation, LocalDate dateOfJoining,int noOfEmps, int amount) {
		super(pId,pName,mobile,email,empDept,empDesignation,dateOfJoining);
		this.noOfEmps = noOfEmps;
		this.amount = amount;
	}

	public int getNoOfEmps() {
		return noOfEmps;
	}

	public void setNoOfEmps(int noOfEmps) {
		this.noOfEmps = noOfEmps;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return super.toString()+"VendorsEmp [noOfEmps=" + noOfEmps + ", amount=" + amount + "]";
	}
	
	
	
}
