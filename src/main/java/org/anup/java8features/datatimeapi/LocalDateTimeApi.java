package main.java.org.anup.java8features.datatimeapi;

import java.time.LocalDateTime;

//LocalDateTime - Represent date and time without time zone
public class LocalDateTimeApi {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime customDateTime = LocalDateTime.of(2025, 12, 25, 10, 20, 50);
        System.out.println(customDateTime);

        String str = "2025-01-20T04:22";
        LocalDateTime parse = LocalDateTime.parse(str);
        System.out.println(parse);

        // we can do same ways as minus and isAfter
    }
}
