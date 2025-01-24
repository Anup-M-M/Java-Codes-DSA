package main.java.org.anup.java8features.fi_functionex;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {

        Function<Integer, Integer> function1 = n -> n * 2;

        Function<Integer, Integer> function2 = n -> n*n*n;

        // andThen() is default method - Returns a composed function that first applies this function to its input, and then applies the after function to the result.
        // First executes the current function, then the specified or sec function
        System.out.println(function1.andThen(function2).apply(2)); // 64

        System.out.println(function2.andThen(function1).apply(2)); // 16

        // compose() is default method - Returns a composed function that first applies the before function to its input, and then applies this function to the result.
        // First executes the specified or sec function, then the current function.
        System.out.println(function1.compose(function2).apply(2)); // 16

        //identity() is static method - a function that always returns its input argument
        System.out.println(Function.identity().apply("anup"));
    }
}
