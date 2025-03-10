package interfaces;

//1. Here we are creating a Predator interface, with its method catchAndEat()
//   Remember that methods of interfaces don't need the "public" modifier, since interfaces are public already
//   Methods also don't have fields/body

//
public interface Predator {

    void catchAndEat();

//2. We can also create a DEFAULT METHOD; a default method is a method that has default implementation in the interface;
     //Default methods in short are methods in interfaces, with a body, with curly braces;

    default void eat(Prey p){

        System.out.println("Eating: " + p.getClass().getName());

    }

}



