package exerciseLocalTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime meetingLocalTime = LocalTime.of(14, 30);

        System.out.println("The Meeting (Local Time): " + meetingLocalTime);
    }
}
