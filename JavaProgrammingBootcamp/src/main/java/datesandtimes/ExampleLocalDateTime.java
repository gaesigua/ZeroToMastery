package datesandtimes;

import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {

        //1. The LocalDateTime is a also a class of the Date and Time package/API; and .now is a method that prints out the current TIME with a default format

        LocalDateTime myLocalDateTime = LocalDateTime.now();

        //2. The .of method helps to format the date and time

        LocalDateTime myOfLocalDateTime = LocalDateTime.of(2024,2,8, 10, 8, 1);

        //3. The .parse method helps to format our date and time using a character sequence/String

        LocalDateTime myParsedLocalDateTime = LocalDateTime.parse("2024-08-12, 12-24-07");

        //4. Let's print out my local date and time without modifying it

        System.out.println("1. Today's Date and Current's Time: " + myLocalDateTime);

        //5. Let's print another date and time I chose using the .of method

        System.out.println("2. Chosen Date and Time: " + myOfLocalDateTime);

        //6. Let's print out another date and time I chose but with the format of my choice

        System.out.println("3. Date and Time with Format of My Choice: " + myParsedLocalDateTime);

        //7. Now Let's Add days to my Local Time and print out the result

        //Here it will still print out the initial local Date and Time since the new local date and time was not saved in the Object LocalDateTime

        myLocalDateTime.plusMinutes(40);

        System.out.println("4. Will this print out the new local Date and Time (with 40 minutes added?): " + myLocalDateTime);

        LocalDateTime myLocalDateAndTimePlus40Minutes = myLocalDateTime.plusMinutes(40);

        System.out.println("5. Will this print out the new local time (with 23 minutes added?): " + myLocalDateTime.plusMinutes(40));

        //8. Let's just get the hour of my localdatetime

        System.out.println("6. Hour: " + myLocalDateTime.getHour());

        //9. Let's removes a few weeks to my courrent date and time

        myLocalDateTime.minusWeeks(2);

        System.out.println("My New Date and Time with 2 weeks deducted: " + myLocalDateTime.minusWeeks(2));


            }
        }
