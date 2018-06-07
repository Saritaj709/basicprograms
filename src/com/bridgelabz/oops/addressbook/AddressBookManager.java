package com.bridgelabz.oops.addressbook;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import com.bridgelabz.utility.Utility;

public class AddressBookManager {
	AddressBook book;
	String firstName;
	String lastName;
	String address;
	String city;
	String zip;
	String phone;
public AddressBookManager AddressBookManager()
{
	System.out.println("initialized to addressbookmanager");
	return AddressBookManager();
}public int getNoOfPerson(int n)
	{
    System.out.println("enter the no. of persons");
	 n=Utility.userInt();
	 return n;
	}
public String addressBookId(String Id)
{
	return Id;
}
public AddressBook createAddressBook(AddressBook addressBook)
{
	book=new AddressBook();
	System.out.println("Address book created");
	return book;
}

public void saveToJson(File file,Object object) throws JsonGenerationException, JsonMappingException, IOException
{
	file=new File("address.json");
	ObjectMapper mapper=new ObjectMapper();
	ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
	writer.writeValue(file, object);
	System.out.println("done file");
	
}
public AddressBook removeAddressBook(AddressBook addressBook)
{
	return addressBook;
}
}
