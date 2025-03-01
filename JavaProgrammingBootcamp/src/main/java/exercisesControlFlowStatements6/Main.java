//Exercise 6: Calculate the Sum of an Array Using a For-Each Loop

package exercisesControlFlowStatements6;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5,2,7,9,6};
        int sum=0;

        for (int i: numbers){
            sum=sum+i;
        }
        System.out.println("The sum: " +sum);
    }
}
