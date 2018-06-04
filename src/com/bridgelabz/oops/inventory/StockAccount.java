package com.bridgelabz.oops.inventory;

import com.bridgelabz.utility.Utility;

public class StockAccount {
	
	static CommercialPojo cp=new CommercialPojo();
	
	public static String stockAccount(String filename)
	{
		System.out.println("enter the filename");
		filename=cp.setFilename(Utility.userNext());
		return filename;
	}
	public static double valueOf(double accDollars)
	{
		System.out.println("enter the total value of account dollars: ");
		accDollars=cp.setAccDollars(Utility.userDouble());
		return accDollars;
	}
	public static void buy(int amount,String symbol)
	{
		System.out.println("enter total cost of share:");
		amount=cp.setAmount(Utility.userInt());
		System.out.println("enter the symbol of the company to buy: ");
		symbol=cp.setSymbol(Utility.userNext());		
	}
	public static void sell(int amount,String symbol)
	{
		System.out.println("enter the selling amount of the share: ");
		amount=Utility.userInt();
	    System.out.println("enter the symbol of the company to sell: ");
	    symbol=Utility.userNext();
	}
	public static String save(String filename)
	{
		System.out.println("enter the filename where the details are to be saved: ");
		filename=Utility.userNext();
		return filename;
	}
	public static void printReport(int amount,String symbol)
	{
		System.out.println("The new company in the share is: "+symbol);
		System.out.println("The total amount after the process is: "+amount);
	}
}
