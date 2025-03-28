package concurrentprogramming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountWithLock {

    private static int counter = 0;

    private static final Lock lock = new ReentrantLock();

    public static void incrementCounter(){
        lock.lock();

        try{
            int current = counter;
            System.out.println("Before: " + current + ", Current thread: " + Thread.currentThread().threadId());
            counter = current + 1;
            System.out.println("After: " + counter);
        }finally {
            lock.unlock(); //Always unlock in a finally block
        }
    }
}
