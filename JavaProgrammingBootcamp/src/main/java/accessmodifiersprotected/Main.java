package accessmodifiersprotected;

public class Main {
    public static void main(String[] args) {
        Zahlen numbers = new Zahlen();

        numbers.tag1 = "montag";
        numbers.begrussung = "Gute Nacht!!";


        System.out.println(numbers.tag1);
        numbers.greet();

        numbers.getTag("Tuesday!!");

    }
}
