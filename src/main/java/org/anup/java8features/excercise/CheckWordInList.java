package main.java.org.anup.java8features.excercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// check if a list of strings contains a specific word.
public class CheckWordInList {
    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        String searchColor = "Orange";

        Predicate<String> checkWordInList = color -> color.equals(searchColor);

        boolean ischeckWordInList = colors.stream().anyMatch(checkWordInList);

        if(ischeckWordInList)
            System.out.println(searchColor + " present in the list");
        else
            System.out.println(searchColor + " not present in the list");

    }
}
