package com.aop.day4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

	public static void main(String[] args) {
		
	Person obj = new Person("Rohini");
	
	
	Function<Person, String> personFunction = (person) -> person.name + " " + person.name.length();
//	String nameWithLength=personFunction.apply(obj);
//	System.out.println(nameWithLength);
	
	Function<String, String> instance_MR= obj::getNameWithLength;
	String nameWithLength=instance_MR.apply(obj.name);
	System.out.println(nameWithLength);
	
	

//	ref to instance method of arbitrary(any) object of any particular type
//	ref to instance method of Person : containingObjectType::instanceMethodName;

		List<Person> employees = Arrays.asList(
				new Person("Rohini"), 
				new Person("nana"), 
				new Person("ankur"));
		employees.forEach(Person::getPersonName);

		employees.forEach(System.out::println);
//		System.out.println(employees);

	}

}
