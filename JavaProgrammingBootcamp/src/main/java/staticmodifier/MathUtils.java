package staticmodifier;

public class MathUtils {

    //STATIC MODIFIER is used to indicate that a member belongs to the class itself, rather than to any instance of the class;
    // STATIC can be accessed by a non-static, but static can not access a non-static

    //1. let's create a STATIC double pi variable;


    public static double pi = 3.14159265359;

    //2. let's create a STATIC method with 2 parameters;

    public static double subtract(double a, double b){

        return a-b;
    }
}
