package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// Calculate average of doubles using Lambda expression in Java
public class AverageOfList {

    public static void main(String[] args) {

        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);

        double average = nums.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of the values: " + average);

    }
}
