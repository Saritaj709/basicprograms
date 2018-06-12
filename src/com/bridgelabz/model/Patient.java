package com.bridgelabz.model;

public class Patient {
private String patientName;
private String patientMobileNumber;
private String patientId;
private int patientAge;
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getPatientMobileNumber() {
	return patientMobileNumber;
}
public void setPatientMobileNumber(String patientMobileNumber) {
	this.patientMobileNumber = patientMobileNumber;
}
public String getPatientId() {
	return patientId;
}
public void setPatientId(String patientId) {
	this.patientId = patientId;
}
public int getPatientAge() {
	return patientAge;
}
public void setPatientAge(int patientAge) {
	this.patientAge = patientAge;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
