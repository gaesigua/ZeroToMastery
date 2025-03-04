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

        //Let's add duration to another duration

        duration5.plus(duration2);

        System.out.println("1. Will the duration change? Answer: No " + duration2);

        Duration duration6 = duration5.plus(duration2);

        System.out.println("2. The Added Duration: " + duration6);
        System.out.println("=====================================");

        //2. Period class

        Period period1 = Period.of(10, 2, 3);
        Period period2 = Period.ofWeeks(12);


        System.out.println("Period of 10 years, 2 months, and 3 days: " + period1);
        System.out.println("Period of 12 Weeks: " + period2);

        System.out.println("Days in 12 Weeks: " + period2.getDays());

        System.out.println("=====================================");

    }
}
