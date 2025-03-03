package workingwithstrings;

public class StringImmutability {
    public static void main(String[] args) {
        //1. Strings are IMMUTABLE Objects; Cannot be changed

        String s1 = "Guten Morgen";
        String s2 = s1;

        System.out.println(s1 + " " + s2);

        s1 = "Guten Abend";

        System.out.println(s1 + " " + s2);

        //2. MUTABLE OBJECTS
        Text text1 = new Text();

        text1.setDescription("einundsechzig");

        Text text2 = text1;

        System.out.println(text1.getDescription() + " " + text2.getDescription());

        text1.setDescription("ein hundert");

        System.out.println(text1.getDescription() + " " + text2.getDescription());





    }
}
