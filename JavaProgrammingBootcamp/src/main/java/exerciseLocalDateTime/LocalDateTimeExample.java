package exerciseLocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime eventDateTime = LocalDateTime.of(2023,11,21,18,0);

        System.out.println("The event will take place on: " + eventDateTime);

    }
}
