package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface ManagerService {
public void addDoctor() throws JsonParseException, JsonMappingException, IOException, Exception;
public void deleteDoctor() throws JsonParseException, JsonMappingException, IOException, Exception;
public void updateDoctorDetails() throws JsonParseException, JsonMappingException, IOException, Exception;
public void addPatient() throws Exception;
public void deletePatient() throws JsonParseException, JsonMappingException, IOException, Exception;
public void updatePatientDetails() throws JsonParseException, JsonMappingException, IOException, Exception;
}
