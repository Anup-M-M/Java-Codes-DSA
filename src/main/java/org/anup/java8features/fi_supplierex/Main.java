package main.java.org.anup.java8features.fi_supplierex;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Supplier is FunctionalInterface - supplies or return a result without taking any input.
public class Main {
    public static void main(String[] args) {

        Predicate<Integer> predicate = num -> num % 2 == 0;

        Function<Integer, Integer> function = num -> num * num;

        Consumer<Integer> consumer = num -> System.out.println(num);

        Supplier<Integer> supplier = () -> 100 ;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
    }
}
