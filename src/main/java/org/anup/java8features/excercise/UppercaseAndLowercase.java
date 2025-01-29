package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
public class UppercaseAndLowercase {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anup", "Rashmi", "Arun");

        List<String> lowerCaseStringList = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());

        List<String> upperCaseStringList = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println(lowerCaseStringList + " "+ upperCaseStringList);



    }

}
