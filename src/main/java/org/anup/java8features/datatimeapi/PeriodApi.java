package main.java.org.anup.java8features.datatimeapi;

import java.time.LocalDate;
import java.time.Period;

// Represent the period of time between two dates.
public class PeriodApi {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(2000, 12, 25);

        Period period = Period.between(now, then);
        System.out.println(period);
    }
}
