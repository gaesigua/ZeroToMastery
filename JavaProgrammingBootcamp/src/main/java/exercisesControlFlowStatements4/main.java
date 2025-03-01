//Exercise 4: Print the First N Even Numbers Using a While loop

package exercisesControlFlowStatements4;
public class main {
    public static void main(String[] args) {
        int n = 19;
        int counter = 0;
        int i = 0;

        while(counter<n){

            if (i%2 ==0 ){
                System.out.println("The Numbers from 0 to " + n + " are: " + i);
                counter++;
            }
            i++;

        }
    }
}