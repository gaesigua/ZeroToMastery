package exerciseCollectionFrameworkSet;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> myZahlenSet = new HashSet<>();

        myZahlenSet.add(5);
        myZahlenSet.add(25);
        myZahlenSet.add(50);
        myZahlenSet.add(75);

        System.out.println(myZahlenSet);
    }
}
