//Exercise: Pass Object to a Method
package exercisesObjects5;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Axel Kayonga";
        person.age = 29;

        System.out.println("Name Before: " + person.name + "," + "Age: " + person.age);

        modifyPerson(person);

        System.out.println("Name After: " + person.name + "," + "Age: " + person.age);
    }
    public static void modifyPerson(Person p){
        p.name = "Ted Roosevelt";
        p.age = 120;
    }
}
