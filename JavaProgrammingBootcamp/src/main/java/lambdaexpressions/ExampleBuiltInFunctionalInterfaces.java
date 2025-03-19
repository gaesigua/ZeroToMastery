package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleBuiltInFunctionalInterfaces {
    public static void main(String[] args) {

        //1. Let's create an instance of our Supplier example
            //WARNING HERE: HERE WE ARE CREATING AN INSTANCE IN A NORMAL WAY, BUT THIS IS NOT HOW WE SHOULD BE DOING
            // WE ARE SUPPOSED TO USE LAMBDA EXPRESSION

        SupplierExample supplierExample = new SupplierExample();

        supplierExample.get();

        //2. NOW LET'S TRY TO CREATE AN INSTANCE OF Supplier USING A LAMBDA EXPRESSION

        Supplier<String> stringSupplier = () -> "Regelverben";

        //3. NOW LET'S TRY TO CREATE AN INSTANCE OF Consumer USING A LAMBDA EXPRESSION

        Consumer<String> consumer = (s) -> System.out.println(s);

        consumer.accept("unregelverben");

        //4. NOW LET'S TRY TO CREATE AN INSTANCE OF Predicate USING A LAMBDA EXPRESSION

        Predicate<String> predicate = (myString) -> myString.equals("sehen");
        System.out.println("schlafen");

        //5. NOW LET'S TRY TO CREATE AN INSTANCE OF Function USING A LAMBDA EXPERESSION

        Function<String, Integer> function = (myString) -> myString.length();
        System.out.println(function.apply("machen"));
    }
}
