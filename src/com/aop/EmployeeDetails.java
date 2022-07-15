package com.aop;
@FunctionalInterface
public interface EmployeeDetails {
	String getHospitalAddress();

	default String getPatientType() {
		return "General Patient";
	}

	static int getNoOfCylinder(int noOfCylinderUsed) {
		return UtilityClass.noOfCylinder - noOfCylinderUsed;
	}
}
