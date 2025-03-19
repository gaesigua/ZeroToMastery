package lambdaexpressions;

//Here we are learning about JAVA BUILT-IN FUNCTIONAL INTERFACES
//Built-in functional interfaces are designed to work seamlessly with Java's functional programming features;

//Most Common Built-in Functional Interfaces are:

//1. Supplier <T>    //generic type here; it could represent a String, int, or a custom class
     // T get();     //a single method that returns something

//2. Consumer <T>
     // void accept (T t);  //Accepts one parameter as argument, and returns nothing

//3. Predicate <T>
     // boolean test(T t);  //accepts one parameter as argument, and returns a boolean

//4. Function <T, R>        //has two generics, they can be of different types
     // R apply(T t);       //T could be the input, and R could be the output



//NOW LET'S SEE HOW WE CAN IMPLEMENT THESE FUNCTIONAL INTERFACES; HERE WE WILL NOT USE LAMBDA EXPRESSIONS FIRST

import java.util.function.Supplier;

public class SupplierExample implements Supplier<String> {

    //Here we have Supplier example; and we are overriding a class from the Supplier<T> interface
    @Override
    public String get() {
        return "Satzstructur";
    }

    //Now let's go ahead and create another class, and instantiate this one above

}
