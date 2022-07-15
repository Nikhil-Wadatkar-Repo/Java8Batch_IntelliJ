package com.aop.day2;

public class ApolloHospital implements HospitalDetails {

	@Override
	public String getHospitalDetails() {
		// TODO Auto-generated method stub
		return "Apollo Hyderabad";
	}
	
	
	// overriding default mathod becoz of new requirement
		public String getPatientType() {
			// logic
			return "Apollo Patient";
		}
	
	public static void main(String[] args) {
		String type = new ApolloHospital().callDefaultMEthod();
		System.out.println("Apollo Hospital");
		System.out.println("Patient type is :" + type);
		System.out.println("calling static method");
		System.out.println("Available cylinders: " + HospitalDetails.noOfCylindersAvailable(50));


	}

	private String callDefaultMEthod() {
		String type = HospitalDetails.super.getPatientType();
		return type;
	}

}
