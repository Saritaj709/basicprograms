package com.bridgelabz.model;

public class Transaction {
private String stockName;
private String stockSymbol;
private String firstName;
private String lastName;
private String customerId;
private double stockCharge;
private String timeStamp;
private int noOfStock;
public String getStockName() {
	return stockName;
}
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public String getStockSymbol() {
	return stockSymbol;
}
public String setStockSymbol(String stockSymbol) {
	return this.stockSymbol = stockSymbol;
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
public String getCustomerId() {
	return customerId;
}
public String setCustomerId(String customerId) {
	return this.customerId = customerId;
}
public String getTimeStamp() {
	return timeStamp;
}
public String setTimeStamp(String timeStamp) {
	return this.timeStamp = timeStamp;
}
public double getStockCharge() {
	return stockCharge;
}
public double setStockCharge(double stockCharge) {
	return this.stockCharge = stockCharge;
}
public int getNoOfStock() {
	return noOfStock;
}
public int setNoOfStock(int noOfStock) {
	return this.noOfStock = noOfStock;
}

}
