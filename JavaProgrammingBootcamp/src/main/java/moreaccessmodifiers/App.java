package moreaccessmodifiers;

import accessmodifiersprivate.Person;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Michael Jordan";
        p.sayHi();
    }
}
