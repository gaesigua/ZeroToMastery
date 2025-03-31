package exerciseSynchronizedMethod;

public class SharedCounterDemo{

    public static int counter = 0;

    public static synchronized void increment(){
        int current = counter;

        System.out.println("Before incrementing: " + counter);

        counter++;

        System.out.println("After incrementing: " + counter);
    }

    public static void main (String[] args) {

        for (int i = 0; i < 10; i++) {

            new Thread(SharedCounterDemo::increment).start();
        }

}
}