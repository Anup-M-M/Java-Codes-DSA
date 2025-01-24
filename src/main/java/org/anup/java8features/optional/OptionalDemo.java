package main.java.org.anup.java8features.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        // Creates an Optional with a non-null value
        Optional<String> optionalWithValue = Optional.of("Hello, World!");

        // Creates an Optional that can be empty or contain a value
        Optional<String> emptyOptional = Optional.empty();

        // Creates an Optional with a nullable value; will be empty if the value is null
        Optional<String> nullableOptional = Optional.ofNullable(null);

        // ifPresent: Executes a given action if a value is present
        optionalWithValue.ifPresent(value -> System.out.println("Value is present: " + value));

        // orElse: Returns the value if present, otherwise returns a default value.
        String valueOrElse = emptyOptional.orElse("Default Value");
        System.out.println("Value or Else: " + valueOrElse);

        // orElseGet: Returns the value if present, otherwise invokes a supplier function to get a default value
        String valueOrElseGet = emptyOptional.orElseGet(() -> "Generated Default Value");
        System.out.println("Value or Else Get: " + valueOrElseGet);

        // orElseThrow: Returns the value if present, otherwise throws an exception
        try {
            String valueOrElseThrow = emptyOptional.orElseThrow(() -> new RuntimeException("Value is not present"));
            System.out.println("Value or Else Throw: " + valueOrElseThrow);
        } catch (RuntimeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // map: Transforms the value if present and returns an Optional
        // Here, we convert the string to uppercase
        Optional<String> mappedOptional = optionalWithValue.map(value -> value.toUpperCase());
        System.out.println("Mapped Value: " + mappedOptional.orElse("No Value"));

        // flatMap: Similar to map, but the function must return an Optional
        // Here, we convert the string to lowercase and wrap it in an Optional
        Optional<String> flatMappedOptional = optionalWithValue.flatMap(value -> Optional.of(value.toLowerCase()));
        System.out.println("FlatMapped Value: " + flatMappedOptional.orElse("No Value"));

        // filter: Returns the Optional if the value matches the predicate, otherwise returns an empty Optional
        Optional<String> filteredOptional = optionalWithValue.filter(value -> value.contains("World"));
        System.out.println("Filtered Value: " + filteredOptional.orElse("No Match"));

        // isPresent: Checks if a value is present
        boolean isPresent = optionalWithValue.isPresent();
        System.out.println("Is Present: " + isPresent);

        // ifPresent: Executes an action if a value is present, otherwise do nothing
        optionalWithValue.ifPresent(
                value -> System.out.println("Value is present: " + value)
        );

    }
}

