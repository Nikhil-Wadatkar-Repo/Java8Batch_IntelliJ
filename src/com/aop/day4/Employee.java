package com.aop.day4;

import java.util.function.Function;

public class Employee {
	String name;

	public Employee() {

	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		Function<String, Employee> f1 = Employee::new;
		Employee apply = f1.apply("tukaram");
//		System.out.println(apply.id + "  " + apply.name + " " + apply.city);
	}

}
