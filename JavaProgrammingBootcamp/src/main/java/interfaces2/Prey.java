package interfaces2;

public interface Prey {
    void runAndHide();

//Let's give both this Prey interface and the Predator a similar DEFAULT METHOD we will call it Run(); check the Predator interface as well;

    default void run(){
        System.out.println("Prey is running!");
    }

}
