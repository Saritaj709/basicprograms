package com.bridgelabz.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.serviceimplementation.DoctorServiceImplementationClass;
import com.bridgelabz.serviceimplementation.ManagerServiceImplementationClass;
import com.bridgelabz.serviceimplementation.PatientServiceImplementationClass;
import com.bridgelabz.utility.ClinicalUtility;

public class ClinicManager {
	static ManagerServiceImplementationClass manager = new ManagerServiceImplementationClass();
	static DoctorServiceImplementationClass doctorService = new DoctorServiceImplementationClass();
	static PatientServiceImplementationClass patientService = new PatientServiceImplementationClass();

	public static void main(String[] args) throws Exception {
		while (true) {

			System.out.println("enter your choice\n" + "1.For doctor details modifications\n"
					+ "2.For patient details modifications\n" + "3.Doctor details implementations\n"
					+ "4.Patient details implementations\n" + "5.Appointment details\n");
			int choice = ClinicalUtility.userInteger();
			switch (choice) {
			case 1:
				doctorDetailsOperationsLevels();
				break;
			case 2:
				patientDetailsOperationLevels();
				break;
			case 3:
				doctorDetailsModifications();
				break;
			case 4:
				patientDetailsModifications();
				break;
			case 5:
				manager.addAppointment();
				break;
			default:
				System.out.println("invalid choice");
				break;

			}

		}
	}

	public static void doctorDetailsOperationsLevels() throws Exception {
		while (true) {
			System.out.println("enter the choice\n" + "1.For Add\n" + "2.For Delete\n" + "3.For Update Details\n");
			int choice = ClinicalUtility.userInteger();
			switch (choice) {
			case 1:
				manager.addDoctor();
				break;
			case 2:
				manager.deleteDoctor();
				break;
			case 3:
				manager.updateDoctorDetails();
				break;
			default:
				System.out.println("invalid choice");
				break;

			}

		}
	}

	public static void patientDetailsOperationLevels() throws Exception {
		while (true) {
			System.out.println("enter the choice\n" + "1.For Add\n" + "2.For Delete\n" + "3.For Update Details\n");
			int choice = ClinicalUtility.userInteger();
			switch (choice) {
			case 1:
				manager.addPatient();
				break;
			case 2:
				manager.deletePatient();
				break;
			case 3:
				manager.updatePatientDetails();
				break;
			default:
				System.out.println("invalid choice");
				break;

			}

		}
	}

	public static void doctorDetailsModifications() throws JsonParseException, JsonMappingException, IOException {
		while (true) {
			System.out.println("enter the choice\n" + "1.For Display details\n" + "2.For Search by Id\n"
					+ "3.For Search by Name\n" + "4.For Search by Specialization\n" + "5.For Search by Availability\n");
			int choice = ClinicalUtility.userInteger();
			switch (choice) {
			case 1:
				doctorService.showDoctorDetails();
				break;
			case 2:
				doctorService.searchDoctorById();
				break;
			case 3:
				doctorService.searchDoctorByName();
				break;
			case 4:
				doctorService.searchDoctorBySpecialization();
				break;
			case 5:
				doctorService.searchDoctorByAvailability();
				break;
			default:
				System.out.println("invalid choice");
				break;

			}
		}
	}

	public static void patientDetailsModifications() throws JsonParseException, JsonMappingException, IOException {
		while (true) {
			System.out.println("enter the choice\n" + "1.For Display details\n" + "2.For Search by Id\n"
					+ "3.For Search by Name\n" + "4.For Search by Mobile Number\n");
			int choice = ClinicalUtility.userInteger();
			switch (choice) {
			case 1:
				patientService.showPatientDetails();
				break;
			case 2:
				patientService.searchPatientById();
				break;
			case 3:
				patientService.searchPatientByName();
				break;
			case 4:
				patientService.searchPatientByNumber();
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}
}
