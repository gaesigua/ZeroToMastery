package calculatingWithDatesAndTimes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class ExampleCalculatingWithDatesAndTimes {
    public static void main(String[] args) {

        //1. Let's calculate the Period between (difference) two dates using LocalDate

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2020, 3, 1);

        Period difference = Period.between(startDate, endDate);

        System.out.println("1. The period between Today and 2020/03/01: " + difference);

        System.out.println("==============================================");

        //2. Let's calculate the Period between (difference) today and January 01, 2030

        LocalDate heute = LocalDate.now();
        LocalDate beginningOf2030 = LocalDate.of(2030,1,1);

        Period diffBetweenTodayand2030 = Period.between(heute,beginningOf2030);

        System.out.println("2. The period between Today and 2030/01/01: " + diffBetweenTodayand2030);
        System.out.println("===============================================");

        //3. Let's calculate the sum between two dates using LocalDateTime; Here we are adding one hour to the current date and time

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime einUhrFromNow = currentDateTime.plusHours(1);
        LocalDateTime zweiUhrFromNow = currentDateTime.plus(Duration.ofHours(2));
        LocalDateTime vierUhrFromNow = currentDateTime.plus(4, ChronoUnit.HOURS);
        LocalDateTime dreiUhrFromNow = currentDateTime.minusMinutes(180);

        System.out.println("3. My Current Date&Time: " + currentDateTime);

        System.out.println("4. My Current Date&Time + 1 Hour from now: " + currentDateTime + " + 1 hour " + einUhrFromNow);

        System.out.println("5. My Current Date&Time + 2 Hours: " + currentDateTime + " 2 hours " + zweiUhrFromNow);

        System.out.println("6. My Current Date&Time + 2 Hours using .Hours from ChronoUnit: " + vierUhrFromNow);

        System.out.println("7. My current Date&Time + 180 Minutes (3 Hours) " + currentDateTime + "180 minutes" + dreiUhrFromNow);

        System.out.println("==============================================");

        //3. Let's calculate something using the LocalDate class

        LocalDate today = LocalDate.now();
        LocalDate einJahreAgo = today.minusYears(1);
        LocalDate zweiJahreAgo = today.minus(2, ChronoUnit.YEARS);
        LocalDate funfzehnJahreAgo = today.minus(Period.ofYears(15));


        System.out.println("8. One Year Ago today was: " + einJahreAgo);
        System.out.println("9. Two Years Ago today was: " + zweiJahreAgo);
        System.out.println("10. 15 Years ago today was: " + funfzehnJahreAgo);
        System.out.println("==============================================");

        LocalDate siebzigJahreAgo = today.minus(Period.ofYears(70));
        System.out.println("11. Today is: " + today + "70 Years was: " + siebzigJahreAgo);

        System.out.println("=============================================");








    }
}
