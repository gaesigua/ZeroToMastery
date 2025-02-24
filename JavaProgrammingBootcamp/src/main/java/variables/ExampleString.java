package variables;

import java.util.Locale;

public class ExampleString {
    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = "Hello";
        String s3 = "Morning";
        String sTotal = s1 + s2 + s3;

        //Let's change if String s1 equals to String s2
        boolean same = s1.equals(s2);
        System.out.println(same);

        //Let's change String s2 to all uppercase

        String upperCased = s2.toUpperCase();
        System.out.println(upperCased);

        //Let's extract(substring) a string from String s3, starting at position 4;

        String subString = s3.substring(4);
        System.out.println(subString);

        //Let's extract (substring) a string from String sTotal, starting at position 1, and stops at position 11 (REMEMBER THAT THE 11 GETS EXCLUDED)

        String subStringTotal = sTotal.substring(1,11); //Here it starts counting from position 1, and stops at position 10
        System.out.println(subStringTotal);

        //Let's change whether our String s1 starts with the character H or not

        boolean startsWith = s1.startsWith("H");
        System.out.println(startsWith);

        //Let's count how long our String sTotal is

        int length = sTotal.length();
        System.out.println(length);

        //Let's find out which character is at a position 5 of our String sTotal

        char charAtPosition5 = sTotal.charAt(5);
        System.out.println(charAtPosition5);




    }
}
