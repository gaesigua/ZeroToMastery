package datesandtimes;

import java.time.LocalTime;

public class ExampleLocalTime {
    public static void main(String[] args) {

        //A. The LocalTime is a also a class of the Date and Time package/API; and .now is a method that prints out the current TIME with a default format

                LocalTime myLocalTime = LocalTime.now();

                //B. The .of method helps to format the time starting with the hours, then minutes, then seconds

                LocalTime myOfLocalTime = LocalTime.of(02, 50, 24);

                //C. The .parse method helps to format our time using a character sequence/String

                LocalTime myParsedLocalTime = LocalTime.parse("18:27:19");

                //1. Let's print my local time without modifying it

                System.out.println("1. Current's Time: " + myLocalTime);

                //2. Let's print another time I chose using the .of method

                System.out.println("2. Chosen Time: " + myOfLocalTime);

                //3. Let's print out another time I chose but with the format of my choice

                System.out.println("3. Time with Format of My Choice: " + myParsedLocalTime);

                //4. Now Let's Add days to my Local Time and print out the result
                //Here it will still print out the initial local Time since the new local time was not saved in the Object LocalTime

                myLocalTime.plusMinutes(23);

                System.out.println("4. Will this print out the new local time (with 23 minutes added?): " + myLocalTime);

                LocalTime myLocalDatePlus23Minutes = myLocalTime.plusMinutes(23);

                System.out.println("5. Will this print out the new local time (with 23 minutes added?): " + myLocalDatePlus23Minutes);

                //5. Let's just get the hour of my localtime

                System.out.println("6. Hour: " + myLocalTime.getHour());
            }
        }

