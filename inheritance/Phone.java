package com.jse.inheritance;

public class Phone {
	private String phoneNumber;
	private String name;
	private String company;

	public Phone(String phoneNumber, String name, String company) {
		this.company = company;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	@Override //an-notation : 주석 - error에 @주소뜨면 overide안한거
	public String toString() {
		return "Phone : phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company;
	}
	
}
