package exerciseZonedDateTimeDurationandPeriod;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {

        //1. Let's create a ZonedDateTime for an onverseas event

        ZonedDateTime overseasEvent = ZonedDateTime.of(2025,5,7,17,0,0,0,ZoneId.of("Asia/Tokyo"));

        System.out.println("0. Event's Date, Time and Zone: " + overseasEvent);
        System.out.println("-----------------------------------------------");

        //2. Let's calculate the Duration between 2 LocalTime objects

        LocalTime heuteNeunUhr = LocalTime.of(9,0);
        LocalTime heuteFungUhr = LocalTime.of(15,0);

        Duration duration = Duration.between(heuteFungUhr, heuteNeunUhr);

        System.out.println("1. The Duration Between 9AM and 3pm: " + duration);

        System.out.println("-------------------------------------------------");

        //3. Let's calculate the Period between 2 LocalDate objects

        LocalDate jan1st = LocalDate.parse("2023-01-01");
        LocalDate dec31st = LocalDate.parse("2023-12-31");

        Period period = Period.between(jan1st,dec31st);

        System.out.println("2. The Period Between January 01 2023 and December 31 2023: " + period);



    }
}
