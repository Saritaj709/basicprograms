package com.bridgelabz.oops.addressbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.inventory.JsonUtil;
import com.bridgelabz.utility.Utility;

public class AddressBook {
	List<Person> list = new ArrayList<>();
	String firstName, id, lastName, address, city, zip, phone;

	ObjectMapper mapper = new ObjectMapper();
	JSONObject obj = new JSONObject();
	AddressBookManager manager = new AddressBookManager();
	AddressBook book;
	int addressBookCount = 0,n=2;

	public AddressBook AddressBook(AddressBook AddressBook) {
		System.out.println("AddressBook initialized");
		return AddressBook;
	}

	public int getNoOfPerson(int n) {
		System.out.println("enter the no. of persons");
		n = Utility.userInt();
		return n;
	}

	public void addPerson() throws Exception {
		for (int i = 0; i < n; i++) {
			Person p = new Person();
			System.out.println("enter the person details,id,firstname,lastname,address,city,zip,phone");
			id = p.setId(Utility.userString());
			firstName = p.setFirstName(Utility.userString());
			lastName = p.setLastName(Utility.userString());
			address = p.setAddress(Utility.userString());
			city = p.setCity(Utility.userString());
			zip = p.setZip(Utility.userString());
			phone = p.setPhone(Utility.userString());
			list.add(p);
			manager.saveToJson(new File("address.json"), list);
			System.out.println("Person added");
			addressBookCount++;
			System.out.println("AddressBookcount is: " + addressBookCount);
		}
	}

	public void getFullNameOfPerson()// String firstName,String lastName)
	{
		String firstName, lastName;
		String fullName;
		for(int i=0;i<n;i++)
		{
		fullName = list.get(i).getFirstName() +list.get(i).getLastName();
		System.out.println("Full name of person is: " +fullName);
		}
	}

	public String[] getOtherPersonInformation(String[] str)
	{
		System.out.println("enter the id of the person whose details has been seen");
		for(int i=0;i<n;i++)
		{
		str[i]=list.get(i).getId();
		System.out.println("ids are: "+str);
		}
		return str;	
		}

	public void updatePerson(String firstName, String lastName, String address, String city, String zip, String phone) {

	}

	public Person edit(Person person) {
		return person;
	}

	public String removePerson() throws JsonGenerationException, JsonMappingException, IOException {
     System.out.println("enter the id of the person who is to be deleted");
     String id=Utility.userString();
              if(id==searchId(id))
              {
			System.out.println("id found");
		System.out.println("deleting person");
		list.remove(id);
		manager.saveToJson(new File("address.json"), list);
		System.out.println("Id removed: "+list.remove(id));
	}
    
    else
		{
			System.out.println("id not found");
    	 }
    
     return id;
	}
	public void sortByName() throws JsonGenerationException, JsonMappingException, IOException {
		String firstName,lastName; 
		 String[] names=new String[10];
		 Person person=new Person();
		 String temp;
		System.out.println("Sorting by name");
		for(int i=0;i<n;i++)
		{
			names[i]=list.get(i).getFirstName();
		}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(names[i].compareTo(names[j])>0)
					{
						temp=names[i];
						names[i]=names[j];
						names[j]=temp;
					person.setFirstName(temp);
					list.add(person);
					manager.saveToJson(new File("address.json"), list);
					}
				}
			}
			System.out.println("names in sorted order :");
		for(int i=0;i<n;i++)
		System.out.println(names[i]+" ");
		}	

	public void sortByZip() throws JsonGenerationException, JsonMappingException, IOException {
		String[] zip=new String[10];
		String temp;
		Person person=new Person();
		System.out.println("Sorting by zip");
		for(int i=0;i<n;i++)
		{
			zip[i]=list.get(i).getZip();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{    
				if(zip[i].compareTo(zip[j])>0)
				{
				temp=zip[i];
				zip[i]=zip[j];
				zip[j]=temp;
				
			}
		}
	}
System.out.println("The person details in sorted order by zip: ");
for(int i=0;i<n;i++)
{
	temp=zip[i];
	person.setFirstName(temp);
	list.add(person);
	manager.saveToJson(new File("address.json"), list);
	System.out.println(zip[i]+" ");
	
}
}

	public void printAll() throws FileNotFoundException, IOException, ParseException {
    System.out.println("The details of person are:");
    for(int i=0;i<n;i++)
    {
    System.out.println("firstName of person"+i+"  = "+list.get(i).getFirstName());
	System.out.println("id of person"+i+" = "+list.get(i).getId());
		System.out.println("lastName of person"+i+"= "+list.get(i).getLastName());
		System.out.println("address of person"+i+"= "+list.get(i).getAddress());
		System.out.println("city of person"+i+"= "+list.get(i).getCity());
		System.out.println("zip of person"+i+"= "+list.get(i).getZip());
		System.out.println("phone of person"+i+"= "+list.get(i).getPhone());
    }
	}

	public void editDetails() throws JsonGenerationException, JsonMappingException, IOException
	{
		Person person=new Person();
		System.out.println("enter the id of person whose details are to be edited: ");
		String id=Utility.userString();
		if(id==searchId(id))
		{
			System.out.println("id is found,enter the details to edit,firstname,lastname,address,city,zip,phone");
			person.setFirstName(Utility.userString());
			person.setLastName(Utility.userString());
			person.setAddress(Utility.userString());
			person.setCity(Utility.userString());
			person.setZip(Utility.userString());
			person.setPhone(Utility.userString());
			list.add(person);
			manager.saveToJson(new File("address.json"), list);	
		}
	}
	public boolean getChangedSinceLastSave() {
		return true;
	}

	public boolean setChangedSinceLastSave(boolean changedSinceLastSave) {
		if (getChangedSinceLastSave() == true)
			return true;
		else
			return false;
	}
	public String searchId(String id)
	{
		String[] id1=new String[10];
	for(int i=0;i<n;i++)
	   {
		   id1[i]=list.get(i).getId();
	   }
	    for(int i=0;i<n;i++)
	    {
			if(id1[i].equals(id))
			{
				System.out.println("id found");
			System.out.println("deleting person");
			list.remove(id);
			System.out.println("Id removed: "+list.remove(id));
		}
	    
	    else
			{
				System.out.println("id not found");
	    	 }
}
	    return id;
	}
}
