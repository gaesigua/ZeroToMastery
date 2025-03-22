package functionalprogramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {

        List<String> sichVorstellen = Arrays.asList("Ich heisse gaesigua", "Ich wohne in Kigali", "kommst du aus Kicukiro");

        //1. using filter: filters the stream based on a predicate

        Stream<String> introStartsWith = sichVorstellen.stream().filter(subject -> subject.startsWith("k"));

        System.out.println("The introduction that starts with K: " + introStartsWith);


        //2. using map: applies a function to each element in the stream

        Stream<Integer> introLength = sichVorstellen.stream().map(String::length);


        //3. using flatmap: it applies a function to each element in the stream and flattens the resulting streams into one single stream

        List<List<String>> sichVorstellen2 = Arrays.asList(Arrays.asList("Ich bin gaesigua", "Ich wohne in Kigali"), Arrays.asList("Ich habe keine Kinder", "Ich have grosseltern"));

        Stream<String> flatSichVorstellen2 = sichVorstellen2.stream().flatMap(Collection::stream);

        System.out.println("My Flat SichVorstellen: " + flatSichVorstellen2);

        //4. using peak: it performs an action on each element in the stream without modifying the stream

        Stream<String> peekSichVorstellen = sichVorstellen.stream().peek(System.out::println);

        //5. using limit: limits the stream to a certain number of elements;

        Stream<String> limitedSichVorstellen = sichVorstellen.stream().limit(3);

        //6. using skip: it skips the first n elements in the stream

        Stream<String> skippedSichVorstellen = sichVorstellen.stream().skip(1);


        //7. using distinct: it removes duplicate elements from the stream

        Stream<String> distinctSichVorstellen = sichVorstellen.stream().distinct();

        //8. using sorted: it sorts the elements in the stream according to a comparator

        Stream<String> sortedSichVorstellen = sichVorstellen.stream().sorted(Comparator.naturalOrder());

    }
}
