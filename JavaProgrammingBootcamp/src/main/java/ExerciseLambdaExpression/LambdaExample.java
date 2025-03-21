package ExerciseLambdaExpression;

import exerciseAnotherFunctionalInterface.StringFormatter;
import exerciseFunctionalInterface.NumericOperator;

import static java.lang.Math.max;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator sumOperator = (t, y) -> t + y;

        int sum = sumOperator.operate(2000,1000);
        System.out.println("The sum: " + sum);

        NumericOperator maxOperator1 = (t,y) -> max(t,y);

        System.out.println("The maximum (method 1): " + maxOperator1.operate(20,15));

        NumericOperator maxOperator2 = (z,g) -> z > g ? z : g;

        System.out.println("The maximum (method 2): " + maxOperator2.operate(20,210));

        //Here we are implementing a StringFormatter interface from a different package(exerciseAnotherFunctionalInterface), that's why we imported it at the top

        StringFormatter uppercaseFormatter = (input) -> input.toUpperCase();

        System.out.println("The Uppercase: " + uppercaseFormatter.format( "Regelmasigeverben"));
    }
}
