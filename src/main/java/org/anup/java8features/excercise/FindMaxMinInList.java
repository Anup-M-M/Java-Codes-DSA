package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

//find the maximum and minimum values in a list of integers.
public class FindMaxMinInList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(12, 1, 5, -1, 0, 8, 7, 9, -6);

        Optional<Integer> max = nums.stream().max(Integer::compareTo); // (x,y) -> x.compareTo(y)
        //int max = nums.stream().mapToInt(Integer::intValue).max().orElse(0);

        // .get() : If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
        int min = nums.stream().min(Integer::compareTo).get(); //(x,y) -> x.compareTo(y)
        //int min = nums.stream().mapToInt(Integer::intValue).min().orElse(0);

        System.out.println(max + " : "+ min);

    }
}
