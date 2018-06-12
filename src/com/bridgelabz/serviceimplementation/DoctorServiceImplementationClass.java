package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.DoctorService;
import com.bridgelabz.utility.ClinicalUtility;

public class DoctorServiceImplementationClass implements DoctorService {
	File fileDoctor = new File(
			"/home/bridgelabz/JSarita/ClinicalManagementSystem/src/com/bridgelabz/files/Doctor.json");
	List<Doctor> doctorList = new LinkedList<>();

	@Override
	public void showDoctorDetails() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
		for (int index = 0; index < doctorList.size(); index++) {
			System.out.println("Name of Doctor at index " + index + " is " + doctorList.get(index).getDoctorName());
			System.out.println("Id of Doctor " + doctorList.get(index).getDoctorName() + " is "
					+ doctorList.get(index).getDoctorId());
			System.out.println("Specialization of Doctor " + doctorList.get(index).getDoctorName() + " is "
					+ doctorList.get(index).getDoctorSpecialization());
			System.out.println("Availability of Doctor " + doctorList.get(index).getDoctorName() + " is "
					+ doctorList.get(index).getDoctorAvailability());
			System.out.println("Patient count of Doctor " + doctorList.get(index).getDoctorName() + " is "
					+ doctorList.get(index).getPatientCountForDoctor());
		}
	}

	@Override
	public void searchDoctorById() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
		System.out.println("enter the id of the doctor to search");
		String id = ClinicalUtility.userNext();
		for (int index = 0; index < doctorList.size(); index++) {
			if (doctorList.get(index).getDoctorId().equals(id)) {
				System.out.println("Doctor at index " + index + " is present with id " + id);
				System.out.println("Doctor Name is " + doctorList.get(index).getDoctorName());
				System.out.println("Doctor Specialization is " + doctorList.get(index).getDoctorSpecialization());
				System.out.println("Doctor Availability is " + doctorList.get(index).getDoctorAvailability());
				System.out.println("Patient count for doctor is " + doctorList.get(index).getPatientCountForDoctor());
			} else {
				System.out.println("Doctor with given id is not present in doctor list");
			}
		}
	}

	@Override
	public void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
		System.out.println("enter the name of the doctor to search");
		String name = ClinicalUtility.userNext();
		for (int index = 0; index < doctorList.size(); index++) {
			if (doctorList.get(index).getDoctorName().equals(name)) {
				System.out.println("Doctor at index " + index + " is present with name " + name);
				System.out.println("Doctor Id is " + doctorList.get(index).getDoctorId());
				System.out.println("Doctor Specialization is " + doctorList.get(index).getDoctorSpecialization());
				System.out.println("Doctor Availability is " + doctorList.get(index).getDoctorAvailability());
				System.out.println("Patient count for doctor is " + doctorList.get(index).getPatientCountForDoctor());
			} else {
				System.out.println("Doctor with given name is not present in doctor list");
			}
		}
	}

	@Override
	public void searchDoctorBySpecialization() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
		System.out.println("enter the specialization of the doctor to search");
		String specialization = ClinicalUtility.userNext();
		for (int index = 0; index < doctorList.size(); index++) {
			if (doctorList.get(index).getDoctorSpecialization().equals(specialization)) {
				System.out.println("Doctor at index " + index + " is present with specialization " + specialization);
				System.out.println("Doctor Id is " + doctorList.get(index).getDoctorId());
				System.out.println("Doctor name is " + doctorList.get(index).getDoctorName());
				System.out.println("Doctor Availability is " + doctorList.get(index).getDoctorAvailability());
				System.out.println("Patient count for doctor is " + doctorList.get(index).getPatientCountForDoctor());
			} else {
				System.out.println("Doctor with given specialization is not present in doctor list");
			}
		}

	}

	@Override
	public void searchDoctorByAvailability() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
		System.out.println("enter the availability of the doctor to search");
		String availability = ClinicalUtility.userNext();
		for (int index = 0; index < doctorList.size(); index++) {
			if (doctorList.get(index).getDoctorAvailability().equals(availability)) {
				System.out.println("Doctor at index " + index + " is present with availability " + availability);
				System.out.println("Doctor Id is " + doctorList.get(index).getDoctorId());
				System.out.println("Doctor name is " + doctorList.get(index).getDoctorName());
				System.out.println("Doctor Specialization is " + doctorList.get(index).getDoctorSpecialization());
				System.out.println("Patient count for doctor is " + doctorList.get(index).getPatientCountForDoctor());
			} else {
				System.out.println("Doctor with given availability is not present in doctor list");
			}
		}
	}

	@Override
	public void searchMostPopularDoctor() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
		int patientCount[] = new int[10];
		int max;
		List<Integer> list = new LinkedList<>();
		for (int index = 0; index < doctorList.size(); index++) {
			list.add(doctorList.get(index).getPatientCountForDoctor());
		}
		for (int index = 0; index < doctorList.size(); index++) {
			if (doctorList.get(index).getPatientCountForDoctor() == Collections.max(list)) {
				System.out.println("Most popular doctor is : " + doctorList.get(index).getDoctorName());
				System.out
						.println("Most popular specialization is : " + doctorList.get(index).getDoctorSpecialization());
			}
		}
	}
}
