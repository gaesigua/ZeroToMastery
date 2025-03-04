package datesandtimes;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        LocalDate myLocaldate = LocalDate.now();
        LocalDate myOfLocaldate = LocalDate.of(2024, 8, 30);
        LocalDate myParsedLocaldate = LocalDate.parse("2020-01-01");

        //1. Let's print my local date without modifying it

        System.out.println("1. Today's Date: " + myLocaldate);

        //2. Let's print another date I chose using the .of method

        System.out.println("2. Chosen Date: " + myOfLocaldate);

        //3. Let's print out another date I chose but with the format of my choice

        System.out.println("3. Date with Format of My Choice: " + myParsedLocaldate);

        //4. Now Let's Add days to my Local Date and print out the result

        myLocaldate.plusDays(8);

        System.out.println("4. Will this print out the new local date (with 8 days added?): " + myLocaldate);

        LocalDate myLocalDatePlus8Days = myLocaldate.plusDays(8);

        System.out.println("5. Will this print out the new local date (with 8 days added?): " + myLocalDatePlus8Days);
    }
}
