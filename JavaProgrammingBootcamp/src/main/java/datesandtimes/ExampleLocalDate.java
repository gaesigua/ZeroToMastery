package datesandtimes;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        //A. The LocalDate is a class; and .now is a method that prints out the current date with a default format

        LocalDate myLocaldate = LocalDate.now();

        //B. The .of method helps to format the date starting with the year, then month, then days

        LocalDate myOfLocaldate = LocalDate.of(2024, 8, 30);

        //C. The .parse method helps to format our date using a character sequence/String

        LocalDate myParsedLocaldate = LocalDate.parse("2020-01-01");

        //1. Let's print my local date without modifying it

        System.out.println("1. Today's Date: " + myLocaldate);

        //2. Let's print another date I chose using the .of method

        System.out.println("2. Chosen Date: " + myOfLocaldate);

        //3. Let's print out another date I chose but with the format of my choice

        System.out.println("3. Date with Format of My Choice: " + myParsedLocaldate);

        //4. Now Let's Add days to my Local Date and print out the result
        //Here it will still print out the initial local date since the new local date was not saved in the Object LocalDate

        myLocaldate.plusDays(8);

        System.out.println("4. Will this print out the new local date (with 8 days added?): " + myLocaldate);

        LocalDate myLocalDatePlus8Days = myLocaldate.plusDays(8);

        System.out.println("5. Will this print out the new local date (with 8 days added?): " + myLocalDatePlus8Days);

        //5. Let's just get the Year of my localdate

        System.out.println("6. Year: " + myLocaldate.getYear());
    }
}
