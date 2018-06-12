package com.bridgelabz.model;

public class Appointment {
private String doctorName;
private String doctorId;
private String patientId;
private String patientName;
private String timeStamp;
public String getDoctorName() {
	return doctorName;
}
public String setDoctorName(String doctorName) {
	return this.doctorName = doctorName;
}
public String getDoctorId() {
	return doctorId;
}
public void setDoctorId(String doctorId) {
	this.doctorId = doctorId;
}
public String getPatientId() {
	return patientId;
}
public String setPatientId(String patientId) {
	return this.patientId = patientId;
}
public String getPatientName() {
	return patientName;
}
public String setPatientName(String patientName) {
	return this.patientName = patientName;
}
public String getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(String timeStamp) {
	this.timeStamp = timeStamp;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
