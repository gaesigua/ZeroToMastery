package main;

import animals.Animal;

//Since we want to access a PROTECTED string species field from the animal class that does not belong in the same package as this Dog class,
// We have to "extends" that class in order to inherit its properties by using "extends " and "import"

public class Dog extends Animal {

    public void printSpecies(){

        //if String species was a default, and not protected, we would have an error because species is in a different package;
        System.out.println(species);
    }

}