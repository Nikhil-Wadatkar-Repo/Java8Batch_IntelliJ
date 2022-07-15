package com.aop.day3;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		String name1 = "Mandavi";
		String name2 = "mandavi";

		BiPredicate<String, String> biPredicate = (pastName, currentName) -> {

			if (pastName.equalsIgnoreCase(currentName))
				return true;
			else
				return false;
		};

		boolean flag = biPredicate.test(name1, name2);

		if (flag == true)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}

}
