package concurrentprogramming;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main Thread: " + Thread.currentThread().threadId());

        MyThread myThread = new MyThread();
        myThread.start();   //This line kicks off the new thread

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();

        Runnable myRunnable2 = () -> System.out.println("Hallo aus a lambda Runnable!");
        Thread thread2 = new Thread(myRunnable);
        thread2.start();






    }
}
