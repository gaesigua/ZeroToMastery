package exercisesObjects2;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.name = "gaesigua";
//
//
//        Car car = new Car();
//        car.model = "Benz S Class";
//        Person owner = new Person();
//
//
//        owner.name = person.name;
//
//
//        System.out.println("The Model: " + car.model + "," + " The Owner: " + owner.name);

        //We could have done it this way:

        Car car = new Car();
        car.model = "Audi";

        Person owner = new Person();
        owner.name = "gaesigua tin";

        car.owner = owner;


        System.out.println("The Model: " + car.model + "," + " The Owner: " + car.owner.name);





    }
}
