package constructorsUsingSuperandThis;

public class Person {

    //1. Let's create a private field for name

    private String name;

    //4. Now after creating the getters and setters, let's create 2 constructors, one without parameters, and another with parameters

    public Person(){


    }
    public Person(String name){
        this.name = name;
    }

    //2. Let's create the getter for name

    public String getName() {
        return name;
    }

    //3. Let's create the setter for name

    public void setName(String name) {
        this.name = name;
    }
}
