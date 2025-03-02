package exerciseMethodWithInputParameters;

public class Adder {
    public static void main(String[] args) {
        add(2,8);
    }
    public static void add(int a, int b){

        int sum = a + b;
        System.out.println("The Sum of " + a + " and " + b + " is " + sum);
    }

}
