package interfaces;

//1. Let's make our Animal class an Abstract class

public abstract class Animal {

//2. Let's give our animal a private field of weight(double)
    private double weight;

//3. Let's give our class, an abstract method

    public void eat(){
        System.out.println("Animal eating!!");
    }

//4. Let's create a public getter to get the private field of weight

    public double getWeight(){
        return weight;
    }

//5. Let's create a public setter to set the weight

    public void setWeight(double weight){
        this.weight = weight;
    }

//6. Let's create an abstract method
    //Immediately we will have issues with the classes that inherits from this Animal (Mammal, Insect, Bird)

    public abstract void breathe();

}
