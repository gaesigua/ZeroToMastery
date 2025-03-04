package exerciseComparingStrings;

public class CompareStrings {
    public static void main(String[] args) {
        String komme = "Ich komme aus Ruanda";
        String vohne = "Ich vohne in Berlin";

        System.out.println(komme.equals(vohne));
        System.out.println(komme == vohne);

        String status = "Ich bin ledig";
        String maritalStatus = "Ich bin ledig";

        System.out.println(status.equals(maritalStatus));
        System.out.println(status == maritalStatus);

    }
}
