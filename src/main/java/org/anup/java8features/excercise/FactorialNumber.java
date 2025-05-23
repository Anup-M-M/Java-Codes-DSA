package main.java.org.anup.java8features.excercise;

import java.util.function.Function;
import java.util.function.UnaryOperator;

//Calculate factorial of number using Lambda expression
public class FactorialNumber {

    public static void main(String[] args) {

        int n = 5;

        UnaryOperator<Integer> findFact = num -> {
            int res = 1;
            for (int i = 1; i <= num; i++) {
                res = res * i ;
            }
            return res;
        };

        int result = findFact.apply(n);

        System.out.println(result);


    }
}
