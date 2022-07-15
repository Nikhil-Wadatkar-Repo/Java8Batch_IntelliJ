package com.aop.day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Skip_Limit_Demo {
//	skip(number) -> it will continue to print all element after the specified number as argument,
//	limit(number) -> it will skip all element after the specified number as argument
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 4, 5, 6, 9, 8, 8, 1, 2, 2, 3, 7, 6);
		// skip
//		numbers.stream().skip(4).forEach(System.out::println);
		// limit
//		numbers.stream().limit(4).forEach(System.out::println);
		// distinct
//		 numbers.stream().distinct().forEach(num-> System.out.print(num+" "));
		// sorted => natural order
		numbers.stream().distinct().sorted().forEach(num -> System.out.print(num + " "));
		// reversely sorting
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(num + " "));

	}

}
