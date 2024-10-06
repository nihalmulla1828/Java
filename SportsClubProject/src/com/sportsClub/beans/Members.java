package com.sportsClub.beans;

public class Members extends Person {
	
	private String typeOfMembership;
	private int amountPaid;
	
	
	public Members() {
		super();
	}
	
	public Members(int pId, String pName, String mobile, String email,String typeOfMembership, int amountPaid) {
		super(pId,pName,mobile,email);
		this.typeOfMembership = typeOfMembership;
		this.amountPaid = amountPaid;
	}
	public Members(String typeOfMembership, int amountPaid) {
		super();
		this.typeOfMembership = typeOfMembership;
		this.amountPaid = amountPaid;
	}


	public String getTypeOfMembership() {
		return typeOfMembership;
	}


	public void setTypeOfMembership(String typeOfMembership) {
		this.typeOfMembership = typeOfMembership;
	}


	public int getAmountPaid() {
		return amountPaid;
	}


	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}


	@Override
	public String toString() {
		return super.toString()+"Members [typeOfMembership=" + typeOfMembership + ", amountPaid=" + amountPaid + "]";
	}
	
	
}
