package staticmodifier;

public class Main {
    public static void main(String[] args) {

// DEALING WITH STATIC Modifier
        //1. REMEMBER that a STATIC method can directly call another STATIC variable in the same package, without the need to create an instance of that Class

        //this below would give something that looks like an error, asking you to create a local variable
        //MathUtils.pi;

        System.out.println(MathUtils.pi);

        double result = MathUtils.subtract(8,2);

        System.out.println(result);


        //2. We can also create an instance as usual to access the members of the MathUtils class, but it is not the best practice

        MathUtils mathUtils = new MathUtils();

        System.out.println(mathUtils.pi);
        System.out.println(mathUtils.subtract(20,10)); //Intellij will not even suggest the steps since this is not the best practice

    }
}
