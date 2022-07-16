package com.aop;

import java.util.*;
import java.util.stream.Collectors;

public class SortingDemoSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();
        set.add(12);
        set.add(12);
        set.add(69);
        set.add(5);
        set.add(98);
        System.out.println(set);

        List<String> name = Arrays.asList("ankur", "neelima", "nikhil", "mahesh", "rohini");
//        name.stream().sorted((name1,name2)-> -name1.compareTo(name2)).collect(Collectors.toList()).forEach(System.out::println);
//        name.stream().sorted(Comparator.comparing(String::toString)).collect(Collectors.toList()).forEach(System.out::println);
//        name.stream().sorted(Comparator.comparing(str->str)).collect(Collectors.toList()).forEach(System.out::println);
    }
}

class CompDemp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}


