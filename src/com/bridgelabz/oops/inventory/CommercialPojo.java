package com.bridgelabz.oops.inventory;

public class CommercialPojo {
	private String filename;
	private double accDollars;
	private int amount;
	private String symbol;
	
	public String getFilename() {
		return filename;
	}
	public String setFilename(String filename) {
		return this.filename = filename;
	}
	public double getAccDollars() {
		return accDollars;
	}
	public double setAccDollars(double accDollars) {
		return this.accDollars = accDollars;
	}
	public int getAmount() {
		return amount;
	}
	public int setAmount(int amount) {
		return this.amount = amount;
	}
	public String getSymbol() {
		return symbol;
	}
	public String setSymbol(String symbol) {
		return this.symbol = symbol;
	}
	@Override
	public String toString() {
		return "CommercialData [ filename is= "+filename+"accDollars is= "+accDollars+"amount is= "+amount+"symboli is ="+symbol+"]";
	}
	

}
