package genericsandcollections;

import java.util.HashMap;
import java.util.Map;

//1. Map interface is a bit different than the other interfaces Set, Queue, List
//2. List, Set, Queue interfaces inherit from the collection framework/class,
//3. Map does not inherit from the collection framework/class;
//4. Map is made to store Key-Value pairs
//5. Using the Map methods, the user can add, retrieve, remove elements from the map;


public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<String, Integer> namesAgesMap = new HashMap<>();

        namesAgesMap.put("gaesigua", 87);
        namesAgesMap.put("tina", 29);
        namesAgesMap.put("lionel", 39);
        namesAgesMap.put("michael", 59);

//6. Let's print out our map

        System.out.println("My Map: " + namesAgesMap);

//7. Let's print out the value of the first element

System.out.println(namesAgesMap.get("gaesigua"));

//8. Let's print out all the values; be careful here, since it's like an array of key and value, we will have to use a for loop
        //The HashMap has its own way of printing out the values, so be careful

        for (Integer i: namesAgesMap.values()){
            System.out.println(i);
        }

//9. Let's print out all the Keys now;

        for (String s: namesAgesMap.keySet()){
            System.out.println(s);
        }

//10. With the Keys, I also have access to the values as well

        for (String x: namesAgesMap.keySet()){
            System.out.println(x + " : " + namesAgesMap.get(x));
        }

//11. We can also loop using the Entry Set

        for (Map.Entry<String, Integer> integerEntry: namesAgesMap.entrySet()){
            System.out.println(integerEntry.getKey());
            System.out.println(integerEntry.getValue());
        }

//12. Let's remove a value, and then update it

        namesAgesMap.remove("gaesigua");

        namesAgesMap.put("gaesigua", 120);

        System.out.println(namesAgesMap);



    }
}
