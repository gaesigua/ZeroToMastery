package workingwithstrings;

import java.util.Locale;

public class ExampleStrings {
    public static void main(String[] args) {

//1. Length of a String class

        String begrussung = "Morgen: Hallo; Guten Morgen; Gruss Gott; Gruss Sie. Tag: Guten Tag. Abend: Guten Abend; Gute Nacht.";

        int begrussungLength = begrussung.length();

        System.out.println(begrussungLength);

//2. Print a character at a specific position

        char charInTheMiddle = begrussung.charAt(45);

        System.out.println(charInTheMiddle);

//3. Print the index of a String

        int indexOfAbend = begrussung.indexOf("Abend");

        System.out.println(indexOfAbend);
//4. Let's extract a small String using substring()

        String substringOne = begrussung.substring(0,20);

        System.out.println(substringOne);

//5. To UPPER CASE

        String begrussungUpperCased = begrussung.toUpperCase();

//6. TO LOWER CASE

        String begrussungLowerCased = begrussung.toLowerCase();

        System.out.println(begrussungLowerCased);


//7. To trim a String

        String blahblah = "         blah blah blah blah          ";

        String trimmedBlah = blahblah.trim();

        System.out.println(trimmedBlah);

        System.out.println(begrussungUpperCased);
    }
}
