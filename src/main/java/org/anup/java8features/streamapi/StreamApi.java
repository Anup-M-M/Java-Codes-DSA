package main.java.org.anup.java8features.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10,10,20,40,30,50));
        System.out.println(list);

        //WAP to take out the list where number is grater than 10
        List<Integer> collect = list.stream().filter(n -> n > 10).collect(Collectors.toList());
        System.out.println("Print the element grater than 10 : "+collect);

        // Terminal Operator
        // 1) toArray
        Stream<Integer> stream = Stream.of(10,20,30,40,50);
        Object[] array = stream.toArray();
        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(stream.toArray()));

        // 2) count
        long count = list.stream().count();
        System.out.println("count : "+count);

        // 3) forEach
        list.stream().forEach(n -> System.out.print(n + " "));

        System.out.println();
        // 4) min(), max()
        Optional<Integer> min = list.stream().min((o1, o2) -> o1.compareTo(o2));
        System.out.println("min : "+ min.get());

        Optional<Integer> max = list.stream().max((o1, o2) -> o1.compareTo(o2));
        System.out.println("max : "+ max.get());

        // 5) anyMatch() - Returns true whether any elements of this stream match the provided predicate, otherwise false.
        boolean anyMatch = list.stream().anyMatch(n -> n == 10);
        System.out.println("anyMatch : "+anyMatch);

        // 5) allMatch() - Returns true if either no elements of the stream match the provided predicate or the stream is empty, otherwise false
        boolean allMatch = list.stream().allMatch(n -> n % 2 == 0);
        System.out.println("allMatch : "+allMatch);

        // 6) noneMatch() - Returns true if either no elements of the stream match the provided predicate or the stream is empty, otherwise false
        boolean noneMatch = list.stream().noneMatch(n -> n % 2 != 0);
        System.out.println("noneMatch : "+noneMatch);

        //7) collect()
        //WAP to take out the list where we are adding 10 to each elements
        List<Integer> collect1 = list.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println("Print the all element by adding 10 to each : "+collect1);

        //8) distinct and sort in descending
        List<Integer> distinct = list.stream()
                .distinct()
                .sorted((a,b)->Integer.compare(b, a))
                .collect(Collectors.toList());
        System.out.println(distinct);

    }
}
