package interfaces2;

//1. Let's create an Abstract class;
//   Abstract classes CANNOT BE INSTANTIATED directly;
//   They only serve a base class, that other classes can inherit from;

public abstract class Animal {

    private double weight;

    public void eat(){
        System.out.println("Animal eating!");
    }

    public abstract void breathe();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
