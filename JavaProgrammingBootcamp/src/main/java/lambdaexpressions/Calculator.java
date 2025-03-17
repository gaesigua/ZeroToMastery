package lambdaexpressions;

//A LAMBDA EXPRESSION IS A WAY OF IMPLEMENTING AN INTERFACE; BUT NOT JUST ANY INTERFACE; A FUNCTIONAL INTERFACE

//1. In order to work/write lambda expressions, we need functional interface first
//2. A Functional interface is a special interface with only one abstract method (a method without a body);
//3. A Functional interface can have multiple methods, as long as there's only "one" abstract methods; other methods can be static or default

@FunctionalInterface
public interface Calculator {

//4. Let's create an abstract method

    int calculate(int a, int b);

}
