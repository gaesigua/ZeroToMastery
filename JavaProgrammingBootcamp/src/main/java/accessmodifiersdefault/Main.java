package accessmodifiersdefault;

public class Main {
    public static void main(String[] args) {

        Frau person = new Frau();

        person.x = 8;
        person.name = "gaesigua";

        person.getX();
        person.setName(person.name);


        //1. We cannot access the private void tellSecret() method here
        // because it is a PRIVATE method, and can only be accessed within the class it belongs to (Frau class)

        //person.tellSecret("this is my secret message");



    }
}
