package workingwithstrings;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Hallo");
        stringBuilder1.append(" ");
        stringBuilder1.append("Ich heisse");
        stringBuilder1.append(" ");
        stringBuilder1.append("gaesigua tin");
        stringBuilder1.append(" ");
        stringBuilder1.append("Ich bin Sechsundneunzig Jahre alt");
        stringBuilder1.append(" ");
        String germanIntro = stringBuilder1.toString();

        System.out.println(germanIntro);
    }
}
