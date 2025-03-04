package exerciseStringBuilderCreateCompareConcantenateAndReverseStrings;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Ich liebe dich");
        StringBuilder sb2 = new StringBuilder("Ich liebe dich");

        System.out.println("Using Equals: " + sb1.equals(sb2));
        String uppendedSb =sb1.append(" ").append(sb2).toString();

        System.out.println("Concatenated String: " + uppendedSb);

        System.out.println("Reversed Sb2: " + sb2.reverse());

    }
}
