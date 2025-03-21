package functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReferences {
    public static void main(String[] args) {
        //A. REFERENCE TO A STATIC METHOD

        //1. Let's first implement a function using the normal Lambda expression

        Function<Integer, String> numberToHexString = i -> Integer.toHexString(i);

        System.out.println("toHexString using Lambda expression: " + numberToHexString.apply(323));

        //2. Now Let's implement the same function using a method reference

        Function<Integer, String> numberToHexStringUsingMethodReference = Integer::toHexString;

        System.out.println("toHexString using Method Reference: " + numberToHexStringUsingMethodReference.apply(323));


        //B. REFERENCE TO AN INSTANCE METHOD OF A PARTICULAR OBJECT

        String prefix = "Gruss Gott!";

        Function<String, String> connect = s -> prefix + s;

        //or we can use the method reference below, and it would be enough because Java will understands that we need to pass in a String,
        // and that it will also use the prefix; and then will concat the prefix to the string

        Function<String ,String> connectUsingMethodReference = prefix::concat;

        System.out.println(connectUsingMethodReference.apply("Herr Shmidt"));

        //C. REFERENCE TO AN INSTANCE METHOD OF AN ARBITRARY OBJECT OF A PARTICULAR TYPE
             //Here we will use a built-in functional interface we have not seen before
             //We will use an interface called BiFunction< >, and our goal we will compare two string inputs,
             //and I want to return a number (zero if they are equal, a positive number when the first string is bigger, or a negative number if the second string is bigger)

        //1. let's first use a lambda expression

        BiFunction<String, String, Integer> compareTwoStringsUsingLambdaExpression = (string1, string2) -> string1.compareToIgnoreCase(string2);

        System.out.println("Comparing two strings using Lambda expression: " + compareTwoStringsUsingLambdaExpression.apply("schlafen", "probieren"));

        //2. now let's use a method reference

        BiFunction<String, String, Integer> compareTwoStringUsingMethodReference = String::compareToIgnoreCase;

        System.out.println("Comparing two strings using a method reference: " + compareTwoStringUsingMethodReference.apply("Ich komme aus Ruanda", "Ich KOMME AUS RUANDA"));

        //D. REFERENCE TO A CONSTRUCTOR

        Supplier<ArrayList<String>> listSupplier = ArrayList::new; //Here we are using a method reference

        ArrayList<String> status = listSupplier.get();

        status.add("Verheiratet");
        status.add("ledig");

        System.out.println(status.get(0));
        System.out.println(status.get(1));



    }
}
