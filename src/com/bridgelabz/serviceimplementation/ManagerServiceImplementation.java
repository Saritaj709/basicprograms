package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Customer;
import com.bridgelabz.model.Stock;
import com.bridgelabz.model.Transaction;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.StockUtility;

public class ManagerServiceImplementation implements ManagerService {
	List<Customer> customerList = new LinkedList<>();
	File customerFile = new File("/home/bridgelabz/JSarita/StockAccount/src/com/bridgelabz/files/customer.json");
	List<Stock> stockList = new LinkedList<>();
	File stockFile = new File("/home/bridgelabz/JSarita/StockAccount/src/com/bridgelabz/files/stock.json");
	List<Transaction> transactionList = new LinkedList<>();
	File transactionFile = new File("/home/bridgelabz/JSarita/StockAccount/src/com/bridgelabz/files/transaction.json");

	public ManagerServiceImplementation() {
		try {
			customerList = StockUtility.jsonParser(customerFile, Customer.class);
			stockList = StockUtility.jsonParser(stockFile, Stock.class);
			transactionList = StockUtility.jsonParser(transactionFile, Transaction.class);
		} catch (Exception e) {
			customerList = new LinkedList<>();
			stockList = new LinkedList<>();
			transactionList = new LinkedList<>();
		}
	}

	@Override
	public void addCustomer() throws Exception {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		System.out.println("enter the name of customer");
		customer.setCustomerName(StockUtility.userNext());
		System.out.println("enter the mobile no.");
		customer.setMobileNumber(StockUtility.userNext());
		System.out.println("enter id of customer");
		customer.setCustomerId(StockUtility.userNext());
		System.out.println("enter account balance of customer");
		customer.setAccountBalance(StockUtility.userDouble());
		customerList.add(customer);
		save();
	}

	@Override
	public void deleteCustomer() throws Exception {
		// TODO Auto-generated method stub
		customerList = StockUtility.jsonParser(customerFile, Customer.class);
		System.out.println("enter the Id of customer you want delete");
		String id = StockUtility.userNext();
		for (int index = 0; index < customerList.size(); index++) {
			if (customerList.get(index).getCustomerId().equals(id)) {
				customerList.remove(index);
				save();
			} else {
				System.out.println("id not found");
			}
		}
	}

	public void updateCustomerDetails() throws Exception {
		// TODO Auto-generated method stub
		customerList = StockUtility.jsonParser(customerFile, Customer.class);
		System.out.println("enter the customer id to edit details");
		String id = StockUtility.userNext();
		Customer customer = new Customer();
		for (int index = 0; index < customerList.size(); index++) {
			customer.setCustomerName(customerList.get(index).getCustomerName());
			customer.setCustomerId(customerList.get(index).getCustomerId());
			customer.setAccountBalance(customerList.get(index).getAccountBalance());
			if (customerList.get(index).getCustomerId().equals(id)) {
				System.out.println("enter customer mobile no. to edit");
				customer.setMobileNumber(StockUtility.userNext());
				customer.setAccountBalance(StockUtility.userDouble());

				customerList.add(customer);
				save();
				customerList.remove(index);
				save();
			}
		}
	}

	@Override
	public void updateCustomerDetails(double accountBalance) throws Exception {
		// TODO Auto-generated method stub
		customerList = StockUtility.jsonParser(customerFile, Customer.class);
		System.out.println("enter the customer id to edit details");
		String id = StockUtility.userNext();
		Customer customer = new Customer();
		for (int index = 0; index < customerList.size(); index++) {
			customer.setCustomerName(customerList.get(index).getCustomerName());
			customer.setCustomerId(customerList.get(index).getCustomerId());
			customer.setAccountBalance(customerList.get(index).getAccountBalance());
			customer.setMobileNumber(customerList.get(index).getMobileNumber());

			if (customerList.get(index).getCustomerId().equals(id)) {
				System.out.println("enter customer mobile no. to edit");
				customer.setAccountBalance(accountBalance);
				customerList.add(customer);
				System.out.println("enter 1");
				save();
				customerList.remove(index);
				System.out.println("enter 1");
				save();
				break;
			}
		}
	}

	@Override
	public void addStock() throws Exception {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
		System.out.println("enter the name of stock");
		stock.setStockName(StockUtility.userNext());
		System.out.println("enter the symbol of stock");
		stock.setStockSymbol(StockUtility.userNext());
		System.out.println("enter the no of stock");
		stock.setNoOfStock(StockUtility.userInteger());
		System.out.println("enter the cost of stock");
		stock.setStockCharge(StockUtility.userDouble());
		stockList.add(stock);
		save();
	}

	@Override
	public void deleteStock() throws Exception {
		// TODO Auto-generated method stub
		stockList = StockUtility.jsonParser(stockFile, Stock.class);
		System.out.println("enter the symbol of stock you want delete");
		String symbol = StockUtility.userNext();
		for (int index = 0; index < stockList.size(); index++) {
			if (stockList.get(index).getStockSymbol().equals(symbol)) {
				stockList.remove(index);
				save();
			} else {
				System.out.println("symbol not found");
			}
		}
	}

	@Override
	public void updateStock() throws Exception {
		// TODO Auto-generated method stub
		stockList = StockUtility.jsonParser(stockFile, Stock.class);
		System.out.println("enter the symbol of stock you want update");
		String symbol = StockUtility.userNext();
		Stock stock = new Stock();
		for (int index = 0; index < stockList.size(); index++) {
			if (stockList.get(index).getStockSymbol().equals(symbol)) {
				stock.setStockName(stockList.get(index).getStockName());
				stock.setStockSymbol(stockList.get(index).getStockSymbol());
				System.out.println("enter the details to update,1. charge of stock,2. no of stock,");
				stock.setStockCharge(StockUtility.userDouble());
				stock.setNoOfStock(StockUtility.userInteger());
				stockList.add(stock);
				save();
				stockList.remove(index);
				save();
				break;
			} else {
				System.out.println("symbol not found");
			}
		}
	}
	private void updateStockDetails(int noOfStock) throws Exception {
		// TODO Auto-generated method stub
		stockList = StockUtility.jsonParser(stockFile, Stock.class);
		System.out.println("enter the symbol of stock you want update");
		String symbol = StockUtility.userNext();
		Stock stock = new Stock();
		for (int index = 0; index < stockList.size(); index++) {
			if (stockList.get(index).getStockSymbol().equals(symbol)) {
				stock.setStockName(stockList.get(index).getStockName());
				stock.setStockSymbol(stockList.get(index).getStockSymbol());
				stock.setStockCharge(stockList.get(index).getStockCharge());
				System.out.println(" updating no of stock,");		
				stock.setNoOfStock(noOfStock);
				stockList.add(stock);
				System.out.println("enter 2");
				save();
				stockList.remove(index);
				System.out.println("enter 2");
				save();
				//break;
			} else {
				System.out.println("symbol not found");
			}
		}
	}
	public void addTransactionDetails() throws Exception {
		Transaction transaction = new Transaction();
		System.out.println("The details for stock and customer are shown below,pls select valid details");
		showStockDetails();
		System.out.println("enter the name of stock to buy/sell");
		transaction.setStockName(StockUtility.userNext());
		System.out.println("enter the symbol of stock to buy");
		String symbol=transaction.setStockSymbol(StockUtility.userNext());
		System.out.println("enter stock charge");
		double stockCharge = transaction.setStockCharge(StockUtility.userDouble());
		System.out.println("enter the no. of stocks to buy");
		int noOfStock=transaction.setNoOfStock(StockUtility.userInteger());
		showCustomerDetails();
		System.out.println("enter the name of customer");
		transaction.setCustomerName(StockUtility.userNext());
		System.out.println("enter id of customer");
		String id = transaction.setCustomerId(StockUtility.userNext());

		while (true) {
			System.out.println("enter the option: 1 for buy stock, for sell stock\n");
			int choice = StockUtility.userInteger();
			switch (choice) {
			case 1:
				customerList = StockUtility.jsonParser(customerFile, Customer.class);
				for (int i = 0; i < customerList.size(); i++) {
					if (customerList.get(i).getCustomerId().equals(id)) {
						double newBalance = customerList.get(i).getAccountBalance() + stockCharge;
						updateCustomerDetails(newBalance);
					}
				}
				stockList = StockUtility.jsonParser(stockFile, Stock.class);
				for (int i = 0; i <stockList.size(); i++) {
					if (stockList.get(i).getStockSymbol().equals(symbol)) {
						int newStockCount = stockList.get(i).getNoOfStock() + noOfStock;
						updateStockDetails(newStockCount);
					}
				}
				System.out.println("taking date");
				transaction.setTimeStamp(StockUtility.dateTimeFormatter());
				transactionList.add(transaction);
				System.out.println(("save for transaction now"));
				save();

				break;
			case 2:customerList = StockUtility.jsonParser(customerFile, Customer.class);
			for (int i = 0; i < customerList.size(); i++) {
				if (customerList.get(i).getCustomerId().equals(id)) {
					double newBalance = customerList.get(i).getAccountBalance() + stockCharge;
					updateCustomerDetails(newBalance);
				}
			}
			stockList = StockUtility.jsonParser(stockFile, Stock.class);
			for (int i = 0; i <stockList.size(); i++) {
				if (stockList.get(i).getStockSymbol().equals(symbol)) {
					int newStockCount = stockList.get(i).getNoOfStock() + noOfStock;
					updateStockDetails(newStockCount);
				}
			}
			System.out.println("taking date");
			transaction.setTimeStamp(StockUtility.dateTimeFormatter());
			transactionList.add(transaction);
			System.out.println(("save for transaction now"));
			save();
				break;
			default:
				System.out.println("invalid option,pls try again");
				break;
			}
		}
	}

	public void showStockDetails() throws JsonParseException, JsonMappingException, IOException {
		stockList = StockUtility.jsonParser(stockFile, Stock.class);
		for (int i = 0; i < stockList.size(); i++) {
			System.out.println("Name of stock is : " + stockList.get(i).getStockName());
			System.out.println("Stock symbol is : " + stockList.get(i).getStockSymbol());
			System.out.println("Stock charge is : " + stockList.get(i).getStockCharge());
			System.out.println("Stock quantity is : " + stockList.get(i).getNoOfStock());
		   System.out.println("Total stock amount is : "+stockList.get(i).getStockCharge()*stockList.get(i).getNoOfStock());
		}
	}

	public void showCustomerDetails() throws JsonParseException, JsonMappingException, IOException {
		customerList = StockUtility.jsonParser(customerFile, Customer.class);
		for (int i = 0; i < customerList.size(); i++) {
			System.out.println("Name of customer is : " + customerList.get(i).getCustomerName());
			System.out.println("Id of customer is : " + customerList.get(i).getCustomerId());
			System.out.println("Mobile no. of customer is : " + customerList.get(i).getMobileNumber());
			System.out.println("Account balance of customer is : " + customerList.get(i).getAccountBalance());
		}
	}

	public void save() throws Exception {
		System.out.println("enter the choice to save:1/2/3\n" + "1 for data save to customer\n"
				+ "2 for save data to stock\n" + "3 for save data to transaction\n");
		String choice = StockUtility.userNext();
		if (choice.equals("1")) {
			StockUtility.saveJsonCustomer(customerFile, customerList);
		} else if (choice.equals("2")) {
			StockUtility.saveJsonStock(stockFile, stockList);
		} else if (choice.equals("3")) {
			StockUtility.saveJsonTransaction(transactionFile, transactionList);
		} else {
			System.out.println("file not saved");
		}
	}
}
