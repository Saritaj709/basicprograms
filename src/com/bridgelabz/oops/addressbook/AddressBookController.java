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
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.oops.inventory.JsonUtil;
import com.bridgelabz.utility.Utility;

public class AddressBookController {
	static List<Person> list=new ArrayList<>();
	public static void main(String[] args) throws Exception
	{
System.out.println("welcome to address book manager");
AddressBookManager manager=new AddressBookManager();
AddressBook addressBook=new AddressBook();
File file=new File("/home/bridgelabz/JSarita/DataStructures/address.json");

do
{
	System.out.println("Enter the operation you want to do:"
			+ "1.Create new AddressBook\n "
			+ "2.remove user\n"
			+ "3.Print the data\n"
			+ "4Sort by name\n"
			+ "5.Sort by zip\n"
			+ "6.GetfullName of user\n"
			+ "7.Editdetails of user\n"
			+ "8.Create new addressBook for user\n"
			+"9.AddressBookId of user and details of user at that id\n"
			+ "10.save\n"
			+ "11.show multiple address book\n"
	         +  "12.Exit");
	System.out.println("enter the choice 1 to 12");
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
case 8:System.out.println("enter the name of new addressBook");
String addressBookNew=Utility.userNext();
manager.createMultipleAddressBook(addressBookNew);     
       break;
case 9:manager.addressBookId();
       break;
case 10:JsonUtil.saveToJson(file,list);
        break;
case 11:manager.showMultipleAddressBook();
        break;
case 12:System.out.println("Loop terminated,try again");
       break;
}
}
while(true);
	}
}