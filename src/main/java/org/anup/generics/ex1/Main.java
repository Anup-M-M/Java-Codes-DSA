package main.java.org.anup.generics.ex1;

import java.util.ArrayList;

//Generics is a feature in Java introduced in Java 5 to provide type safety and code reusability.
// It allows you to write code that can work with different types while maintaining type safety at compile time.
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

    //The diamond operator (<>) is a feature introduced in Java 7 that simplifies the creation of generic objects.
    // It eliminates the need to explicitly specify the type on the right-hand side of a generic declaration, as the compiler can infer the type based on the left-hand side.
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
