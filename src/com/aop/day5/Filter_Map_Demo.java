package com.aop.day5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// task 1 : to print only even numbers
//task 2 : to make square of each element and print it
public class Filter_Map_Demo {
	public static void main(String[] args) {

//		filter -> predicate as argument
//		map -> function as argument

		// task : make each element of list as upper case
		String[] cities = new String[] { "Pune", "Banglore", "Hyderabad", "Lahore" };
		Stream<String> stream = Stream.of(cities);

		Function<String, String> toupperCaseFunction = (String city) -> city.toUpperCase();

		// Stream<String> upperCaseStream = stream.map(toupperCaseFunction);
		Stream<String> upperCaseStream = stream.map((String city) -> city.toUpperCase());
		List<String> upperCaseString = upperCaseStream.collect(Collectors.toList());
		System.out.println(upperCaseString);

		// reduced code
		List<String> newList = Stream.of(cities).map((cityName) -> cityName.toUpperCase()).collect(Collectors.toList());
		System.out.println(newList);

		// How to print each element of stream
		System.out.println("====ForEach====");
		// lambda expression
		// Consumer<String> consumerLE=(String
		// cityname)->{System.out.println(cityname);};
		// Method reference
		Consumer<String> consumerLE = System.out::println;
		consumerLE.accept("tukaram");

//		Stream.of(cities).map((cityName) -> cityName.toUpperCase()).forEach(consumerLE);
		Stream.of(cities).map((cityName) -> cityName.toUpperCase()).forEach(System.out::println);
	}

}
