package concurrentprogramming;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledUpdates {
    public static void main(String[] args) {

        //Let's create a ScheduledExecutorService with a pool size of 1

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        //Runnable task to send updates

        Runnable updateTask = () -> {
            System.out.println("Sending election updates! Timestamp: " + System.currentTimeMillis()/1000);
        };

        //Schedule the task to run after an initial delay of 0 seconds and subsequently with a delay of 2 seconds

        scheduledExecutorService.scheduleWithFixedDelay(updateTask, 0,2, TimeUnit.SECONDS);

        try{
            //Main Thread sleeps for 10 seconds to observe the scheduled tasks
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutorService.shutdown();
    }
}
