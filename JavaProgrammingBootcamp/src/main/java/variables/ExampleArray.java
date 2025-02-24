package variables;

public class ExampleArray {
    public static void main(String[] args) {

        //1. Let's create an int Array

        int[] myNumbers = {3,8,2,9,10,21,38,50};

        //2. Let's print out the fourth value of the Array

        System.out.println(myNumbers[3]);

        //3. Let's override that fourth value with a new number

        myNumbers[3] = 99;

        System.out.println(myNumbers[3]);



    }
}
