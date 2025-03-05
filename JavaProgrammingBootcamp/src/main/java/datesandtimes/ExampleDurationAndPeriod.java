package datesandtimes;

import java.time.Duration;
import java.time.Period;

public class ExampleDurationAndPeriod {
    public static void main(String[] args) {
        //1. Duration class

        Duration duration1 = Duration.ofNanos(10000000);
        Duration duration2 = Duration.ofSeconds(1000);
        Duration duration3 = Duration.ofMillis(5000);
        Duration duration4 = Duration.ofSeconds(100, 1000);
        Duration duration5 = Duration.ofDays(7);
        Duration duration7 = Duration.ofDays(365);

        //Let's add duration to another duration

        duration5.plus(duration2);

        System.out.println("1. Will the duration change? Answer: No " + duration2);

        Duration duration6 = duration5.plus(duration2);

        System.out.println("2. The Added Duration: " + duration6);
        System.out.println("=====================================");

        //How many seconds are in 365 days

        long secondsInAYear = duration7.getSeconds();

        System.out.println("3. How many seconds are in 365: " + secondsInAYear);

        System.out.println("====================================");

        //2. Period class

        Period period1 = Period.of(10, 2, 3);
        Period period2 = Period.ofWeeks(12);


        System.out.println("4. Period of 10 years, 2 months, and 3 days: " + period1);
        System.out.println("5. Period of 12 Weeks: " + period2);

        System.out.println("6. Days in 12 Weeks: " + period2.getDays());

        System.out.println("=====================================");

    }
}
