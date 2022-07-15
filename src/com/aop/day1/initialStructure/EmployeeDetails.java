package com.aop.day1.initialStructure;

import com.aop.UtilityClass;

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
