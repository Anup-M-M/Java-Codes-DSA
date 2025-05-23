package main.java.org.anup.interviews;

import java.util.ArrayList;
import java.util.List;

public class Test123 {
    public static void main(String[] args) {
        List<Integer> listOfInteger  = new ArrayList<>();
        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(3);

        listOfInteger.add(1, 100);
        System.out.println(listOfInteger); //[1, 100, 2, 3]

        listOfInteger.set(0, 1000000);
        System.out.println(listOfInteger); //[1000000, 100, 2, 3]


        List<String> listOfString = new ArrayList<>();
        listOfString.add("A");
        listOfString.add("B");
        listOfString.add("C");

        listOfString.add(1, "Z");
        System.out.println(listOfString); //[A, Z, B, C]

        listOfString.set(0, "a");
        System.out.println(listOfString); //[a, Z, B, C]
    }
}
