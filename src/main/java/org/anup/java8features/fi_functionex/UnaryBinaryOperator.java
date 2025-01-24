package main.java.org.anup.java8features.fi_functionex;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

// Unary Operator extends the Function.
// Binary Operator extend the BiFuncton.
public class UnaryBinaryOperator {
    public static void main(String[] args) {

        Function<String, String> function = str -> str.toLowerCase();

        // UnaryOperator extends the Function
        // A function that takes one input, Perform some operation and returns a result of the same type.
        UnaryOperator<String> unaryOperator = str -> str.toLowerCase();
        System.out.println(unaryOperator.apply("ANUP"));

        BiFunction<String, String, String> biFunction = (str1, str2) -> str1.concat(str2);

        // BinaryOperator extends the BiFunction
        //A function that takes two inputs of the same type, Perform some operation and returns a result of the same type
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1.concat(str2).toLowerCase();
        System.out.println(binaryOperator.apply("ANUP", " M"));

    }
}
