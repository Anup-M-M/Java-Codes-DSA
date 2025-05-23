package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;

// multiply and sum all elements in a list of integers
public class FindSumAndMultiplyOfList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);

        int sum = nums.stream()
                        .reduce(0, Integer::sum);

        System.out.println("Sum of the list elements: " + sum);

        int result = nums.stream()
                            .reduce(1, ( x , y ) -> x * y);

        System.out.println("multiply of the list elements: " + result);
    }
}
