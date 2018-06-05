package com.bridgelabz.oops.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.sql.Date;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;

import com.bridgelabz.utility.Utility;

public class CommercialDataProcessing {
	public static void main(String[] args) {
		String filename, symbol=null;
		double accDollars, amount=0;
		ObjectMapper mapper = new ObjectMapper();
		List<CommercialPojo> list = new ArrayList<>();
		Map<String,List<CommercialPojo>> m=new HashMap();

		CommercialPojo pojo = new CommercialPojo();
        System.out.println("enter the filename");
		filename = pojo.setFilename(Utility.userNext());
		System.out.println("enter the total value of account dollars: ");
		accDollars = pojo.setAccDollars(Utility.userDouble());
		/*System.out.println("enter the symbol of the company to buy: ");
		symbol = pojo.setSymbol(Utility.userNext());
		System.out.println("enter total cost of share:");
		amount = pojo.setAmount(Utility.userInt());*/
		Date date=pojo.setDate(new Date(05/06/2018));
		
		String stockDetails = JsonUtil.ConvertJavaToJson(pojo);
		//list.add(pojo);
		System.out.println(stockDetails);
		System.out.println("enter the no. of share:");
		int n=Utility.userInt();
		
		JSONArray ja=new JSONArray();
		list.add(pojo);
		m=new HashMap();
		m.put("data",list);
		
		
		//System.out.println(String.valueOf(list.add(pojo)));
		 
		for(int i=0;i<n;i++) {
			System.out.println("enter the process you want to do:1.Buy,2.Sell");
			int choice = Utility.userInt();
			switch (choice) {
			case 1:
				StockAccount.buy(amount, symbol);
				System.out.println("enter total cost of share:");
				amount=pojo.setAmount(Utility.userInt());
				System.out.println("enter the symbol of the company to buy: ");
				symbol=pojo.setSymbol(Utility.userNext());
			
				accDollars = pojo.setAccDollars(accDollars - amount);
				list.add(pojo);
				System.out.println(pojo);
				System.out.println("remaining account dollars: " + accDollars);
				m=new HashMap();
				m.put("acc",list);
				try {
					mapper.writeValue(new File("commercial1.json"), list);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				StockAccount.sell(amount, symbol);
				System.out.println("enter the selling amount of the share: ");
				amount=pojo.setAmount(Utility.userInt());
			    System.out.println("enter the symbol of the company to sell: ");
			    symbol=Utility.userNext();
			
				accDollars = accDollars + amount;
				list.add(pojo);
				System.out.println(pojo);
				System.out.println("final account dollars:" + accDollars);
				m=new HashMap();
				m.put("acc",list);
				try {
					mapper.writeValue(new File("commercial1.json"), list);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
		StockAccount.save(filename);
		StockAccount.printReport(filename, symbol,amount,accDollars);
		
		try {
			mapper.writeValue(new File("commercial1.json"), list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
