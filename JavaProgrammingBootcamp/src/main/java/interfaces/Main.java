package interfaces;

public class Main {
    public static void main(String[] args) {

        //1. Here we cannot instantiate the Animal class, because it is an abstract class;

        //Animal animal = new Animal();

        //2. BUT we could instantiate a child of the Animal class;

        Animal animal = new Bird();



    }
}
