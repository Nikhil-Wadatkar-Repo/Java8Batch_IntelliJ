package com.aop.day2;

public class Test {

	public static void main(String[] args) {
		YashodaHospital yh = new YashodaHospital();
		ApolloHospital ah = new ApolloHospital();
		SanchetiHospital sh = new SanchetiHospital();

		System.out.println(yh.getHospitalDetails());
		System.out.println(ah.getHospitalDetails());
		System.out.println(sh.getHospitalDetails());

		System.out.println("calling default method");
		System.out.println(yh.callDefaultMEthod());
		

	}
	
	private void call() {
		YashodaHospital yh = new YashodaHospital();
		System.out.println(yh.getPatientType());
	}


}
