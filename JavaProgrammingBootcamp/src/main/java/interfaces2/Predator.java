package interfaces2;

public interface Predator {

//1. This is an abstract method in the interface; It doesn't have a body or curly braces

    void catchAndEat();

//2. We can create a default method (meaning with a body, with parameters if we like)

    public default void eatAndPrey(Prey p){

        System.out.println("Eating: " + p.getClass());

    }

//3. Let's give both this Predator interface and the Prey a similar DEFAULT METHOD we will call it Run(); check the Prey interface as well;

    default void run(){
        System.out.println("Predator is running!");
    }
//As soon as we create similar methods in Prey and Predator, the Class Fox has an error because it implements both, and there's confflic

}
