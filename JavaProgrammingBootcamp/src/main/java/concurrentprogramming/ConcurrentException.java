package concurrentprogramming;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentException {
    public static void main(String[] args) {
        List<String> sprachen = new ArrayList<>();

        sprachen.add("Deutsch");
        sprachen.add("C#");
        sprachen.add("Englisch");
        sprachen.add("Kinyarwanda");
        sprachen.add("Java");

        for (String sprache: sprachen){
            sprachen.add("new"); //THIS WILL PRODUCE AN EXCEPTION
            //and this is where CONCURRENT COLLECTIONS COME INTO PLAY

            //See the ConcurrentCollectionsJava class in the same package

            //we could fix the exception/error above by changing the new ArrayList<>() to new CopyOnWriteArrayList<>();


        }
    }
}
