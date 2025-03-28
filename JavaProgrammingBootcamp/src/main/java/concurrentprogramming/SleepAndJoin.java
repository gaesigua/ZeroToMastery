package concurrentprogramming;

public class SleepAndJoin {
    public static void main(String[] args) {

        Thread t = new Thread(()->{
            try{
                System.out.println("Thread will go to sleep for 2 seconds...");
                Thread.sleep(2000); //Pausing for 2 seconds
                System.out.println("*Yawn...* I'm awake!");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        t.start();

        Thread t2 = new Thread(()->{
            System.out.println("t2 started");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("t2 finished!");
        });

        t2.start();

        try{
            System.out.println("Main Thread Will be waiting for t2 to be done!");
            t2.join(); //Main Thread waits for t2 to complete
            System.out.println("Main thread continues ..............");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
