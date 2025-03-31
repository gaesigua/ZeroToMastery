package exerciseUsingExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo extends Thread{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {

            executor.submit(() -> {
                System.out.println("Executing Task in " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
