package com.bridgelabz.oops;

import java.io.FileReader;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utility.Utility;

public class InventoryMngmtPgm {

	public static void main(String[] args) throws Exception {
		Object ob = new JSONParser().parse(new FileReader("/home/bridgelabz/test.json"));
		JSONObject jo = (JSONObject) ob;

		Inventory I = new Inventory();
		@SuppressWarnings("unchecked")
		Set<String> keys = jo.keySet();

		System.out.println("enter the name of item to see the details:Rice,Pulses,Wheat");
		String item = Utility.userNext();
		for (String inventoryArrayKey : keys) {
			JSONArray inventoryArray = (JSONArray) jo.get(inventoryArrayKey);
			if (item.equals(inventoryArrayKey)) {
				for (int i = 0; i < inventoryArray.size(); i++) {
					JSONObject r = (JSONObject) inventoryArray.get(i);
					I.setName(r.get("name").toString());
					int weight = (Integer.parseInt(r.get("weight").toString()));
					 I.setWeight(weight);
					int price = Integer.parseInt(r.get("price").toString());
					I.setPrice(price);
					System.out.println(I);
					System.out.println("Totalprice= "+(weight*price));
				}

			}
		}
	}
}
