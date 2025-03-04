package exerciseMethodsonTheStringClass;

public class StringMethods {
    public static void main(String[] args) {
        String begrussung = "Hello, World";

        int begrussungLength = begrussung.length();
        String begrussungUpper = begrussung.toUpperCase();
        String begrussungLower = begrussung.toLowerCase();
        String begrussungSubstring = begrussung.substring(7, 12);
        String begrussungReplace = begrussung.replace("World", "Java");

        System.out.println("The Length: " + begrussungLength);
        System.out.println("UpperCased: " + begrussungUpper);
        System.out.println("LowerCased: " + begrussungLower);
        System.out.println("Substring: " + begrussungSubstring);
        System.out.println("Replaced: " + begrussungReplace);
    }
}
