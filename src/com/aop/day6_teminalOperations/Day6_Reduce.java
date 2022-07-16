package com.aop.day6_teminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Day6_Reduce {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Pune", "Banglore", "Hyderabad", "Lahore");
        List<Integer> numbers = Arrays.asList(6, 3, 5, 9, 8, 7, 4, 5, 5, 6, 2, 2, 1);
        //REDUCE
//        reduce(accumulator);
//        Optional<Integer> optional=numbers.stream().reduce((x, y)-> x+y);
        Optional<Integer> optional1 = numbers.stream().reduce(Integer::sum);
//        System.out.println(optional1.get());

        //reduce(identity,accumulator); identity=initial values
        int optional_identity = numbers.stream().reduce(50, (x, y) -> x + y);
//        Optional<Integer> optional1=numbers.stream().reduce(Integer::sum);
//        System.out.println(optional_identity);

//        String endOutput=cities.stream().reduce((str1,str2)-> str1.concat(str2)).get();
        String endOutput = cities.stream().reduce((str1, str2) -> str1 + " , " + str2).get();
        System.out.println("Cities are :" + endOutput);

        // sum => distinct=> even

        //filter
        //reduce
        int resultOfUniqueEvenNumbers = numbers.stream().distinct().filter(num -> num % 2 == 0).reduce(Integer::sum).get();
        System.out.println("Sum of all even distrinct number is " + resultOfUniqueEvenNumbers);
    }
}
