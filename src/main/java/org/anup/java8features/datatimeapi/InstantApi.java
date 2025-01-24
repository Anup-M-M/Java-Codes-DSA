package main.java.org.anup.java8features.datatimeapi;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//An instantaneous point on the time-line.
public class InstantApi {
    public static void main(String[] args) {

        //previously
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Instant now = Instant.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);
    }
}
