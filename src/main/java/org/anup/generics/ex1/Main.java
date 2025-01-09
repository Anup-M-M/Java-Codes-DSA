package main.java.org.anup.generics.ex1;

import java.util.ArrayList;

public class Main {
//    public static void main(String[] args) {
//        // without generics
//        ArrayList list = new ArrayList();
//        list.add("Hello");
//        list.add(123);
//        list.add(3.14);
//
//        // need to do Type Casting and no Type safety
//        String str = (String) list.get(0);
//        // No Compile Time checking gives run time ClassCastException error
//        String str1 = (String) list.get(1);
//
//    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // provides type safety and compile time checking
        list.add("Hello");
        list.add("World");

        // no Type Casting.
        String s = list.get(0);
        String s1 = list.get(1);

    }
}
