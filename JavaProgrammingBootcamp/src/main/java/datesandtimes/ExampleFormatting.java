package datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class ExampleFormatting {
    public static void main(String[] args) {
        LocalDateTime jetztDateTime = LocalDateTime.now();
        LocalDate jetztDate= LocalDate.now();

        //1. Let's FORMAT The Dates with a custom pattern using DateTimeFormatter and the .ofPattern() method
        // Remember that here we are FORMATTING; in other words we are converting a Date object into a String representation

        DateTimeFormatter myFirstDateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy:HH/mm/ss");
        DateTimeFormatter mySecondDateFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter myThirdDateFormatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");


        System.out.println("1. Today's Date&Time formatted in \"MM/dd/yyyy:HH/mm/ss\" :" + myFirstDateTimeFormatter.format(jetztDateTime));
        System.out.println("2. Today's Date formatted in \"MM-dd-yyyy\" : " + mySecondDateFormatter.format(jetztDate));
        System.out.println("3. Today's Date in an unusual format of \"MMMM-dd-yyyy\" : " + myThirdDateFormatter.format(jetztDate));


        //2. Let's now try to do PARSING; meaning we are converting a String Date to a Date Object;

        LocalDate myParsedLocalDate = LocalDate.parse("08-30-2020", mySecondDateFormatter);

        System.out.println("4. My Parsed Date from Date Object to String: " + myParsedLocalDate.format(DateTimeFormatter.ISO_WEEK_DATE));

        //3. Final, Let's Now Build our own DateTimeFormatter Object using the DateTimeFormatter class

        DateTimeFormatterBuilder myDTFB = new DateTimeFormatterBuilder();

        DateTimeFormatter myDTF = myDTFB.appendLiteral("My New Date Format is: ")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("/")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .toFormatter();

        System.out.println(myParsedLocalDate.format(myDTF));

    }
}
