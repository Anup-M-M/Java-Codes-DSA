package main.java.org.anup.java8features.fi_predicateex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEvenOddNum {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,5,9,7,8,6);

        numbers.stream()
                .filter( n -> n % 2 == 0 )
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n%2==1)
                .collect(Collectors.toList()); // toList();

        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Basic understanding
        Predicate<Integer> pred = n -> n % 2 == 0 ;

        for (int num : numbers){
            if(pred.test(num)){
                System.out.println(num);
            }
        }
    }
}
