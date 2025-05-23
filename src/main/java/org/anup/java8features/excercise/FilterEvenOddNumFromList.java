package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
public class FilterEvenOddNumFromList {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3,9,5,2,4,9,10);

        List<Integer> evenList = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        Set<Integer> oddList = nums.stream().filter(num -> num % 2 != 0).collect(Collectors.toSet());
        System.out.println(oddList);


    }
}
