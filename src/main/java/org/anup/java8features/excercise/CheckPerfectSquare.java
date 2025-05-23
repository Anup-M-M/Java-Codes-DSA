package main.java.org.anup.java8features.excercise;

import java.util.function.Predicate;

public class CheckPerfectSquare {
    public static void main(String[] args) {

        int number = 35;

        Predicate<Integer> isPerfectSquare = n -> {
            int srqt = (int) Math.sqrt(n);
            return n == srqt * srqt;
        };

        boolean test = isPerfectSquare.test(number);

        if(test)
            System.out.println(number + " is a perfect square");
        else
            System.out.println(number + " is not a perfect square");



    }
}
