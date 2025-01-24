package main.java.org.anup.java8features.datatimeapi;

import java.time.LocalTime;

//LocalTime - Represent the Time with out Date or time zone
public class LocalTimeApi {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime customeTime = LocalTime.of(5, 15, 55);
        System.out.println(customeTime);

        String str = "09:12:50";
        LocalTime parse = LocalTime.parse(str);
        System.out.println(parse);

        LocalTime minusMinutes = now.minusMinutes(10);
        LocalTime minusHours = now.minusHours(1);
        LocalTime minusSeconds = now.minusSeconds(10);
        System.out.println(minusHours + " "+ minusMinutes+ " "+minusSeconds);

        //Checks if this time is after the specified time.
        if(now.isAfter(minusHours)){
            System.out.println("true");
        }

    }
}
