package com.bridgelabz.model;

public class Customer {
	private String customerId;
	private String customerName;
	private String MobileNumber;
	private Double accountBalance;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String id) {
		customerId = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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