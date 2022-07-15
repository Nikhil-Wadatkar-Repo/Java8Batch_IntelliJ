package com.aop.day2;

public class SanchetiHospital implements HospitalDetails {

	@Override
	public String getHospitalDetails() {
		// TODO Auto-generated method stub
		return "Sancheti Pune";
	}

	// overriding default mathod becoz of new requirement
	public String getPatientType() {
		// logic
		return "Sancheti Patient";
	}

	public static void main(String[] args) {
		String type = new SanchetiHospital().callDefaultMEthod();
		System.out.println("Sancheti Hospital:  calling from interface");
		System.out.println("Patient type is :" + type);

		SanchetiHospital obj = new SanchetiHospital();
		System.out.println("Sancheti Hospital:  calling from same class");
		System.out.println("Patient type is :" + obj.getPatientType());

		System.out.println("calling static method");
		System.out.println("Available cylinders: " + HospitalDetails.noOfCylindersAvailable(50));

	}

	private String callDefaultMEthod() {
		String type = HospitalDetails.super.getPatientType();
		return type;
	}
}
