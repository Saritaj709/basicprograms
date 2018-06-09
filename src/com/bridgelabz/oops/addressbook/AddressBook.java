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
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
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
	File file = new File("/home/bridgelabz/JSarita/DataStructures/address1.json");
	int addressBookCount = 0;
String choice;
	public AddressBook()
	{
		
	}
	public void addPerson() throws Exception {
		list=JsonUtil.JsonParser(file,Person.class);
		Person person = new Person(id, firstName, lastName, address, city, zip, phone);
		System.out.println("enter the person details,id,firstname,lastname,address,city,zip,phone");
		id = person.setId(Utility.userString());
		id=person.setId(Utility.userString());
		firstName = person.setFirstName(Utility.userString());
		lastName = person.setLastName(Utility.userString());
		address = person.setAddress(Utility.userString());
		city = person.setCity(Utility.userString());
		zip = person.setZip(Utility.userString());
		phone = person.setPhone(Utility.userString());	
		list.add(person);
		JsonUtil.saveToJson(file, list);
		System.out.println("Person added");
		addressBookCount++;
		System.out.println("AddressBookcount is: " + addressBookCount);
		
	}
	public void getFullNameOfPerson() throws FileNotFoundException, IOException, ParseException
																																							// lastName)
	{
		list=JsonUtil.JsonParser(file,Person.class);
		
			String fullName;
			System.out.println("enter the id of the person whose fullName is required");
			String id = Utility.userNext();
			if(id==searchId(id))
			System.out.println("enter the index where id is present");
			int i = Utility.userInt();
			fullName = list.get(i).getFirstName() + list.get(i).getLastName();
			System.out.println("Full name of person is: " + fullName);
		}

		
	public void getOtherPersonInformation()
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		list=JsonUtil.JsonParser(file,Person.class);
			System.out.println("enter the id of the person whose details has been seen");
			String id = Utility.userNext();
			searchId(id);
			System.out.println("enter the index where the id is present");
			int index = Utility.userInt();
			for (int j = 0; j < list.size(); index++) {
				if(j==index) {
					System.out.println("firstName of person" + index + "  = " + list.get(index).getFirstName());
					System.out.println("id of person" + index + " = " + list.get(index).getId());
					System.out.println("lastName of person" + index + "= " + list.get(index).getLastName());
					System.out.println("address of person" + index + "= " + list.get(index).getAddress());
					System.out.println("city of person" + index + "= " + list.get(index).getCity());
					System.out.println("zip of person" + index + "= " + list.get(index).getZip());
					System.out.println("phone of person" + index + "= " + list.get(index).getPhone());
				}
			}
	}

	public String removePerson() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		list=JsonUtil.JsonParser(file,Person.class);
			System.out.println("enter the id of the person who is to be deleted");
			String id = Utility.userNext();
			searchId(id);
				System.out.println("enter the index where the id is present");
				int index=Utility.userInt();
				System.out.println("deleting person");
				list.remove(index);
				confirm();
				System.out.println("Id removed: " + list.remove(index));
		return id;
	}

	public void sortByName() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		list=JsonUtil.JsonParser(file,Person.class);
			String[] names = new String[10];
			Person person = new Person();
			String temp;
			System.out.println("Sorting by name");
			for (int index = 0; index < list.size(); index++) {
				names[index] = list.get(index).getFirstName();
			}
			for (int index = 0; index < list.size(); index++) {
				for (int j = index + 1; j < list.size(); j++) {
					if (names[index].compareTo(names[j]) > 0) {
						temp = names[index];
						names[index] = names[j];
						names[j] = temp;
						person.setFirstName(temp);
					}
				}
			}
			System.out.println("names in sorted order :");
			for (int i = 0; i < list.size(); i++)
				System.out.println(names[i] + " ");
	}

	public void sortByZip() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		list=JsonUtil.JsonParser(file,Person.class);
			String[] zip = new String[10];
			String temp;
			Person person = new Person();
			System.out.println("Sorting by zip");
			for (int index = 0; index < list.size(); index++) {
				zip[index] = list.get(index).getZip();
			}
			for (int index = 0; index < list.size(); index++) {
				for (int j = index + 1; j < list.size(); j++) {
					if (zip[index].compareTo(zip[j]) > 0) {
						temp = zip[index];
						zip[index] = zip[j];
						zip[j] = temp;

					}
				}
			}
			System.out.println("The person details in sorted order by zip: ");
			for (int index = 0; index < list.size(); index++) {
				temp = zip[index];
				person.setFirstName(temp);
				System.out.println(zip[index] + " ");
			}
	}

	public void printAll() throws FileNotFoundException, IOException, ParseException {
		list=JsonUtil.JsonParser(file,Person.class);
			System.out.println("The details of person are:");
			for (int index = 0; index < list.size(); index++) {
				System.out.println("firstName of person" + index + "  = " + list.get(index).getFirstName());
				System.out.println("id of person" + index + " = " + list.get(index).getId());
				System.out.println("lastName of person" + index + "= " + list.get(index).getLastName());
				System.out.println("address of person" + index + "= " + list.get(index).getAddress());
				System.out.println("city of person" + index + "= " + list.get(index).getCity());
				System.out.println("zip of person" + index + "= " + list.get(index).getZip());
				System.out.println("phone of person" + index + "= " + list.get(index).getPhone());
			}
	}

	public void editDetails() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		list=JsonUtil.JsonParser(file,Person.class);
			Person person = new Person();
			System.out.println("enter the id of person whose details are to be edited: ");
			String id = Utility.userNext();
			//searchId(id);
			System.out.println("enter the index where id is present");
			int index = Utility.userInt();
			searchId(id);	
				System.out.println("id is at index" + index + " found,enter the details to edit,id,address,city,zip,phone");
				firstName=list.get(index).getFirstName();
				person.setFirstName(firstName);
				lastName=list.get(index).getLastName();
				person.setLastName(lastName);
				person.setId(Utility.userString());
				person.setAddress(Utility.userString());
				person.setCity(Utility.userString());
				person.setZip(Utility.userString());
				person.setPhone(Utility.userString());
				list.add(person);
				confirm();
				System.out.println("edited details");
				list.remove(index);
				confirm();
				System.out.println("updated details");
			}
	public void updatePerson() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		list=JsonUtil.JsonParser(file,Person.class);
			System.out.println("Do you want to update the details of the person whose data has been edited");
			System.out.println("enter the index where the id is found");
			int index = Utility.userInt();
			String id = Utility.userString();
			list.remove(index);	
	}

	public String searchId(String id) throws JsonParseException, JsonMappingException, IOException {
		list=JsonUtil.JsonParser(file,Person.class);
		System.out.println("enter the id again to confirm");
		id=Utility.userNext();
			String[] id1 = new String[10];
			for (int index = 0; index < list.size(); index++) {
				id1[index] = list.get(index).getId();
				if (id1[index].equals(id)) 
					System.out.println("id found"+" at index "+index);
			}
					System.out.println("id not found");
		return id;
}
	public void confirm() throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println("Do you want to save:yes/no");
		{
			choice=Utility.userNext();
			if(choice.equals("yes"))
			{
				JsonUtil.saveToJson(file, list);
				System.out.println("list updated");
			}
		}
	}
}
