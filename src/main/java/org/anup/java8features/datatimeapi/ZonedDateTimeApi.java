package main.java.org.anup.java8features.datatimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

// ZonedDateTime - Represent Date and Time with Time Zone
public class ZonedDateTimeApi {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.stream().forEach(System.out::println);

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYorkTime);
        
        String previsousDayDateTime = "2025-01-20T03:59:50.966-05:00[America/New_York]";
        ZonedDateTime.parse(previsousDayDateTime);


    }
}
