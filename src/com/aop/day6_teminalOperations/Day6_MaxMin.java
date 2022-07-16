package com.aop.day6_teminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// max and min element
public class Day6_MaxMin {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Pune", "Banglore", "Hyderabad", "Lahore");
        List<Integer> numbers = Arrays.asList(6, 3, 5, 9, 8, 7, 4, 5, 5, 6, 2, 2, 1);

//        max(FI)
//        min(FI)
        //using lambda expression
        int maxValue = numbers.stream().max((ele1, ele2) -> ele1.compareTo(ele2)).get();
        //using Comparator.comparing => num->num
        int maxValue1=numbers.stream().max(Comparator.comparing(num->num)).get();
        //using Comparator.comparing using MR => Integer::intValue
        int maxValue2=numbers.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println();
        System.out.println("no of element:"+numbers.stream().count());
        //findFirst
        System.out.println("First Element:"+numbers.stream().findFirst().get());

    }
}
