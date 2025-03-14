package exerciseUsingClassesWithGenerics2;

import exerciseGenericsParameterizedClass.Box;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        Box<String> stringBox = new Box<>();

        intBox.setContent(8);
        stringBox.setContent("haufige redemittel!");
    }
}
