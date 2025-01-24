package main.java.org.anup.java8features.fi_predicateex;

import java.util.Arrays;
import java.util.List;

public class SumofEvenNumberInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,9,7,8,6);

        // filter : Returns a stream consisting of the elements of this stream that match the given predicate.
        // map : Returns a stream consisting of the results of applying the given function to the elements of this stream.
        int sumOfEvenNum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.println(sumOfEvenNum);

        int sum = 0;
        for(int num : numbers){
            if(num % 2 == 0){
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
