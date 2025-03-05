package oopEncapsulation;

public class Animal {

    //These fields are shared by different animals (Cat, Dog, Cow)
    //Inheritance minimizes duplicate codes; meaning you can define all the properties shared by other classes (child classes) into one class (parent class)

    //1. To perform Encapsulation: Let's set these fields to private; this means that they can normally be accessed only within this Animal class

    private String name;
    private int age;
    private int nrbOfEyes;

    //2. To allow access to the private fields above, we must use the getters and setters; the fastest way is to right click, click Generate, then Setters and Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNrbOfEyes() {
        return nrbOfEyes;
    }

    public void setNrbOfEyes(int nrbOfEyes) {
        this.nrbOfEyes = nrbOfEyes;
    }


    //This method is an action

    public void eat(){

    }
}
