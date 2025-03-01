//Exercise: Find the Average of Odd Numbers in an Array Using Control Flow Statements

package exercisesControlFlowStatements8;

public class Main {
    public static void main(String[] args) {
        //1. extract numbers
        //2. extract odd numbers
        //3. find the average

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int oddNumber;
        int count = 0;
        int index;

        for(int number: numbers){
            if (number%2 ==1){
                oddNumber = number;
                index = numbers[0];
                sum=sum+oddNumber;
                count=count+index;


                System.out.println("The Count: " + count + "," + "The Odd Number: " + number);
            }

        }
        System.out.println("The Total Sum: " + sum);
        System.out.println("The Total Count: " + count);
        double average = (double) sum/count;
        System.out.println("The Average: " + average);
    }
}
