package com.aop;

import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
//		MR <-> LE
		EmployeeDetails yashodaAddr= ()-> "Yashoda Hyderabad";
		System.out.println(yashodaAddr.getHospitalAddress());
//		MR to static method
		EmployeeDetails yashodaAddrMR= EmployeeHospitalAddressMR::getYashodaHospitalAddress;
		System.out.println(yashodaAddrMR.getHospitalAddress());
		
		EmployeeDetails apolloAddr= ()-> "Apollo Hyderabad";
		System.out.println(apolloAddr.getHospitalAddress());
//		MR to instance method
		EmployeeDetails apolloAddrMR= new EmployeeHospitalAddressMR()::getApolloHospitalAddress;
		System.out.println(apolloAddrMR.getHospitalAddress());
		
		EmployeeDetails sanchetiAddr= ()-> "Sancheti Hyderabad";
		System.out.println(sanchetiAddr.getHospitalAddress());
//		MR to instance method
//		EmployeeDetails sanchetiAddrMR= EmployeeHospitalAddressMR::getSanchetiHospitalAddress;
//		System.out.println(sanchetiAddrMR.getHospitalAddress());
		
		Comparator<String>stringIgnoreCase = String::compareToIgnoreCase;
		
	}
}
