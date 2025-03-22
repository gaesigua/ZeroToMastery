package functionalprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSource {
    public static void main(String[] args) {

        //WARNING 1: STREAMS CAN ONLY BE USED ONCE; AFTER A TERMINAL OPERATION, THE STREAM IS CLOSED;
        //WARNING 2: STREAMS ARE LAZILY EVALUATED; THIS MEANS THEY WILL NOT BE EXECUTED UNTIL A TERMINAL OPERATION IS CALLED


        //1. Creating a stream from a collection

          //a. let's first create a simple List and pass values into the list (watch how we added Arrays.asList to make it a list and not an array)

        List<String> regelmasigeVerben = Arrays.asList("heissen", "wohnen", "kommen", "lieben", "probieren");

          //b. now let's create our stream

        Stream<String> regelmasigeVergenStream = regelmasigeVerben.stream();

        //2. Creating a stream from an Array

        String[] regelmasigeVerben2 = {"heissen", "wohnen", "kommen", "lieben", "arbeiten", "warten", "antworten", "studieren", "probieren", "fragen"};

        Stream<String> regelmasigeVerbenStream = Arrays.stream(regelmasigeVerben2);

        //3. Creating a stream using the Stream.iterate() method

        //Here we want to create some kind of a list of infinite numbers, meaning we will increase the variable 1 infinetely by using a lambda expression n -> n+1,
        //but before that, we also need to specify the seed inside the Stream.iterate() method, meaning the number we are starting at. in our case we chose 0.

        Stream <Integer> infiniteNumbers = Stream.iterate(0, n->n+1);

        //4. Creating a stream using the Stream.generate() method

        //again we are going to create infinite numbers using the Stream.generate() method

        Stream<Double> randomNumbers = Stream.generate(Math::random);




    }
}
