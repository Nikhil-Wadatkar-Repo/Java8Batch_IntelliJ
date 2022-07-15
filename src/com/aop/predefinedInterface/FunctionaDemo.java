package com.aop.predefinedInterface;

import java.util.function.Function;

public class FunctionaDemo implements Function<String, String> {

	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return t.toUpperCase();
	}

	public static void main(String[] args) {
		String name = "viki";
		String nameInUpperCase = new FunctionaDemo().apply(name);
		System.out.println("===way 1 ===");
		System.out.println(nameInUpperCase);
	
		//way 2
		Function<String, String> obj1=new Function<String, String>() {
		
			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return t.toUpperCase();
			}
		};
		System.out.println("===way 2===");
		System.out.println(obj1.apply(name));
		
		System.out.println("===way 3===");
		Function<String, String> obj3=(String name1)->{
			return name1.toUpperCase();
		};
		
		System.out.println(obj3.apply(name));
		
		
		
	
	
	}

}
