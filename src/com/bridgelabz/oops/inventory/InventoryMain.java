package com.bridgelabz.oops.inventory;

import java.util.List;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class InventoryMain {

	List<InventoryPojo> l = new ArrayList<InventoryPojo>();

	public static void main(String[] args) {
		System.out.println("enter the amount of data");
		int n = Utility.userInt();
		InventoryPojo ip = new InventoryPojo();
		System.out.println("enter the choice,1 for entry,0 for exit");
		int choice = Utility.userInt();
			switch (choice) {
			case 1:
				System.out.println("enter product details");
				ip.setProduct(Utility.userNext());
				ip.setPrice(Utility.userInt());
				ip.setQuantity(Utility.userInt());
				String details=JsonUtil.ConvertJavaToJson(ip);
				System.out.println(details);
				break;
			case 0:System.out.println("invalid input");
				break;
		}
	}
}
