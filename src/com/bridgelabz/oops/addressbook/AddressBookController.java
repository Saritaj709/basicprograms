/******************************************************************************
 *  Compilation:  javac -d bin AddressBookController.java
 *  Execution:    java -cp bin com.bridgelabz.oops.addressbook.java AddressBook
 *  Purpose: Displays a address book management system
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  09-06-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.inventory.JsonUtil;
import com.bridgelabz.utility.Utility;

public class AddressBookController {
	static List<Person> list = new ArrayList<>();
	static AddressBookManager manager = new AddressBookManager();
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to address book manager");
		File file = new File("/home/bridgelabz/JSarita/DataStructures/address.json");

		while (true) {
			
			System.out.println("enter choice:\n"
					+ "1 for single user address book\n"
					+ "2 for multiple address book\n");
			int choice = Utility.userInt();
			switch (choice) {
			case 1:singleUser();
			break;
				
			case 2:multipleAddressBook();
			break;
			default:break;
			}
		}
	}
	public static void singleUser() throws Exception
	{
		while(true)
		{
			System.out.println("Enter the operation you want to do:" + "1.Create new AddressBook\n " + "2.remove user\n"
					+ "3.Print the data\n" + "4Sort by name\n" + "5.Sort by zip\n" + "6.GetfullName of user\n"
					+ "7.Editdetails of user\n"
					+ "8.AddressBookId of user and details of user at that id\n"
					+ "9 Exit\n");
			System.out.println("enter choice");
			int choice=Utility.userInt();
			switch(choice)
			{
			case 1:manager.createAddressBook();
			break;
			case 2:manager.removeAddressBook();
				break;
			case 3:manager.printAllAddressBook();
			break;	
			case 4:manager.sortAddressBookByName();
			break;
				
			case 5:manager.sortAddressBookByZip();
			break;
				
			case 6:manager.userFullName();
			break;
				
			case 7:manager.editAddressBookDetails();
			break;
			case 8:manager.addressBookId();
			break;
			 default:System.out.println("invalid choice,try again");	
			 break;
			}
		}
	}
			 public static void multipleAddressBook() throws JsonParseException, JsonMappingException, IOException, ParseException
			 {
				 while(true)
				 {
					 System.out.println("enter the choice:\n"
					 		+ "1 create mutiple address book\n"
					 		+ "2 show multiple address book\n"
					 		+ "3 search address book\n"
					 		+ "4 exit\n");
					 System.out.println("enter the choice");
					 int choice=Utility.userInt();
					 switch(choice)
					 {
			case 1:
				System.out.println("enter the name of new addressBook");
				String addressBookNew = Utility.userNext();
				manager.createMultipleAddressBook(addressBookNew);
				break;
			case 2:	manager.showMultipleAddressBook();
			break;
			case 3: System.out.println("enter address book name to search");
			String bookName=Utility.userNext();
				manager.findAddressBook(bookName);
			break;
			case 4:System.out.println("Loop terminated,try again");
			break;
				
			}
		}
	}
}
