package workingwithstrings;

public class ExampleStringEquality {
    public static void main(String[] args) {
        String s1 = "Eins Sieben Acht Acht Funf Funf Noll Funf Sechs Zwei!";

        String s2 = "Eins Sieben Acht Acht Funf Funf Noll Funf Sechs Zwei!";

        String s3 = new String("Eins Sieben Acht Acht Funf Funf Noll Funf Sechs Zwei!");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
