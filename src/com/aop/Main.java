package com.aop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> empty = Arrays.asList();

        //accumulator
        System.out.println(nums.stream().reduce((x, y) -> x + y).get());
        //identity and accumulator
        System.out.println(nums.stream().reduce(10, (x, y) -> x + y));
        //identity, accumulator and combiner
//        System.out.println(nums.stream().reduce(10,(x, y) -> x + y),(p,q)->p+q);
        System.out.println("Maximum element: " + nums.stream().max((a, b) -> a.compareTo(b)).get());
        System.out.println("Maximum element: " + nums.stream().max(Comparator.comparing(Integer::intValue)).get());
        System.out.println("Minimum element: " + nums.stream().min((a, b) -> a.compareTo(b)).get());

        int firstElement = nums.stream().findFirst().get();
        System.out.println(firstElement);

        int firstAny = nums.stream().findAny().get();
        System.out.println("FindAny: " + firstAny);

        List<Employee> employees=Employee.getEmployees();
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)));;



    }
}