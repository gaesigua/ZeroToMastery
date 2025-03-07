package constructorsCustom;

public class Student {

    private String name;
    private int age;

    //1. A custom constructor is when we create our own constructor of a class
    //2. Custom constructors typically can take one or more arguments/parameters


    //4. Ok Let's create a custom constructor with 2 parameters name and age

    public Student(String name, int age){

        this.name = name;
        this.age = age;
    }

    //4. Classes can have more than one constructor; as long as they have different parameters (meaning different signature)
    //   Let's add another field, and create a second constructor of the class, with different parameters than the first one

    private String studentNr;

    public Student(String name, int age, String studentNr){
        this.name = name;
        this.age = age;
        this.studentNr = studentNr;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
}
