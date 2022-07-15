package com.aop.day3;

import java.util.function.Function;

public class EmployeeDetails {

	public String getNameInUpperLetters(String name) {
		return name.toUpperCase();
	}

	public static String getLengthWithName(String name) {
		return name + " : " + name.length();
	}

	public static void main(String[] args) {
		//lambda expression
		Function<String, String> f1= (nameOfEmployee)-> {
			return nameOfEmployee.toUpperCase();
		};
		System.out.println("Using LE:");
		System.out.println(f1.apply("aditya deotale"));
		//method reference
		System.out.println("Using Method Reference:");
		EmployeeDetails obj=new EmployeeDetails();
		Function<String, String> f1_MR = obj::getNameInUpperLetters;
		System.out.println(f1_MR.apply("aditya deotale"));
		
		
		//MR to static method
		Function<String, String> f1_MR_static = EmployeeDetails::getLengthWithName;
		System.out.println(f1_MR_static.apply("aditya deotale"));
		
		
	}

}
