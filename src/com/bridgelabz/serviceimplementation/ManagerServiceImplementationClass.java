package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.ClinicalUtility;

public class ManagerServiceImplementationClass implements ManagerService {
	private List<Doctor> doctorList = new LinkedList<>();
	private List<Patient> patientList = new LinkedList<>();
	private List<Appointment> appointmentList = new LinkedList<>();
	File fileDoctor = new File(
			"/home/bridgelabz/JSarita/ClinicalManagementSystem/src/com/bridgelabz/files/Doctor.json");
	File filePatient = new File(
			"/home/bridgelabz/JSarita/ClinicalManagementSystem/src/com/bridgelabz/files/patient.json");
	File fileAppointment = new File(
			"/home/bridgelabz/JSarita/ClinicalManagementSystem/src/com/bridgelabz/files/Appointment.json");
	String choice;
	DoctorServiceImplementationClass doctor = new DoctorServiceImplementationClass();
	PatientServiceImplementationClass patient = new PatientServiceImplementationClass();

	public ManagerServiceImplementationClass() {
		try {
			doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
			patientList = ClinicalUtility.jsonParser(filePatient, Patient.class);
			appointmentList = ClinicalUtility.jsonParser(fileAppointment, Appointment.class);
		} catch (Exception e) {
			doctorList = new LinkedList<>();
			patientList = new LinkedList<>();
			appointmentList = new LinkedList<>();
		}
	}

	@Override
	public void addDoctor() throws Exception {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		System.out.println("enter the name of doctor");
		doctor.setDoctorName(ClinicalUtility.userNext());
		System.out.println("enter the id of the doctor");
		doctor.setDoctorId(ClinicalUtility.userNext());
		System.out.println("enter the Specialization of doctor");
		doctor.setDoctorSpecialization(ClinicalUtility.userNext());
		System.out.println("enter the Availability of doctor");
		doctor.setDoctorAvailability(ClinicalUtility.userNext());
		System.out.println("enter the patient count of doctor");
		doctor.setPatientCountForDoctor(ClinicalUtility.userInteger());
		doctorList.add(doctor);
		save();
	}

	@Override
	public void deleteDoctor() throws Exception {
		// TODO Auto-generated method stub
		doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
		Doctor doctor = new Doctor();
		System.out.println("enter the id of the doctor you want to remove");
		String id = ClinicalUtility.userNext();
		for (int index = 0; index < doctorList.size(); index++) {
			if (doctorList.get(index).getDoctorId().equals(id))
				doctorList.remove(index);
			save();
			// break;
			 return;
		}
	}

	@Override
	public void updateDoctorDetails() throws Exception {
		// TODO Auto-generated method stub
		doctorList = ClinicalUtility.jsonParser(fileDoctor, Doctor.class);
		System.out.println("enter the id of the doctor whose details are to be updated");
		String id = ClinicalUtility.userNext();
		Doctor doctor = new Doctor();
		for (int index = 0; index < doctorList.size(); index++) {
			if (doctorList.get(index).getDoctorId().equals(id)) {
				doctor.setDoctorName(doctorList.get(index).getDoctorName());
				doctor.setDoctorId(doctorList.get(index).getDoctorId());
				doctor.setDoctorSpecialization(doctorList.get(index).getDoctorSpecialization());
				System.out.println("enter the details you want to update for doctor,enter,availability,patient count");
				doctor.setDoctorAvailability(ClinicalUtility.userNext());
				doctor.setPatientCountForDoctor(ClinicalUtility.userInteger());
				doctorList.add(doctor);
				save();
				doctorList.remove(index);
				save();
			}
		}
	}

	@Override
	public void addPatient() throws Exception {
		// TODO Auto-generated method stub
		Patient patient = new Patient();
		System.out.println("enter the name of patient");
		patient.setPatientName(ClinicalUtility.userNext());
		System.out.println("enter the id of the patient");
		patient.setPatientId(ClinicalUtility.userNext());
		System.out.println("enter the mobile number of patient");
		patient.setPatientMobileNumber(ClinicalUtility.userNext());
		System.out.println("enter the age of patient");
		patient.setPatientAge(ClinicalUtility.userInteger());
		patientList.add(patient);
		save();
	}

	@Override
	public void deletePatient() throws Exception {
		// TODO Auto-generated method stub
		patientList = ClinicalUtility.jsonParser(filePatient, Patient.class);
		System.out.println("enter the id of the patient to be deleted");
		String id = ClinicalUtility.userNext();
		for (int index = 0; index < patientList.size(); index++) {
			if (patientList.get(index).getPatientId().equals(id)) {
				patientList.remove(index);
				save();
				return;
			}
		}
	}

	@Override
	public void updatePatientDetails() throws Exception {
		// TODO Auto-generated method stub
		patientList = ClinicalUtility.jsonParser(filePatient, Patient.class);
		System.out.println("enter the id of the patient to be deleted");
		String id = ClinicalUtility.userNext();
		Patient patient = new Patient();
		for (int index = 0; index < patientList.size(); index++) {
			if (patientList.get(index).getPatientId().equals(id)) {
				patient.setPatientName(patientList.get(index).getPatientName());
				patient.setPatientId(patientList.get(index).getPatientId());
				patient.setPatientAge(patientList.get(index).getPatientAge());
				System.out.println("enter new mobile number");
				patient.setPatientMobileNumber(ClinicalUtility.userNext());
				patientList.add(patient);
				save();
				patientList.remove(patient);
				save();
			}
		}
	}

	public void addAppointment() throws Exception {
		Appointment appointment = new Appointment();
		System.out.println("select the doctor details from given list of doctors");
		doctor.showDoctorDetails();
		System.out.println("enter the Doctor name to book an appointment");
		String doctorName = appointment.setDoctorName(ClinicalUtility.userNext());
		System.out.println("enter the doctor id");
		appointment.setDoctorId(ClinicalUtility.userNext());
		System.out.println("enter the patient details from given list of patient");
		patient.showPatientDetails();
		System.out.println("enter the patient name");
		String patientName = appointment.setPatientName(ClinicalUtility.userNext());
		System.out.println("enter the id of patient");
		String id = appointment.setPatientId(ClinicalUtility.userNext());

		for (int i = 0; i < patientList.size(); i++) {
			if ((patientList.get(i).getPatientName().equals(patientName))
					&& (patientList.get(i).getPatientId().equals(id))) {
				System.out.println("Appointment given");
				patientList.remove(i);
				save();
			} else {
				System.out.println("The patient with given details is not avilable");
			}
		}
		for (int j = 0; j < doctorList.size(); j++) {
			if ((doctorList.get(j).getDoctorName().equals(doctorName))
					&& (checkDoctorAvailability(doctorList.get(j)) == true)) {
				System.out.println("Doctor is available for appointment");
				doctorList.remove(j);
				save();
			} else {
				System.out.println("Doctor is not available");
			}
		}
		// System.out.println("enter the time");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		appointment.setTimeStamp(dtf.format(now));
		appointmentList.add(appointment);
		save();
	}

	public boolean checkDoctorAvailability(Doctor doctor) {
		if (doctor.getPatientCountForDoctor() < 5)
			return true;
		else
			return false;
	}

	public void save() throws Exception {
		System.out.println(
				"Do you want to save:enter doctor/patient/app to save for doctor/patient,anything else for not saving");
		choice = ClinicalUtility.userNext();
		if (choice.equals("doctor")) {
			ClinicalUtility.saveJsonDoctor(fileDoctor, doctorList);
			System.out.println("Doctor list updated");
		} else if (choice.equals("patient")) {
			ClinicalUtility.saveJsonPatient(filePatient, patientList);
			System.out.println("Patient list updated");
		} else if (choice.equals("app")) {
			ClinicalUtility.saveJsonAppointment(fileAppointment, appointmentList);
			System.out.println("Appointment list updated");
		} else {
			System.out.println("details not updated");
		}
	}
}
