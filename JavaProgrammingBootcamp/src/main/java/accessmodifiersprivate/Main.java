package accessmodifiersprivate;

import accessmodifiersdefault.Frau;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "gaesigua";

        p.sayHi();

        //1. We can't access the String secret from the Person class, because secret is PRIVATE
                // p.secret = "heute morgen zwei";
        //2. We can't access the tellSecret method either, because it is also PRIVATE
                // p.tellSecret();

        //3. Let's say we want to access the default variable String name from the other package accessmodifierdefault;
        //   remember that default modifiers can only be accessed with the SAME PACKAGE;
        //   So creating an instance of the Person class, and try to call the default String name will not work
        //   It will produce an error that the name is not public and cannot be accessed

        Frau woman = new Frau();

        // woman.name = "Elisa";


    }
}
