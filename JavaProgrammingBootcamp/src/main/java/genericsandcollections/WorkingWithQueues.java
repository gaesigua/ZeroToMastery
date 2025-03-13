package genericsandcollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Deque<String> myProgrammingLanguages = new ArrayDeque<>();

        myProgrammingLanguages.add("C#");
        myProgrammingLanguages.add("Java");
        myProgrammingLanguages.add("MySQL");
        myProgrammingLanguages.add("HTML");
        myProgrammingLanguages.add("CSS");

        //1. Let's print out the elements first

        System.out.println(myProgrammingLanguages);

        //2. Let's extract one element; Remember this will start by the first element;

        myProgrammingLanguages.pop();

        //3. Let's print the Queue again and see the new result
             //In a Queue, when the elements are added, they are added to the end;
             //meanwhile when they are removed(popped), they are removed from the top/start of the queue;

        System.out.println("Popped out an element: "+ myProgrammingLanguages);

        //4. Let's add 2 new elements

        myProgrammingLanguages.add("Angular JS");
        myProgrammingLanguages.add("SQL");

        System.out.println("Added 2 new elements: "+ myProgrammingLanguages);

        //5. We can also do a peek

        myProgrammingLanguages.peek();

        System.out.println("Peek: "+ myProgrammingLanguages);

        //6. Let's poll/remove/extract the last element

        myProgrammingLanguages.pollLast();

        System.out.println("PollLast: " + myProgrammingLanguages);


        //7. Let's poll/remove/extract the first element

        myProgrammingLanguages.pollFirst();

        System.out.println("PollFirst: " +myProgrammingLanguages);


    }
}
