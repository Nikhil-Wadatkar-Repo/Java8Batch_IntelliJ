package com.aop.day3;

public class PersonDetails {

	// instance/non-static
	public String getNameInBlockLetters(String name) {
		return name.toUpperCase();
	}

	public static int getLengthOfString(String name) {
		return name.length();
	}
}
