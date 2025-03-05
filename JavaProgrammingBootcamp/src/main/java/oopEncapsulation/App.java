package oopEncapsulation;

public class App {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.eat(); //since the animals share all the properties, calling the methods is also the same

        cat.eat(); //since the animals share all the properties, calling the methods is also the same

        cow.eat();


    }
}
