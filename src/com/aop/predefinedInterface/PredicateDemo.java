package com.aop.predefinedInterface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// way 1
		PredicateImpl obj1 = new PredicateImpl();

		// way 2 : annonymous inner class
		Predicate<String> obj2 = new Predicate<String>() {
			@Override
			public boolean test(String name) {
				if (name.length() > 5)
					return true;
				else
					return false;
			}
		};

		// way 3 : lambda expression
		Predicate<String> obj3 = (name) -> {
			if (name.length() >10)
				return true;
			else
				return false;
		};
		
		

		boolean flag = obj3.test("rohini");

		if (flag == true)
			System.out.println("Yes");
		else
			System.out.println("no");

	}

}
