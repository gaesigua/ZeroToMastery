package exerciseMethodWithReturnTypeandReturnStatement;

public class Multiplier {
    public static void main(String[] args) {

        int product = multiply(5,250);

        System.out.println("The product: " + product);
    }
    public static int multiply(int a, int b){

        return a * b;
    }
}
