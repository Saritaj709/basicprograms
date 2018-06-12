package com.bridgelabz.model;

public class Doctor {
private String doctorName;
private String doctorId;
private String doctorSpecialization;
private String doctorAvailability;
private int patientCountForDoctor;

public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getDoctorId() {
	return doctorId;
}
public void setDoctorId(String doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorSpecialization() {
	return doctorSpecialization;
}
public void setDoctorSpecialization(String doctorSpecialization) {
	this.doctorSpecialization = doctorSpecialization;
}
public String getDoctorAvailability() {
	return doctorAvailability;
}
public void setDoctorAvailability(String doctorAvailability) {
	this.doctorAvailability = doctorAvailability;
}
public int getPatientCountForDoctor() {
	return patientCountForDoctor;
}
public void setPatientCountForDoctor(int patientCountForDoctor) {
	this.patientCountForDoctor = patientCountForDoctor;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
