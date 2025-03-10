package interfaces;

//1. Let's create a Predator interface, with its Abstract(missing body) method catchAndEat()

// Methods of interfaces don't need the "public" modifier, since interfaces are public already
// Methods also don't have fields/body

public interface Predator {

    void catchAndEat();

//2. We can also create a DEFAULT METHOD; a default method is a method that has a body, with curly braces; and the default method is implemented in the interface as well;

    default void eat(Prey p){

        System.out.println("Eating: " + p.getClass().getName());

    }

//3. Let's give this interface a default method run()

    default void run(){
        System.out.println("Predator is running!!");
    }

}



