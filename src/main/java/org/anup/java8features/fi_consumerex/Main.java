package main.java.org.anup.java8features.fi_consumerex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer is FunctionalInterface accepts one argument, Perform operation and return no result.
public class Main {
    public static void main(String[] args) {

        Consumer<String> consumer = str -> System.out.println(str.length());
        consumer.accept("anup");

        Consumer<List<Integer>> consumer1 = li -> {
            for (int num : li){
                System.out.println( num );
            }
        };

        Consumer<List<Integer>> consumer2 = li -> {
            for (int num : li){
                System.out.println( num + 100);
            }
        };

        Consumer<List<Integer>> listConsumer = consumer1.andThen(consumer2);
        listConsumer.accept(Arrays.asList(1,2,3,4,5));
    }
}
