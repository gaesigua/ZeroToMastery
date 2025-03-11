package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> myShoppingList = new ArrayList<>();

        myShoppingList.add("Eggs");
        myShoppingList.add("Pasta");
        myShoppingList.add("Bananas");

        List<Integer> myZahlen = new ArrayList<>();

        myZahlen.add(10);
        myZahlen.add(100);
        myZahlen.add(1000);

        System.out.println("My Shopping List: " + myShoppingList);
        System.out.println("First Item: " + myShoppingList.get(0));
        System.out.println("Second Item: " + myShoppingList.get(1));
        System.out.println("Third Item: " + myShoppingList.get(2));


        System.out.println("My Numbers: " + myZahlen);
        System.out.println("The first number: " + myZahlen.get(0));
        System.out.println("The second number: " + myZahlen.get(1));
        System.out.println("The third number: " + myZahlen.get(2));

        boolean containsEggs = myShoppingList.contains("Eggs");
        System.out.println(containsEggs);

    }
}
