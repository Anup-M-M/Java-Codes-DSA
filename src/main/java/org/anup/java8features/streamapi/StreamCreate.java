package main.java.org.anup.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Anup","Rashmi", "Arun");
        Stream<String> stream = list.stream();

        String[] arr = {"Anup","Rashmi", "Arun"};
        Stream<String> stream1 = Arrays.stream(arr);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
        limit.forEach(n-> System.out.println(n));

        Stream<Double> limit1 = Stream.generate(() -> Math.random()).limit(5);
        limit1.forEach(n-> System.out.println(n));
    }
}
