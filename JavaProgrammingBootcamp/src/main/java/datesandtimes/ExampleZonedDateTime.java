package datesandtimes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZonedDateTime {
    public static void main(String[] args) {

        //1. Let's first find out my current date, time and timezone

        ZonedDateTime myZDT = ZonedDateTime.now();
        //LocalDateTime myLocalDT = LocalDateTime.now();

        System.out.println("My Zoned Date Time: " + myZDT);

        //2. Let's now try to print out a date, time and timezone with a format of my choice using .of

        ZonedDateTime myZDTOf = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("US/Pacific"));

        //In case I don't know the zone id I could ask Java/IntelliJ, by using a for each loop and ask Java to print out all the zones for me

        for (String zone: ZoneId.getAvailableZoneIds())
            System.out.println(zone);

        System.out.println("The current time is: " + myZDTOf);

        //3. Let's print out the current date and time with a zone time using a country we know but don't know its time zone

        ZonedDateTime myZDT4 = myZDT.withZoneSameInstant(ZoneId.of("Egypt"));
        System.out.println("The Current Date, Time, and Zone of Egypt: " + myZDT4);


    }
}
