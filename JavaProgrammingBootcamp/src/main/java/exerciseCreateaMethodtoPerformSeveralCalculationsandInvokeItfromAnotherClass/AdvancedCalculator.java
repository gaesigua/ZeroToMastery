package exerciseCreateaMethodtoPerformSeveralCalculationsandInvokeItfromAnotherClass;

public class AdvancedCalculator {

    public static void performCalculations(int a, int b){

        int sum = a + b;
        int diff = a -b;
        double product = (double) a * b;
        float quotient = (float) a / b;

        System.out.println("The sum:" +sum);
        System.out.println("The difference: " +diff);
        System.out.println("The product: " + product);
        System.out.println("The quotient: " + quotient);
    }
}
