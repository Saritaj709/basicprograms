package com.bridgelabz.oops.inventory;

import com.bridgelabz.utility.Utility;

public class StockAccount {
	
	static CommercialPojo pojo=new CommercialPojo();
	
	public static String stockAccount(String filename)
	{
		/*System.out.println("enter the filename");
		filename=pojo.setFilename(Utility.userNext());*/
		return filename;
	}
	public static double valueOf(double accDollars)
	{
		/*System.out.println("enter the total value of account dollars: ");
		accDollars=pojo.setAccDollars(Utility.userDouble());*/
		return accDollars;
	}
	public static double buy(double amount,String symbol)
	{
		/*System.out.println("enter total cost of share:");
		amount=pojo.setAmount(Utility.userInt());
		System.out.println("enter the symbol of the company to buy: ");
		symbol=pojo.setSymbol(Utility.userNext());*/	
		return amount;
	}
	public static double sell(double amount,String symbol)
	{
		/*System.out.println("enter the selling amount of the share: ");
		amount=pojo.setAmount(Utility.userInt());
	    System.out.println("enter the symbol of the company to sell: ");
	    symbol=Utility.userNext();*/
	    return amount;
	}
	public static String save(String filename)
	{
		System.out.println("enter the filename where the details are to be saved: ");
		filename=pojo.setFilename(Utility.userNext());
		return filename;
	}
	public static void printReport(String filename,String symbol,double amount,double accDollars)
	{
		System.out.println("The filename where the process is done is: "+filename);
		System.out.println("The new company in the share is: "+symbol);
		System.out.println("The cost of the share is: "+amount);
		System.out.println("The total amount after the process is: "+accDollars);
	}
}
