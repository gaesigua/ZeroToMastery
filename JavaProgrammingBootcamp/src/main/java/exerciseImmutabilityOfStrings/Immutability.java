package exerciseImmutabilityOfStrings;

public class Immutability {
    public static void main(String[] args) {
        String germanIntro1 = "Hallo, Ich heisse gaesigua";

        String germanIntro1UpperCase = germanIntro1.toUpperCase();

        System.out.println("German Intro: " + germanIntro1);
        System.out.println("Modified German Intro: " + germanIntro1UpperCase);
    }
}
