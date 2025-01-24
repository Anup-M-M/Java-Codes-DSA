package main.java.org.anup.java8features.datatimeapi;

import java.time.LocalDate;
import java.time.Month;

// LocalDate represents a date witout a time zone
public class LocalDateApi {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate customDate = LocalDate.of(2025,10, 25);
        System.out.println(customDate);

        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(year +" "+ month+ " "+ dayOfMonth);

        LocalDate yesterday = now.minusDays(1);
        LocalDate lastMonth = now.minusMonths(1);
        LocalDate lastYear = now.minusYears(1);
        System.out.println(yesterday +" "+ lastMonth+ " "+ lastYear);

        //isAfter : Checks if this date is after the specified date.
        //isBefore : Checks if this date is before the specified date.
        if(now.isAfter(yesterday)){
            System.out.println("True");
        }

    }
}
