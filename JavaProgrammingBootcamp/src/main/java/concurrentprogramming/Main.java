package concurrentprogramming;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main Thread: " + Thread.currentThread().threadId());

        MyThread myThread = new MyThread();

        myThread.start();   //This line kicks off the new thread
    }
}
