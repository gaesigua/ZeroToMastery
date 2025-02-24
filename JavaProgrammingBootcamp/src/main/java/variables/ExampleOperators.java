package variables;

public class ExampleOperators {
    public static void main(String[] args) {

        //1. Arithmetic Operators

        double x = 2;  //this is one operand
        double y = 3;  //this is another operand

        //Add

        double z = x + y;

        System.out.println(z);

        //Subtract
        System.out.println(x-y);

        //Multiply

        System.out.println(x*y);

        //Divide
        double d = x/y;
        System.out.println(d);

        //Modulus

        int number1 = 10;
        int number2 = 4;

        int modulusResult = number1 % number2;
        System.out.println("The Modulus: " + modulusResult);

        //2. Assignment Operators

        int number3 = 7;   //this is an assignment operator
        int number4 = 70;  //this is a second assignment operator

        number3 += number4;   //this is another assignment; Here we are both increasing the number 3 and then assigning;
        System.out.println(number3);

        number3 -= number4;  // Here we are both decreasing the number 3 (we obtained above = 77) and then assign

        System.out.println(number3);

        //3. Unary Operators (Only have ONE OPERAND)
            //they are used to increment, decrement, or negate the operand

        //increment
        int number5 = 8;
        number5++;

        System.out.println(number5);

        //decrement

        int number5b = 9;
        number5b--;

        System.out.println(number5b);

        //negate

        int number6 = 32;

        System.out.println(-number6);

        System.out.println(number6);  //The "negate" we did in the previous line does not change the value as the decrement would

        //pre increment and post increment

        int pre = 5;
        int post = 5;

        System.out.println("Pre-Increment: " + ++pre);
        System.out.println("Post-Increment: " + post);

        System.out.println("Second Pre-Increment: " + ++pre);
        System.out.println("Second Post Increment: " + post);

        //4. Relational Operators

        int smallNumber = 2;
        int bigNumber = 10;

        System.out.println(smallNumber==bigNumber);
        System.out.println(smallNumber!=bigNumber);

        System.out.println(smallNumber>=bigNumber);
        System.out.println(smallNumber>bigNumber);
















    }
}
