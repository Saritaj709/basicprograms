package com.bridgelabz.oops;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockReport {
	
static int eachStockValue;
static int totalStockValue;
static int eachShareValue;
static int totalShareValue;
	public static void main(String[] args) throws Exception
	{
		JSONParser p=new JSONParser();
			Object ob=p.parse(new FileReader("/home/bridgelabz/stock.json"));
			JSONObject jo=(JSONObject) ob;
			JSONArray StockNames=(JSONArray)jo.get("StockNames");
			System.out.println("\nStockNames:"+StockNames);
			@SuppressWarnings("rawtypes")
			Iterator it=StockNames.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			for(int i=0;i<StockNames.size();i++)
			{
				JSONObject sn=(JSONObject)StockNames.get(i);
			    totalStockValue+=Integer.parseInt(sn.get("NoOfshare").toString());
		        eachStockValue=Integer.parseInt(sn.get("NoOfshare").toString());
			    System.out.println("Stock|each stock value| "+eachStockValue);
			    eachShareValue=Integer.parseInt(sn.get("sharePrice").toString());
			    System.out.println("Stock |each share value| "+eachShareValue);
			    totalShareValue+=Integer.parseInt(sn.get("sharePrice").toString());
			}
			System.out.println("Stock | total No. of share | "+totalStockValue);
			 System.out.println("Stock | total share amount| "+totalShareValue);
	
	}
}
