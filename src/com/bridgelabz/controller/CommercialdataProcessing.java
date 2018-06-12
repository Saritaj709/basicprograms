/******************************************************************************
 *  Compilation:  javac -d bin CommercialDataProcessing.java
 *  Execution:    java -cp bin com.bridgelabz.controller.java ManagerServiceimplementationClass
 *  Purpose: Displays a stock account management system
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  12-06-2018
 ******************************************************************************/

package com.bridgelabz.controller;

import com.bridgelabz.serviceimplementation.ManagerServiceImplementation;
import com.bridgelabz.utility.StockUtility;

public class CommercialdataProcessing {
	static ManagerServiceImplementation manager = new ManagerServiceImplementation();

	public static void main(String[] args) throws Exception {
		System.out.println("*************************************************");
		System.out.println("WELCOME TO STOCK ACCOUNT MANAGEMENT");
		System.out.println("****************************************************");
		System.out.println("PLEASE ENTER VALID OPTIONS ");
		System.out.println("*******************************************************");
		System.out.println("enter the choice\n" + "1 for customer\n" + "2 for Stock\n" + "3 for transaction\n");
		int choice = StockUtility.userInteger();
		while (true) {
			switch (choice) {
			case 1:
				customerLevel();
				break;
			case 2:
				stockLevel();
				break;
			case 3:
				manager.addTransactionDetails();
				break;
			default:
				System.out.println("invalid choice,pls try again");
				break;
			}
		}
	}

	public static void customerLevel() throws Exception {
		while (true) {

			System.out.println("enter your choice\n" + "1 Add Customer\n" + "2 Remove/Delete Customer\n"
					+ "3 Update Customer\n" + "4 show customer details\n");
			int choice = StockUtility.userInteger();
			switch (choice) {
			case 1:
				manager.addCustomer();
				break;
			case 2:
				manager.deleteCustomer();
				break;
			case 3:
				manager.updateCustomerDetails();
				break;
			case 4:
				manager.showCustomerDetails();
				break;
			default:
				System.out.println("invalid choice,pls try again");
				break;
			}
		}
	}

	public static void stockLevel() throws Exception {

		while (true) {
			System.out.println("enter your choice\n" + "1 Add Stock\n" + "2 Remove/Delete Stock\n"
					+ "3 Update Stock Details\n" + "4 show Stock details\n");
			int choice = StockUtility.userInteger();
			switch (choice) {
			case 1:
				manager.addStock();
				break;
			case 2:
				manager.deleteStock();
				break;
			case 3:
				manager.updateStock();
				break;
			case 4:
				manager.showStockDetails();
				break;
			default:
				System.out.println("invalid choice,pls try again");
				break;
			}
		}
	}
}
