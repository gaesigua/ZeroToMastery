package interfaces2;

public class Ladybug extends Insect{

// Let's OVERRIDE the method from the Insect class
    @Override
    public void breathe() {
        System.out.println("Ladybug breathing!");
    }
}
