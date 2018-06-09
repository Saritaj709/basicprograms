package com.bridgelabz.oops.inventory;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class InventoryMain {

	static List<InventoryPojo> inventoryList = new ArrayList<InventoryPojo>();

	public static void main(String[] args) throws Exception {
		System.out.println("enter the no of items");
		int noOfItems = Utility.userInt();
			for(int index=0;index<noOfItems;index++)
			{
				InventoryPojo inventory = new InventoryPojo();
				System.out.println("enter product details");
				inventory.setProduct(Utility.userNext());
				inventory.setPrice(Utility.userInt());
				inventory.setQuantity(Utility.userInt());
				inventoryList.add(inventory);
				JsonUtil.toJson(new File("inventory.json"),inventoryList);
				String details=JsonUtil.ConvertJavaToJson(inventory);
				System.out.println(details);
			}
		}
}
