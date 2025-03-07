package constructorsInheritance;

public class App {
    public static void main(String[] args) {

        Car car = new Car();

        //This will call both constructors, starting with Vehicle (parent)

        //So how does this work? let's look deeper by going through the debug mode

        //ALWAYS REMEMBER THIS: The first call in a constructor is ALWAYS another constructor
        //This means: the car() will first call the Vehicle() constructor, then after going through the constructor, it will come back and run its own constructor
        //This is done by JAVA; It adds a super() when there is no constructor CALL inside the constructor explicitly;
        // meaning if there is no this() statement (always as the first statement inside the constructor), Java creates a super() call
    }
}
