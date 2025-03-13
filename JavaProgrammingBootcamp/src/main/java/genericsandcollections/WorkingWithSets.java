package genericsandcollections;

import java.util.HashSet;
import java.util.Set;


//1. A Set extends the Collection class as well; and REMEMBER YOU CANNOT CREATE AN INSTANCE OF AN INTERFACE(List, Set),
     //instead ArrayList or HashSet are classes, and we create their instances;

//2. A set must have unique elements (not like a list that can hold similar numbers);
// if you try to add similar elements to a set, it will not crush; but it will keep only the first ones;


public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Integer> meineZahlenSet = new HashSet<>();

        meineZahlenSet.add(1);
        meineZahlenSet.add(3);
        meineZahlenSet.add(5);
        meineZahlenSet.add(7);
        meineZahlenSet.add(9);
        meineZahlenSet.add(11);

//3. Let's print out the elements of the set; this will be printed as an array

        System.out.println(meineZahlenSet);

//4. Now Let's print out each elements of the set; this will be printed

        for (Integer i: meineZahlenSet){
            System.out.println(i);
        }

//5. The indexes in a set are not set; so you can not just extract one index, so the code below would not work
        // System.out.println(meineZahlenSet.get(0));


    }
}
