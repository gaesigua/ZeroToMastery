package oopEncapsulation;

public class Animal {

    //These fields are shared by different animals (Cat, Dog, Cow)
    //Inheritance minimizes duplicate codes; meaning you can define all the properties shared by other classes (child classes) into one class (parent class)

    //1. To perform Encapsulation: Let's set these fields to private; this means that they can normally be accessed only within this Animal class

    private String name;
    private int age;

    //let's refactor this String height to int height, by using "Generate" then "Type Migration", then enter "int" instead of just clicking "Rename";
    // type migration allows to change all the places with "String" to "int"
    private int height;
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
        //Let's make sure we will work with only age above Zero by validating the age above 0; we don't want negative age
        if(age>0){
            this.age = age;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNrbOfEyes() {
        return nrbOfEyes;
    }

    public void setNrbOfEyes(int nrbOfEyes) {
        this.nrbOfEyes = nrbOfEyes;
    }


    //This method is an action

    public void eat(){

        System.out.println("Animal is eating!!");

    }
}
