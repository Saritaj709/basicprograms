package com.bridgelabz.oops.inventory;

import java.sql.Date;

public class CommercialPojo {
	private String filename;
	private double accDollars;
	private double amount;
	private String symbol;
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public Date setDate(Date date) {
		return this.date = date;
	}
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
	public double getAmount() {
		return amount;
	}
	public double setAmount(double amount) {
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
		return "CommercialData [ filename is= "+filename+"  accDollars is= "+accDollars+" amount is= "+amount+" symboli is ="+symbol+"Date= "+date+"]";
	}
	

}
