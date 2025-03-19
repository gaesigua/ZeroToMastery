package lambdaexpressions;

public class LambdaScopeExample {

    public static void main(String[] args) {

        //Here our local variable is EFFECTIVELY FINAL

        int localVariable = 6;

        //localVariable = 30; this would create an error because this is update the localVariable

        Calculator cal1 = (t, z) -> t + z + localVariable;

        System.out.println("Result: " + cal1.calculate(20,10));
    }
}
