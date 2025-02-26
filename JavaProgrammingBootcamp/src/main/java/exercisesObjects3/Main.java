package exercisesObjects3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Michael Jordan";
        person.age = 60;

        System.out.println("Before: " + person.name + "," + person.age);

        updatePerson(person);
        System.out.println("After: " + person.name + "," + person.age);
    }
    public static void updatePerson(Person p){
        p.name = "Lionel Messi";
        p.age = 38;
    }
}
