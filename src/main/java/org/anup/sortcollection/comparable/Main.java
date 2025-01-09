package main.java.org.anup.sortcollection.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("anup", "rash", "kusu");
        // sort names in natural ordering
        Collections.sort(names);
        System.out.println("Prints names in natural ordering");
        for(String l : names)
            System.out.println(l);

        List<Integer> numbers = Arrays.asList(1,10,5,3);
        // sort numbers in natural ordering
        Collections.sort(numbers);
        System.out.println("Prints numbers in natural ordering");
        for(Integer num : numbers)
            System.out.println(num);
    }
}
