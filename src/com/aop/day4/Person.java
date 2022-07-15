package com.aop.day4;

import java.util.function.BiFunction;

public class Person {
	public String name;

	public Person() {
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getNameWithLength(String name) {
		return name + " " + name.length();
	}

	// instance method
	public String getPersonName() {
		return this.name;
	}

	public static void main(String[] args) {
		PersonDetails obj1 = (person, name) -> person.getNameWithLength(name);
		System.out.println(obj1.getName(new Person(), "ANkur"));

		PersonDetails obj2 = Person::getNameWithLength;
		System.out.println(obj1.getName(new Person(), "Dhanashri"));

		BiFunction<Person, String, String> biFunction = Person::getNameWithLength;

	}

	@Override
	public String toString() {
		return name + " ";
	}

}
