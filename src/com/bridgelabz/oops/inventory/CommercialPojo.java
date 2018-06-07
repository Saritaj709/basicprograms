package com.bridgelabz.oops.inventory;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CommercialPojo {
	private String filename;
	private long accDollars;
	private long amount;
	private String symbol;
	private Date date1;
	
	public Date getDate() {
		return date1;
	}
	/*public GregorianCalendar setDate(int day,int month,int year,int hour,int minute,int second) {
		GregorianCalendar date = new GregorianCalendar();
		 
	      day = date.get(Calendar.DAY_OF_MONTH);
	      month = date.get(Calendar.MONTH);
	      year = date.get(Calendar.YEAR);
	 
	      second = date.get(Calendar.SECOND);
	      minute = date.get(Calendar.MINUTE);
	      hour = date.get(Calendar.HOUR);
	 
		return  date;
	}*/
	public Date setDate(Date date1) {
		return this.date1=date1;
	}
	public String getFilename() {
		return filename;
	}
	public String setFilename(String filename) {
		return this.filename = filename;
	}
	public long getAccDollars() {
		return accDollars;
	}
	public long setAccDollars(long accDollars) {
		return this.accDollars = accDollars;
	}
	public double getAmount() {
		return amount;
	}
	public long setAmount(long amount) {
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
		return "CommercialData [ filename is= "+filename+"  accDollars is= "+accDollars+" amount is= "+amount+" symboli is ="+symbol+"Date= "+date1+"]";
	}
	

}
