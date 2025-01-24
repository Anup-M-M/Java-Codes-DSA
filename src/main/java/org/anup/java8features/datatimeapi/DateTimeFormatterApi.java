package main.java.org.anup.java8features.datatimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Formats and parses dates and times.
public class DateTimeFormatterApi
{
    public static void main(String[] args) {

        /*LocalDate now = LocalDate.now();
        System.out.println(now); // 2025-01-20

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        String format = now.format(myFormat);
        System.out.println(format); //20/01/2025*/

        String date = "25/01/2020";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("DD/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(localDate);
    }
}
