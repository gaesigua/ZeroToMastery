package exerciseImplementingInterfaceswithConflictingMethods;

public class Rectangle implements Drawable, Countable{
    @Override
    public void draw() {

    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle info!");
    }
}
