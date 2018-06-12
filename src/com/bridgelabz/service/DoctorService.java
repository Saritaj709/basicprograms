package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface DoctorService{

	public void showDoctorDetails() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorById() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorBySpecialization() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorByAvailability() throws JsonParseException, JsonMappingException, IOException;
}
