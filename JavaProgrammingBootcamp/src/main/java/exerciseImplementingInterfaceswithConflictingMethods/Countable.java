package exerciseImplementingInterfaceswithConflictingMethods;

public interface Countable {

    default void printInfo(){
        System.out.println("Countable info!");
    }
}
