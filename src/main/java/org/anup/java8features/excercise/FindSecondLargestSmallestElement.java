package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.Comparator;

// find the second largest and smallest element in an array.
public class FindSecondLargestSmallestElement {

    public static void main(String[] args) {

        Integer[] nums = {1, 3, -1, 6, 4, 0,90, 100};

        Integer secondSmallest = Arrays.stream(nums)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        Integer secondLargest = Arrays.stream(nums)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);

    }
}
