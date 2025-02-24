package variables;

public class ExampleCasting {
    public static void main(String[] args) {

        long myLongNumber= 123;

        //1. Let's perform "Narrowing Typecasting"

           //  int myIntNumber = l;       //this "Narrowing Typecasting" would create an error, because long is bigger than int, and it can not be stored inside int;

        //that's why, in order to perform "narrowing typecasting" we must add that data type in parentheses

        int i = (int) myLongNumber;

        //2. Same with Narrowing a Double to a Float

        double myDoubleNumber = 3.2;

        //Let's perform "Narrowing Typecasting"

        float myFloatNumber = (float) myDoubleNumber;

        //Let's try to perform another "Narrowing Typecasting" from a byte type to a char type

        byte b = 23;       //first we are storing a number into a byte type
        char c = (char) b; //second, we are performing Narrowing Typecasting to the byte type; this does not show any error, since char can store small numbers, but remember that these numbers are unicodes
        System.out.println(c); //now we print out

        int cWideningCasted = c; //Here we are performing Widening Typecasting to the printed c that was a char;
        System.out.println(cWideningCasted);

        //NOW BE CAREFUL HERE:

        char maxChar = 65535;
        // char myNewChar = maxChar + 1;  //this will give an error, since the maximum number a char type can store is 65535, and here we want to add 1.

        //BUT I CAN TYPECAST THAT

        char myNewChar = (char) (maxChar + 1);
        System.out.println(myNewChar); //As you can see in the console, this is not very helpful

        //IN SHORT, WE HAVE TO BE VERY CAREFUL WHEN WE ARE PERFORMING TYPECASTING, IN ORDER TO AVOID UNEXPECTED SURPRISES;









    }
}
