package calculatingWithDatesAndTimes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ExampleCalculatingWithDatesAndTimes {
    public static void main(String[] args) {

        //1. Let's calculate the Period between (difference) two dates using LocalDate

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2020, 03, 01);

        Period difference = Period.between(startDate, endDate);

        System.out.println("The period between Today and 2020/03/01: " + difference);

        System.out.println("==============================================");

        //2. Let's calculate the sum between two dates using LocalDateTime; Here we are adding one hour to the current date and time

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime oneHourFromNow = currentDateTime.plusHours(1);
        LocalDateTime twoHoursFromNow = currentDateTime.plus(Duration.ofHours(2));

        System.out.println("My Current Date&Time + 1 Hour: " + currentDateTime + " + 1 hour " + oneHourFromNow);

        System.out.println("My Current Date&Time + 2 Hours: " + currentDateTime + " 2 hours " + twoHoursFromNow);

        System.out.println("==============================================");

        //3. Let's calculate something using the LocalDate class

        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);

        System.out.println("One Year Ago was: " + oneYearAgo);
        System.out.println("==============================================");

        LocalDate siebzigJahreAgo = today.minus(Period.ofYears(70));
        System.out.println("Today is: " + today + "70 Years was: " + siebzigJahreAgo);

        System.out.println("=============================================");








    }
}
