package com.aop;

public class ApolloHospital implements EmployeeDetails {
	@Override
	public String getPatientType() {
		// TODO Auto-generated method stub
		return "Apollo Patient";
	}

	public static void main(String[] args) {
		System.out.println(EmployeeDetails.getNoOfCylinder(02));
	}
	
	@Override
	public String getHospitalAddress() {
		// TODO Auto-generated method stub
		return "Apollo Hyderabad";
	}
}
