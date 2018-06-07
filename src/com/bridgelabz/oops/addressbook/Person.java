package com.bridgelabz.oops.addressbook;

public class Person {

	private String id,firstName,lastName,address,city,zip,phone;

	public String getId() {
		return id;
	}

	public String setId(String id) {
		return this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String setFirstName(String firstName) {
		return this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String setLastName(String lastName) {
		return this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public String setAddress(String address) {
		return this.address = address;
	}

	public String getCity() {
		return city;
	}

	public String setCity(String city) {
		return this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public String setZip(String zip) {
		return this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public String setPhone(String phone) {
		return this.phone = phone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [ firstname= "+firstName+" id= "+id+"lastName= "+lastName+" address= "+address+" city= "+city+" zip= "+zip+" phoneno.= "+phone+"]";
	}
}
