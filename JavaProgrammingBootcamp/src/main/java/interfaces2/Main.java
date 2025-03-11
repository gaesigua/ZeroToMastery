package interfaces2;

public class Main {
    public static void main(String[] args) {
        //1. We can't instantiate the Animal class here because it is an abstract class
             // Animal animal = new Animal();

        //2. But I could instantiate the child class of the Animal class

        Animal animal = new Fox();


    }
}
