package com.bridgelabz.oops;

import java.io.FileReader;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonInventory {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		Object ob = new JSONParser().parse(new FileReader("/home/bridgelabz/test.json"));
		JSONObject jo = (JSONObject) ob;
		
		Set<String> keys = jo.keySet();
		
		for (String inventoryArrayKey : keys) {
			JSONArray inventoryArray = (JSONArray) jo.get(inventoryArrayKey);
			long totalPrice = 0;
			for (Object object : inventoryArray) {
				JSONObject inventory = (JSONObject) object;
				long weight  = (long) inventory.get("weight");
				long price = (long) inventory.get("price");
				totalPrice += (weight * price);
			}
			System.out.println("Invetory price of " + inventoryArrayKey + "is: " + totalPrice);
		}
	}
}
