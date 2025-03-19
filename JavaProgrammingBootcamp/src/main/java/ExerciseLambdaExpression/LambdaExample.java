package ExerciseLambdaExpression;

import exerciseFunctionalInterface.NumericOperator;

import static java.lang.Math.max;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator sumOperator = (t, y) -> t + y;

        int sum = sumOperator.operate(2000,1000);
        System.out.println("The sum: " + sum);

        NumericOperator maxOperator = (t,y) -> max(t,y);

        System.out.println("The maximum: " + maxOperator.operate(20,15));
    }
}
