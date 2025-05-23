package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Java program to implement a lambda expression to sort a list of strings in alphabetical order
public class SortList {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("red", "Green", "Blue", "black", "ink");

        // Sort using lambda expression - Case sensitive
        names.sort((str1, str2) -> str1.compareTo(str2));
        System.out.println("Sorted list (Case Sensitive): " + names);

        // Sort using lambda expression - Case insensitive
        names.sort((str1, str2) -> str1.toLowerCase().compareTo(str2.toLowerCase()));
        System.out.println("Sorted list (Case Insensitive): " + names);

        // Alternative way using method reference
        names.sort(String::compareToIgnoreCase);
        System.out.println("Sorted list (Using method reference): " + names);

        // Using stream with sorted() method
        List<String> streamSorted = names.stream()
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println("Sorted list (Using stream): " + streamSorted);
    }
}
