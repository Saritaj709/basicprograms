package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface ManagerService {
public void addCustomer() throws Exception;
public void deleteCustomer() throws JsonParseException, JsonMappingException, IOException, Exception;
public void updateCustomerDetails() throws JsonParseException, JsonMappingException, IOException, Exception;
public void addStock() throws Exception;
public void deleteStock() throws JsonParseException, JsonMappingException, IOException, Exception;
public void updateStock() throws JsonParseException, JsonMappingException, IOException, Exception;
void updateCustomerDetails(double accountBalance) throws Exception;
}
