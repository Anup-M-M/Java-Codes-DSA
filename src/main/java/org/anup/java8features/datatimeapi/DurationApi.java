package main.java.org.anup.java8features.datatimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Represent a duration of time between two points in time. // sec, minutes, hours
public class DurationApi {
    public static void main(String[] args) throws InterruptedException {

        Instant start = Instant.now();

        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        Instant end = Instant.now();

        Duration d1 = Duration.between(start, end);

        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);

        System.out.println(d1);
        System.out.println(d2);

        int value = d1.compareTo(d2);

        System.out.println(value);

        LocalDateTime a = LocalDateTime.now();
        Thread.sleep(10);
        LocalDateTime b = LocalDateTime.now();
        Duration between = Duration.between(a, b);
        System.out.println(between);

    }
}
