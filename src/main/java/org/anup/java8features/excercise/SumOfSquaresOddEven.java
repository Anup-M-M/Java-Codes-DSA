package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;

// sum of squares of all odd and even numbers in a list.
public class SumOfSquaresOddEven {

    public static void main(String[] args) {

        List< Integer > nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumSquaresOdd = nums.stream()
                .filter(n -> n%2==1)
                .mapToInt(n -> n*n)
                .sum();

        int sumSquaresEven = nums.stream()
                .filter(n -> n%2==0)
                .mapToInt(n -> n*n)
                .sum();

        System.out.println("\nSum of squares of odd numbers: " + sumSquaresOdd);
        System.out.println("\nSum of squares of even numbers: " + sumSquaresEven);
    }
}
