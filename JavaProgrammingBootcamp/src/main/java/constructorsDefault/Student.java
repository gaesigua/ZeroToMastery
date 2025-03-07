package constructorsDefault;

public class Student {

    private String name;
    private int age;

    //ALL JAVA Classes have a constructor, and if you don't create one, Java will create one for you: A default constructor
    //Keep in mind that adding:
    // public Student(){
    // } is not a default constructor; that means you have added the constructor yourself;
    //A default constructor gets added by Java when you don't create one yourself, during compilation
    //You can find the constructor, after compiling, go to target, classes, constructorsDefault, Student


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
