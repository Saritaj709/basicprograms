package com.bridgelabz.oops.inventory;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.FileReader;
import java.sql.Date;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oops.Inventory;
import com.bridgelabz.utility.Utility;

public class CommercialDataProcessing {
	static CommercialPojo po = new CommercialPojo();
	static String filename;
	static String symbol;
	static long accDollars = 0, amount = 0;

	public static String stockAccount(String filename) {
		System.out.println("enter the filename");
		filename = po.setFilename(Utility.userNext());
		return filename;
	}

	public static long valueOf(long accDollars) {
		System.out.println("enter the total value of account dollars: ");
		accDollars = po.setAccDollars(Utility.userInt());
		return accDollars;
	}

	public static long buy(long amount, String symbol) {
		System.out.println("enter total cost of share:");
		amount = po.setAmount(Utility.userInt());
		System.out.println("enter the symbol of the company to buy: ");
		symbol = po.setSymbol(Utility.userNext());
		return amount;
	}

	public static long sell(long amount, String symbol) {
		System.out.println("enter the selling amount of the share: ");
		amount = po.setAmount(Utility.userInt());
		System.out.println("enter the symbol of the company to sell: ");
		symbol = Utility.userNext();
		return amount;
	}

	public static String save(String filename) {
		System.out.println("enter the filename where the details are to be saved: ");
		filename = po.setFilename(Utility.userNext());
		return filename;
	}

	public static void printReport(String filename, String symbol, long amount, long accDollars) {
		System.out.println("The filename where the process is done is: " + filename);
		System.out.println("The new company in the share is: " + symbol);
		System.out.println("The cost of the share is: " + amount);
		System.out.println("The total amount after the process is: " + accDollars);
	}

	public static void main(String[] args) throws Exception {
        
		List<CommercialPojo> list = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		JSONObject jo = new JSONObject();
		System.out.println("enter the no. of share");
		long noOfShare = Utility.userInt();
			for(int i=0;i<noOfShare;i++) {
				CommercialPojo pojo=new CommercialPojo();
			System.out.println("enter the filename");
			filename = pojo.setFilename(Utility.userNext());
			System.out.println("enter the total value of account dollars: ");
			accDollars = pojo.setAccDollars(Utility.userInt());
			System.out.println("enter the symbol of the company to buy: ");
			symbol = pojo.setSymbol(Utility.userNext());
			System.out.println("enter total cost of share:");
			amount = pojo.setAmount(Utility.userInt());
			Date date = pojo.setDate(new Date(0));
			list.add(pojo);
			JsonUtil.toJson(new File("commercial.json"),list);
		}
		  System.out.println("enter the process you want to do:1.Buy,2.Sell"); int
		  choice = Utility.userInt();
		  Object obj = new JSONParser().parse(new FileReader("pretty.json"));
		  switch (choice)
		  { 
		
		  case 1: buy(amount, symbol);
		  /*JSONObject job = (JSONObject) obj;
			@SuppressWarnings("unchecked")
			Set<String> keys = job.keySet();
		  for (String inventoryArrayKey : keys) {
				JSONArray inventoryArray = (JSONArray) jo.get(inventoryArrayKey);
				if (filename.equals(inventoryArrayKey)) {
					for (int i = 0; i < inventoryArray.size(); i++) {
						JSONObject r = (JSONObject) inventoryArray.get(i);
						po.setFilename(r.get("filename").toString());
						int amount = (Integer.parseInt(r.get("amount").toString()));
						 po.setAmount(amount);
							  accDollars=po.setAmount(accDollars-amount);
						System.out.println(po);
						list.add(po);
						JsonUtil.toJson(new File("commercial.json"),list);
					}
				}
		  }*/
		  break; 
		  case 2: sell(amount, symbol);
		  break; 
}
		save(filename);
		printReport(filename, symbol, amount, accDollars);
		
	
}
		  }
	
