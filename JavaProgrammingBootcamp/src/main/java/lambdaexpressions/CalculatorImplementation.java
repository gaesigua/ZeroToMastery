package lambdaexpressions;

public class CalculatorImplementation implements Calculator{

    //As soon as we add implements Calculator, there are red squiggles since we are implementing an interface,
    // and to remove the red squiggles, we have to override the class in the Calculator


    @Override
    public int calculate(int a, int b) {
        return a / b;    //this is a bit dangerous for Integers
    }
}
