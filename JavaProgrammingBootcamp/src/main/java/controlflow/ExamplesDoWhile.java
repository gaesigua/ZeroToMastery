package controlflow;

import java.util.Scanner;

public class ExamplesDoWhile {
    public static void main(String[] args) {
// A DO WHILE LOOPS BASICALLY MEANS DO THE ACTION AT LEAST ONCE, AND THEN CHECK THE CONDITION

// 1. This do while loop will first increase the count from 0 to 1,
    // and then print the result, and after checking the condition (if the result is below 10; then it will go ahead and increase the count and print the result a second time
        // and so on, until the condition stops being true (the count becomes equal or bigger than 10)
//        int count = 0;
//
//        do {
//            count++;
//            System.out.println("The count is: " + count);
//        }while (count<10);

// 2. Now Let's do a Do while loop accepting a user input (name), and then check if the name entered is less than 2 characters;
// So we will do the action first (receive the user input), and then do a while loop (make them repeat until they enter more than 2 characters)

        Scanner scanner = new Scanner(System.in);

        String name;

        do {
            System.out.println("Enter Your Name: ");
            name = scanner.nextLine();
        }while (name.length() < 2);

    }
}
