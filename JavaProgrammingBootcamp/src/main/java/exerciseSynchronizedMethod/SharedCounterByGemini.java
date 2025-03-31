package exerciseSynchronizedMethod;

public class SharedCounterByGemini {

    private static int counter = 0;

    public static void increment(){

        System.out.println("Before incrementing: " + counter);

        counter++;

        System.out.println("After incrementing: " + counter);
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        increment();
        increment();
        increment();
        increment();
        increment();
        System.out.println("Final value from counter: " + getCounter());
    }
}
