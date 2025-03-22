package functionalprogramming;

import javax.swing.text.html.Option;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminal {
    public static void main(String[] args) {

        //IN THE PREVIOUS COURSE (Source Operations), we learned how to create streams

        //Here below is an example of 2 streams I created using a collection (list)

        List<String> unregelmasigeVerben = Arrays.asList("schlafen", "essen", "lesen", "sein", "bringen", "gehen");
        List<String> regelmasigeVerben = Arrays.asList("studieren", "antworten", "wohnen" , "kommen" , "heissen");

        Stream<String> unregelmasigeVerbenStream = unregelmasigeVerben.stream();
        Stream<String> regelmasigeVerbenStream = regelmasigeVerben.stream();

        //1. Now using FOR-EACH, let's try use that on the UNREGELMASIGEVERBENSTREAM and perform AN ACTION on each ELEMENT IN THE STREAM

        unregelmasigeVerbenStream.forEach(System.out::println);


        //2. Now using COUNT(), let's try use that on the UNREGELMASIGEVERBENSTREAM and count what's inside
             //WARNING: Here we are trying to use the stream again, and it is not allowed because as soon as the operation is done, streams gets closed immediately
             // unregelmasigeVerbenStream.count(); will produce an exception/error

        //so we will have to create a new stream

         long numberOfVerben = unregelmasigeVerben.stream().count();

         //3. Now using min() and max(), we can return the minimum and maximum elements in the stream
              //inside the min() method we will be asked to use the comparator; the comparator is needed to figure out how to determine min and max;
              // a comparator is a special method that takes in two elements and then returns an integer
              // so we will pass in two strings as a lambda expression
              // and the moment we pass in the elements/strings, it gives an error saying the required type should be a string, when we should provide an "Optional"

        Optional<String> min = unregelmasigeVerben.stream().min((string1, string2) -> string1.compareToIgnoreCase(string2) );

        Optional<String> max = regelmasigeVerben.stream().max((string1, string2) -> string1.compareToIgnoreCase(string2));

              //we can use a method reference as well, instead of a lambda expression

        Optional<String> min2 = unregelmasigeVerben.stream().min(String::compareToIgnoreCase);
        Optional<String> max2 = regelmasigeVerben.stream().max(String::compareToIgnoreCase);

        System.out.println("The minimum using lambda expression: "+ min.get());
        System.out.println("The minimum using method reference: "+ min2.get());
        System.out.println("The maximum using lambda expression: " + max.get());
        System.out.println("The maximum using method reference: " + max2.get());

        //4. Now using allmatch, let's check if all the elements in the stream match a given predicate
           //Let's first create a new stream

        boolean allBiggerThan5 = regelmasigeVerben.stream().allMatch(stringX -> stringX.length() > 5);

        System.out.println("Are All Strings Bigger Than 5: " + allBiggerThan5);

        //5. Now using anymatch, let's check if any of the elements in the stream match a given predicate
           //Let's first create a new stream

        boolean anyBiggerThan5 = unregelmasigeVerben.stream().anyMatch((s1)-> s1.length()> 5);

        System.out.println("Is there Any String Bigger Than 5: " + anyBiggerThan5);


        //6. Now using nonematch, let's check if none of the elements in the stream match a given predicate
           //Let's first create a new stream

        boolean noneIsBiggerThan20 = regelmasigeVerben.stream().noneMatch((stringT)-> stringT.length()> 20);

        System.out.println("None Of The Strings Are Bigger than 20: " + noneIsBiggerThan20);


        //7. Now using collect; let's TRANSFORM the stream into a different data structure, such as a List, Set, or Map

        //Let's first create a stream from a newly created list

        List<String> meineNeueListe = Arrays.asList("Verbkonjugation", "Verbstamm","Endung");

        List<String> meineneueuListeStream = meineNeueListe.stream().collect(Collectors.toList());

        //OR

        List<String> meineneueuListeStream2 = meineNeueListe.stream().toList();



        //8. Now using reduce, let's APPLY a BINARY OPERATOR to the elements in the stream, reducing them to a single value

        Optional<String> unregelmasigeVerbenStreamAndReduced = unregelmasigeVerben.stream().reduce(String::concat);

        System.out.println("Unregelmasige Reduced: " + unregelmasigeVerbenStreamAndReduced.get());







    }
}
