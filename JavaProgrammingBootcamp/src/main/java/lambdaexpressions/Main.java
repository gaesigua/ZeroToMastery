package lambdaexpressions;

public class Main {
    public static void main(String[] args) {
        //1. Let's create an implementation using a lambda expression

        Calculator calculator1 = (x,y) -> x + y;
        Calculator calculator2 = (x, y) -> x - y;

        //2. Now let's the calculate what is in the method by giving the values to the method and printing the result

        System.out.println(calculator1.calculate(5, 5));
        System.out.println(calculator2.calculate(20, 10));

        //3. Lambda expressions can handle different types of method bodies; that include single statements, multiple statements, void statements

        Calculator calculator3 = (x,y) -> {
            System.out.println("This is a the first statement of our lambda expression; and it will be printed out!");

            return x/y;    //this is the second statement of our lambda expression;
                           // Warning: remember that when a lambda expression has many statements, we use curly brackets
                           // and we must use a return statement to return a value; in our case it's an int value
        };
        //Now let's call our method calculate

        System.out.println(calculator3.calculate(20,10));

        //4. Now let's work on our Printer functional interface

        //here we will only have one parameter string, instead of having many; and when it is one parameter you can omit the parentheses

        Printer printer = (a) -> {

            System.out.println("Printer says: " + a);
        };
        printer.print("Error! No Cartridge Available!");

        //The reason we are not wrapping the printer.print into a System.out.println is because it is not returning anything;
        // it wouldn't be valid because we can't return a void


        //5. Now Let's run our execute method here below

        int result1 = execute(100, 50, calculator1);
        int result2 = execute(100, 50, calculator2);
        int result3 = execute(100,50, calculator3);

        System.out.println("Result 1: " + result1 + " " + "Result 2: " + result2 + " " + "Result 3: " + result3);
        //You can see that the lambda expression is giving different results just because of the lambda expression's instances (calculator1, calculator2, calculator3) we used.

        //We can get the same results if we created another class let's say "CalculatorImplementation", then implement the Calculator class, and then call its instance, so let's try that

        int result4 = execute(100,20, new CalculatorImplementation()); //this is a hassle but it works

        System.out.println("Result 4: " + result4);

        //We can also pass the lambda expression directly as an argument; THIS IS THE MOST COMMONLY USED WAY

        int result5 = execute(100, 20, (x,y) -> x/y);

        System.out.println("Result 5 (using lambda expression directly into the argument): " + result5);

    }

    //LAMBDA EXPRESSIONS used as Method parameters

    //How can we use lambda expressions as method arguments;
    //Lambda expressions are commonly used in FUNCTIONAL PROGRAMMING
    //When a method requires a parameter of a specific functional interface, a lambda expression can be passed as an argument

    //Here we are going to create a method, that returns an int, and that accepts arguments int and a lambda expression

    public static int execute(int z, int y, Calculator calculator){

        return calculator.calculate(z,y);
    }
}
