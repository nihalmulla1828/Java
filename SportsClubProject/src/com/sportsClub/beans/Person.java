package com.sportsClub.beans;

public class Person {
	
	private int pId;
	private String pName;
	private String mobile;
	private String email;
	
	public Person() {
		super();
	}

	public Person(int pId, String pName, String mobile, String email) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.mobile = mobile;
		this.email = email;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	
	
}
