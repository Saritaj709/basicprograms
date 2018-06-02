package com.bridgelabz.oops;

import java.io.FileReader;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonInventory2 {

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
		
		/*JSONArray rice = (JSONArray) jo.get("Rice");
		for (int i = 0; i < rice.size(); i++) {
			JSONObject r = (JSONObject) rice.get(i);
			int a  = (int) r.get("weight");
			riceTotalWeight += Integer.parseInt(r.get("weight").toString());
			riceTotalPrice += Integer.parseInt(r.get("price").toString());
			totalPrice = riceTotalWeight * riceTotalPrice;
			System.out.println("totalprice of rice:" + totalPrice);
			// totalPrice+=riceTotalWeight*riceTotalPrice;
		}
		// System.out.println("final total price of rice:"+totalPrice);
		System.out.println("\nRice:");
		Iterator it1 = rice.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		JSONArray Pulses = (JSONArray) jo.get("Pulses");
		for (int i = 0; i < Pulses.size(); i++) {
			JSONObject p = (JSONObject) Pulses.get(i);
			pulseTotalWeight += Integer.parseInt(p.get("weight").toString());
			pulseTotalPrice += Integer.parseInt(p.get("price").toString());
			totalPrice = pulseTotalWeight * pulseTotalPrice;
			System.out.println("totalprice of pulses: " + totalPrice);
			// totalPrice+=pulseTotalWeight*pulseTotalPrice;
		}
		// System.out.println("final total price of pulses"+totalPrice);
		System.out.println("\nPulses:");
		Iterator it2 = Pulses.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		JSONArray Wheat = (JSONArray) jo.get("Wheat");
		for (int i = 0; i < Wheat.size(); i++) {
			JSONObject w = (JSONObject) Wheat.get(i);
			wheatTotalWeight += Integer.parseInt(w.get("weight").toString());
			wheatTotalPrice += Integer.parseInt(w.get("price").toString());
			totalPrice = wheatTotalWeight * wheatTotalPrice;
			System.out.println("totalprice of wheat: " + totalPrice);
		}
		System.out.println("\nWheat:");
		Iterator it3 = Wheat.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

		System.out.println("enter the no. of rice items");
		int r = Utility.userInt();
		for (int i = 0; i < r; i++) {
			System.out.println("enter rice type:");
			String Rice1 = inventory.setName(Utility.userNext());
			System.out.println("Rice type is:" + Rice1);
			System.out.println("\nenter price:");
			int price = inventory.setPrice(Utility.userInt());
			System.out.println("price is:" + price);
			System.out.println("enter weight:");
			int weight = inventory.setWeight(Utility.userInt());
			System.out.println("Weight is:" + weight);
			System.out.println("Totalprice of " + Rice1 + " is " + inventory.totalPrice(price, weight));

		}
		System.out.println("enter the no. of pulse items");
		int p = Utility.userInt();
		for (int i = 0; i < p; i++) {
			System.out.println("enter pulse type:\n");
			String pul1 = inventory.setName(Utility.userNext());

			System.out.println("pulse type is:" + pul1);
			System.out.println("\nenter price:");
			int price = inventory.setPrice(Utility.userInt());
			System.out.println("price is:" + price);
			System.out.println("enter weight:");
			int weight = inventory.setWeight(Utility.userInt());
			System.out.println("Weight is:" + weight);
			System.out.println("Totalprice of " + pul1 + " is " + inventory.totalPrice(price, weight));

		}
		System.out.println("enter the no. of wheat items");
		int w = Utility.userInt();
		for (int i = 0; i < w; i++) {
			System.out.println("enter wheat type:\n");
			String wt1 = inventory.setName(Utility.userNext());

			System.out.println("wheat type is:" + wt1);
			System.out.println("\nenter price:");
			int price = inventory.setPrice(Utility.userInt());
			System.out.println("price is:" + price);
			System.out.println("enter weight:");
			int weight = inventory.setWeight(Utility.userInt());
			System.out.println("Weight is:" + weight);
			System.out.println("Totalprice of " + wt1 + " is " + inventory.totalPrice(price, weight));

		}*/
	}
}
