package interfaces;

//1. Here we are creating a Prey interface, with its method runAndHide()
//   Remember that methods of interfaces don't need the "public" modifier, since interfaces are public already
//   Methods also don't have fields/body

public interface Prey {
    void runAndHide();


//Let's create a default method exactly the same as in the Predator
    //Remember that the Fox class implements both interfaces(Prey, Predator), which means there's conflict inside the Fox class
    //So to resolve the conflict, we must override the method inside the Fox class

    default void run(){
        System.out.println("Prey is running!!");
    }
}
