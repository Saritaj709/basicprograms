package com.bridgelabz.model;

public class Customer {
	private String customerId;
	private String firstName;
	private String lastName;
	private String MobileNumber;
	private Double accountBalance;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String id) {
		customerId = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
