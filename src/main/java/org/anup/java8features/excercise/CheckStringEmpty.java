package main.java.org.anup.java8features.excercise;

import java.util.function.Predicate;

//Java program to implement a lambda expression to check if a given string is empty.
public class CheckStringEmpty {
    public static void main(String[] args) {

        String str1 = "anup";
        String str2 = "";

        Predicate<String> isEmptyString = String::isEmpty; // str -> str.isEmpty(); or str -> str.length()==0;
        boolean test = isEmptyString.test(str2);
        System.out.println(test);

/*
        Predicate<String> obj = new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.isEmpty();
            }
        };

        System.out.println("String 1 is empty: "+ obj.test(str1));
*/
    }
}
