package interfaces;

public class Ladybug extends Insect{

//Since ladybug inherits from insect, we can override the method breathe() here


    @Override
    public void breathe() {
        System.out.println("Ladybug breathing!!");
    }
}
