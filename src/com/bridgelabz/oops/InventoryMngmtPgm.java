package com.bridgelabz.oops;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utility.Utility;

public class InventoryMngmtPgm {

	public static void main(String[] args) throws Exception {
		Object ob = new JSONParser().parse(new FileReader("/home/bridgelabz/test.json"));
		JSONObject jo = (JSONObject) ob;

		JSONArray Rice = (JSONArray) jo.get("Rice");
		JSONArray Pulses = (JSONArray) jo.get("Pulses");
		JSONArray Wheat = (JSONArray) jo.get("Wheat");

		Inventory I = new Inventory();

		
		System.out.println("enter the name of item to see the details");
		String item = Utility.userNext();
		if (item.equals("Rice")) {
			for (int i = 0; i < Rice.size(); i++) {
				JSONObject r = (JSONObject) Rice.get(i);
				System.out.println("Name of rice item is " + I.setName(r.get("name").toString()));
				int weight = (Integer.parseInt(r.get("weight").toString()));
				System.out.println("weight of rice item is " + I.setWeight(weight));
				int price = Integer.parseInt(r.get("price").toString());
				System.out.println("Price of rice item is " + I.setPrice(price));
			}

		} else if (item.equals("Pulses")) {
			for (int i = 0; i < Pulses.size(); i++) {
				JSONObject r = (JSONObject) Pulses.get(i);
				System.out.println("Name of pulse item is " + I.setName(r.get("name").toString()));
				int weight = (Integer.parseInt(r.get("weight").toString()));
				System.out.println("weight of pulse item is " + I.setWeight(weight));
				int price = Integer.parseInt(r.get("price").toString());
				System.out.println("Price of pulse item is " + I.setPrice(price));
			}
		}

		else if (item.equals("Wheat")) {
			for (int i = 0; i < Wheat.size(); i++) {
				JSONObject r = (JSONObject) Wheat.get(i);
				System.out.println("Name of wheat item is " + I.setName(r.get("name").toString()));
				int weight = (Integer.parseInt(r.get("weight").toString()));
				System.out.println("weight of wheat item is " + I.setWeight(weight));
				int price = Integer.parseInt(r.get("price").toString());
				System.out.println("Price of wheat item is " + I.setPrice(price));
			}
		}
		else
		{
			System.out.println("Invalid input enter again");
		}
	}
}
