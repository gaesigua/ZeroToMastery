package exerciseSynchronizedMethod;

public class SharedCounterDemo {

    public static int counter = 0;

    public static void increment(){
        System.out.println("Before incrementing: " + counter);

        counter++;

        System.out.println("After incrementing: " + counter);
    }

    public class MultiThread extends Thread{



        MultiThread multiThread = new MultiThread();



    }
}
