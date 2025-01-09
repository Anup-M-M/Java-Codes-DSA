package main.java.org.anup.java8features.optional;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        // accepts both null and non-null values. if the present value is non-null , it returns an Optional describing the specified value, otherwise returns an empty Optional.
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        checkNull.ifPresent(System.out::println);   // printing value by using method reference
        System.out.println(checkNull.get());    // printing value by using get method
        System.out.println(str[5].toLowerCase());

        System.out.println();

        Optional<String> opt = Optional.ofNullable(null);
        // Using ifPresent() to avoid calling get() on an empty Optional
        opt.ifPresent(value -> System.out.println("Value: " + value));
        // Using orElse() to provide a default value
        String value = opt.orElse("Default Value");
        System.out.println(value);
    }
}
