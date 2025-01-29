package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using map to transform String to its length
        List<Integer> collect = names.stream()
                .map(String::length) // Transform to lengths (Integer)
                .collect(Collectors.toList());

        System.out.println(collect);

        // Using mapToInt to transform String to its length
        int sumOfLengths = names.stream()
                .mapToInt(String::length) // Transform to primitive int
                .sum(); // IntStream operation

        System.out.println(sumOfLengths);
    }
}
