package exerciseSuperandThis;

public class Dog extends Animal{
    private String breed;


    public Dog(String species, int age, String breed){
        super(species, age);
        this.breed = breed;
    }
    public Dog(){
        this("Unknown", 0, "Unknown");
    }
}
