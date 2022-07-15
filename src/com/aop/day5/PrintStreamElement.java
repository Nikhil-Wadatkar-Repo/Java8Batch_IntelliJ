package com.aop.day5;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintStreamElement {

	public static void main(String[] args) {

//		filter -> predicate as argument
//		map -> function as argument
//		skip(number) -> it will skip all element after the specified number as argument
//		limit(number) -> it will continue to print all element after the specified number as argument

		// task : make each element of list as upper case
		String[] cities = new String[] { "Pune", "Banglore", "Hyderabad", "Lahore" };

		// task : to make each element of stream in upper case and collect to new list
		// ,print it
		List<String> newList = Stream.of(cities).map(cityName -> cityName.toUpperCase()).collect(Collectors.toList());
		System.out.println(newList);

		// task 2 : to print each element in upper case without collection it in new
		// list
		Stream.of(cities).map(cityName -> cityName.toUpperCase()).forEach((cityName) -> System.out.println(cityName));
		Stream.of(cities).map(cityName -> cityName.toUpperCase()).forEach(System.out::print);
	}
}
