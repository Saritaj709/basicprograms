package com.bridgelabz.oops.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
	static List<String> person=new ArrayList<>();
	public static void main(String[] args) throws Exception
	{
		String firstName,lastName,address,city,zip,phone;
System.out.println("welcome");
AddressBookManager manager=new AddressBookManager();
AddressBook book=new AddressBook();

System.out.println("add");
book.addPerson();
book.getFullNameOfPerson();
book.printAll();
book.sortByName();
book.sortByZip();
book.removePerson();
book.editDetails();

}
}