package main.java.org.anup.java8features.excercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find the unique and duplicate elements in a list
public class FindUniqueDuplicateInList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        Set<Integer> set = new HashSet<>();
        //  set.add(num) : If set already contains the element return false otherwise Adds the specified element to this set returb true.
        List<Integer> uniqueElements = list.stream()
                                            .filter(num -> set.add(num))
                                            .collect(Collectors.toList());
        System.out.println(uniqueElements);

        Set<Integer> set1 = new HashSet<>();
        List<Integer> duplicateElementsV1 = list.stream()
                                                .filter(num -> !(set1.add(num)))
                                                .collect(Collectors.toList());
        System.out.println(duplicateElementsV1);


        //Collections.frequency(list, n) : Returns the number of elements in the specified collection equal to the specified object
        Set<Integer> duplicateElementsV2 = list.stream()
                                                .filter(n -> Collections.frequency(list, n) > 1)
                                                .collect(Collectors.toSet());
        System.out.println(duplicateElementsV2);

        List<Integer> unique_nums = new ArrayList<>();
        list.stream()
                .distinct() // Returns a stream consisting of the distinct elements
                .forEach(unique_nums::add); // n -> unique_nums.add(n)

        System.out.println("List elements without duplicates: " + unique_nums);

    }
}
