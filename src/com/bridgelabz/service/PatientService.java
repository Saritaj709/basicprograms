package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface PatientService {
public void showPatientDetails() throws JsonParseException, JsonMappingException, IOException;
public void searchPatientByName() throws JsonParseException, JsonMappingException, IOException;
public void searchPatientById() throws JsonParseException, JsonMappingException, IOException;
public void searchPatientByNumber() throws JsonParseException, JsonMappingException, IOException;
}
