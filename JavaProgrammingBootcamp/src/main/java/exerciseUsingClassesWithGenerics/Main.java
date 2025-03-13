package exerciseUsingClassesWithGenerics;

import exerciseGenericsParameterizedClass.Box;

public class Main {
    public static void main(String[] args) {

        Box<Integer> myIntBox = new Box<>();

        myIntBox.setContent(23);

        Box<String> myStringBox = new Box<>();

        myStringBox.setContent("Begrussungen");

    }
}
