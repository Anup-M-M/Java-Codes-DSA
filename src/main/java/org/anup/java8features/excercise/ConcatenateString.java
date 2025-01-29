package main.java.org.anup.java8features.excercise;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//Concatenate strings using Lambda expression
public class ConcatenateString {
    public static void main(String[] args) {

        String string1 = "Good ";
        String string2 = "Morning!";

        BiFunction<String, String, String> concateString = (str1, str2) -> str1.concat(str2);
        String concatedString = concateString.apply(string1, string2);
        System.out.println(concatedString);

        // BinaryOperator extends the BiFunction
        //A function that takes two inputs of the same type, Perform some operation and returns a result of the same type
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1.concat(str2);
        String result = concateString.apply(string1, string2);
        System.out.println(result);
    }
}
