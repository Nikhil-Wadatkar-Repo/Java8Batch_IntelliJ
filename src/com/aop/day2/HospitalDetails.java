package com.aop.day2;

public interface HospitalDetails {
	// abstract method
	String getHospitalDetails();

	// default method
	default String getPatientType() {
		// logic
		return "General Patient";
	}

	// static = utility method
	static int noOfCylindersAvailable(int noOfCylUsed) {

		return 100 - noOfCylUsed;
	}
}
