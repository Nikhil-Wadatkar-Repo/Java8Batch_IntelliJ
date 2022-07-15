package com.aop.day3;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

		String name = "Pavan";
		String surname = "Aditya";

		BiFunction<String, String, String> biFunction = (empName, empSurname) -> {

			return "Mr. " + empName + " " + empSurname;
		};
		String fullname = biFunction.apply(name, surname);
		System.out.println(fullname);

	}

}

//Predicate=>  
//Function =>
//BiPredicate =>
//BiFunction=>