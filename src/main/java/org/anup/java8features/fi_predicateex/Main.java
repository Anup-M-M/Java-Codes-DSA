package main.java.org.anup.java8features.fi_predicateex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Predicate FuntionalInterface : Booleans valued function takes single paramater.
            // Evaluates condition and return true if the input argument matches the condition, otherwise false.
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,5,9,7,8,6);
        // Basic understanding
        Predicate<Integer> pred = n -> n % 2 == 0 ;

        for (int num : numbers){
            if(pred.test(num)){
                System.out.println(num);
            }
        }

        Predicate<String> startWithA = str -> str.toLowerCase().charAt(0) == 'a';

        Predicate<String> endWithP = str -> str.toLowerCase().charAt(str.length()-1) == 'p';

        // and() is default method is Predicate
        Predicate<String> andPredicate = startWithA.and(endWithP);
        System.out.println(andPredicate.test("Anup"));

        // or() is default method is Predicate
        Predicate<String> orPredicate = startWithA.or(endWithP);
        System.out.println(orPredicate.test("Anup"));

        // negate() is default method is Predicate
        System.out.println(andPredicate.negate().test("anup"));

        // isEqual() is static method in Predicate
        Predicate<String> isEqualPredicate = Predicate.isEqual("anup");
        System.out.println(isEqualPredicate.test("anup"));
    }
}
