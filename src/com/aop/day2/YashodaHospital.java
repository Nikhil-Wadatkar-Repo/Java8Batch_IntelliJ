package com.aop.day2;

public class YashodaHospital implements HospitalDetails {

	@Override
	public String getHospitalDetails() {
		// TODO Auto-generated method stub
		return "Yashoda Hyderabad";
	}

	// overriding default mathod becoz of new requirement
	public String getPatientType() {
		// logic
//		return "Yashoda Patient";
		return HospitalDetails.super.getPatientType();
	}

	public static void main(String[] args) {
		String type = new YashodaHospital().callDefaultMEthod();
		System.out.println("Yashoda Hospital");
		System.out.println("Patient type is :" + type);
		System.out.println("calling static method");
		System.out.println("Available cylinders: " + HospitalDetails.noOfCylindersAvailable(50));

	}

	public String callDefaultMEthod() {
		String type = HospitalDetails.super.getPatientType();
		return type;
	}
}
