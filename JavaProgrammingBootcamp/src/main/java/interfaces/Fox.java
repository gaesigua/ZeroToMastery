package interfaces;

public class Fox extends Mammal implements Predator, Prey{
    @Override
    public void catchAndEat() {
        System.out.println("Fox is catching and eating prey!");
    }

    @Override
    public void runAndHide() {
        System.out.println("Fox is running and hiding from Predator");
    }


    //Here since we have a method run() implemented from Prey, and a method run() implemented from Predator, there's conflict,
    // so in order to resolve the issue, we must specify the method we want to call/use, hence we use override and we write our own method here

    @Override
    public void run(){
        System.out.println("Fox is running!!");
    }
}
