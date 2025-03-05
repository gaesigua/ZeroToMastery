package exerciseFormattingandParsingDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {

        //1. Let's format a LocalDateTime object

        LocalDateTime heute = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd;HH:mm:ss");

        String formattedHeute = heute.format(formatter); //or formatter.format(heute); both will produce the same outcome

        System.out.println("1. My Formatted Date and Time: " + formattedHeute);

        System.out.println("----------------------------------------------------------");

        //2. Let's now Parse a date String into a LocalDate object

        String dateString = "2023-11-21";

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate myParsedDate = LocalDate.parse(dateString, myFormatter);

        System.out.println("My Parsed Date: " + myParsedDate);

    }
}
