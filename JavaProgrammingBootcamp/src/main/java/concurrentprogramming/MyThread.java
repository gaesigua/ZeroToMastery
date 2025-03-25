package concurrentprogramming;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hallo aus MyThread!" + Thread.currentThread().threadId());
    }
}
