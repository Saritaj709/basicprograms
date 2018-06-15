package com.bridgelabz.oops.addressbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.inventory.JsonUtil;
import com.bridgelabz.utility.Utility;

public class AddressBookManager {
	AddressBook book;
	AddressBook addressBook = new AddressBook();
	List<String> addressBookList = new ArrayList<>();
	List<Person> personList = new ArrayList<>();
	ObjectMapper mapper = new ObjectMapper();
	File file = new File("/home/bridgelabz/JSarita/DataStructures/address1.json");
	String filepath = "/home/bridgelabz/JSarita/DataStructures/";
	String bookList = "/home/bridgelabz/JSarita/DataStructures/addressBooks.json";
	String addressBookName;

	public void addressBookId() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter the id you want to search");
		String id = Utility.userNext();
		addressBook.searchId(id);

	}

	public AddressBook createAddressBook() throws Exception {
		book = new AddressBook();
		System.out.println("enter the details to create an addressBook");
		book.addPerson();
		System.out.println("Address book created");
		return book;
	}

	public void save() throws JsonGenerationException, JsonMappingException, IOException {
		JsonUtil.saveToJson(file, personList);
	}

	public void removeAddressBook() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		addressBook.removePerson();
	}

	public void sortAddressBookByZip()
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		addressBook.sortByZip();
	}

	public void sortAddressBookByName()
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		addressBook.sortByName();
	}

	public void userFullName() throws FileNotFoundException, IOException, ParseException {
		addressBook.getFullNameOfPerson();
	}

	public void getOtherAddressBookInformationInformation()
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		addressBook.getOtherPersonInformation();
	}

	public void printAllAddressBook() throws FileNotFoundException, IOException, ParseException {
		addressBook.printAll();
	}

	public void editAddressBookDetails()
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		addressBook.editDetails();
	}

	public void createMultipleAddressBook(String addressBookNew)
			throws JsonParseException, JsonMappingException, IOException {
		addressBookList = mapper.readValue(new File(bookList), new TypeReference<List<String>>() {
		});
		File file = new File(filepath + addressBookNew + ".json");
		System.out.println("filename created");
		addDetailsToJsonFile(file);
		addressBookList.add(file.toString());
		mapper.writeValue(file, personList);
		mapper.writeValue(new File(bookList), addressBookList);
		System.out.println("AddressBook created");
	}

	public void showMultipleAddressBook() throws FileNotFoundException, IOException, ParseException {
		System.out.println("enter the addressBook name to open addressbook:");
		String addressBookOpen = Utility.userNext();
		File fileOpen = findAddressBook(addressBookOpen);
		if (fileOpen != null) {
			System.out.println("The details of the addressbook list are:");
			personList = JsonUtil.JsonParser(fileOpen, Person.class);
			for (int index = 0; index < personList.size(); index--) {
				System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString((personList.get(index))));
			}
		}
	}

	public File findAddressBook(String addressBookName) throws FileNotFoundException, IOException, ParseException {
		addressBookList = mapper.readValue(new File(bookList), new TypeReference<List<String>>() {
		});
		if (addressBookList.contains(filepath + addressBookName + ".json")) {
			int index = addressBookList.indexOf(filepath + addressBookName + ".json");
			System.out.println(" address book found");
			return new File(addressBookList.get(index));
		}
		System.out.println("addressBook not found");
		return null;
	}

	public void addDetailsToJsonFile(File file) throws JsonGenerationException, JsonMappingException, IOException {
		Person person = new Person();
		System.out.println("enter the details you want to enter:id,firstname,lastname,address,city,zip,phone");
		String id = person.setId(Utility.userNext());
		String firstName = person.setFirstName(Utility.userNext());
		String lastName = person.setLastName(Utility.userNext());
		String address = person.setAddress(Utility.userNext());
		String city = person.setCity(Utility.userNext());
		String zip = person.setZip(Utility.userNext());
		String Phone = person.setPhone(Utility.userNext());
		personList.add(person);
		JsonUtil.saveToJson(file, personList);

	}

}
