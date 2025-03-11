package interfaces2;

//1. This Fox class is extending a Mammal class (it is inheriting from the Mammal class)
//2. A class can implements more than 1 interface; Here it is implementing a Prey and a Predator Interfaces
//3. After implementing the interfaces, YOU MUST IMPLEMENT/WRITE their methods here, and make sure they are public


public class Fox extends Mammal implements Predator, Prey{
    @Override
    public void catchAndEat() {
        System.out.println("Fox is catching and eating Prey!");
    }

    @Override
    public void runAndHide() {
        System.out.println("Fox is running and hiding from Predator!");
    }

//4. Let's resolve the issues of two conflicting methods in Prey and Predator

    @Override
    public void run() {
        System.out.println("Fox is running!");
    }

    @Override
    public void breathe() {
        System.out.println("Fox breathing!");
    }
}
