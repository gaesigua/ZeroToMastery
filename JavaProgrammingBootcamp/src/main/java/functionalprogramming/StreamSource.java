package functionalprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSource {
    public static void main(String[] args) {

        //1. Creating a stream from a collection

          //a. let's first create a simple List and pass values into the list (watch how we added Arrays.asList to make it a list and not an array)

        List<String> regelmasigeVerben = Arrays.asList("heissen", "wohnen", "kommen", "lieben", "probieren");

          //b. now let's create our stream

        Stream<String> regelmasigeVergenStream = regelmasigeVerben.stream();

        //2. Creating a stream from an Array

        String[] unregelmasigeVerben = {"schlafen", "essen", "lesen", "sprechen"};

        Arr
    }
}
