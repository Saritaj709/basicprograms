package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.PatientService;
import com.bridgelabz.utility.ClinicalUtility;

public class PatientServiceImplementationClass implements PatientService {
	File filePatient=new File("/home/bridgelabz/JSarita/ClinicalManagementSystem/src/com/bridgelabz/files/patient.json");
	List<Patient> patientList=new LinkedList<>();

	@Override
	public void showPatientDetails() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		patientList=ClinicalUtility.jsonParser(filePatient,Patient.class);
		for(int index=0;index<patientList.size();index++)
		{
		 System.out.println("Name of Patient at index "+index+" is "+patientList.get(index).getPatientName());
		 System.out.println("Id of Patient "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientId());
		 System.out.println("Age of Patient is "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientAge());
		System.out.println("Mobile no. of patient is "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientMobileNumber());
		}
	}
	@Override
	public void searchPatientByName() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		patientList=ClinicalUtility.jsonParser(filePatient,Patient.class);
		System.out.println("enter the name of the patient to search");
		String name=ClinicalUtility.userNext();
		for(int index=0;index<patientList.size();index++)
		{
			if(patientList.get(index).getPatientName().equals(name))
			{
				System.out.println("Name of patient at index "+index+" is "+patientList.get(index).getPatientName());
				System.out.println("Id of patient  "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientId());
				System.out.println("Age of patient  "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientAge());
				System.out.println("Mobile No. of patient "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientMobileNumber());
			}
			else
			{
				System.out.println("Patient with given Name does not exist");
			}
		}
	}

	@Override
	public void searchPatientById() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		patientList=ClinicalUtility.jsonParser(filePatient,Patient.class);
		System.out.println("enter the Id of the patient to search");
		String id=ClinicalUtility.userNext();
		for(int index=0;index<patientList.size();index++)
		{
			if(patientList.get(index).getPatientId().equals(id))
			{
				System.out.println("Name of patient at index "+index+" is "+patientList.get(index).getPatientId());
				System.out.println("Name of patient  "+patientList.get(index).getPatientName());
				System.out.println("Age of patient  "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientAge());
				System.out.println("Mobile No. of patient "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientMobileNumber());
			}
			else
			{
				System.out.println("patient with given id does not exist");
			}
		}
	}

	@Override
	public void searchPatientByNumber() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		patientList=ClinicalUtility.jsonParser(filePatient,Patient.class);
		System.out.println("enter the mobile number of the patient to search");
		String number=ClinicalUtility.userNext();
		for(int index=0;index<patientList.size();index++)
		{
			if(patientList.get(index).getPatientMobileNumber().equals(number))
			{
				System.out.println("Mobile Number of patient at index "+index+" is "+patientList.get(index).getPatientMobileNumber());
				System.out.println("Name of patient "+patientList.get(index).getPatientName());
				System.out.println("Id of patient  "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientId());
				System.out.println("Age of patient  "+patientList.get(index).getPatientName()+" is "+patientList.get(index).getPatientAge());			
			}
			else
			{
				System.out.println("Patient with given mobile number doe not exist");
			}
		}
	}

}
