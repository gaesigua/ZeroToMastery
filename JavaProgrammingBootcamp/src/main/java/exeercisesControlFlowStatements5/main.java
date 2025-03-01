//Exercise 5: Print a Sequence of Numbers Using a Do-While Loop

package exeercisesControlFlowStatements5;

public class main {
    public static void main(String[] args) {

        int n = 25;
        int i=1;

        do {
            System.out.println("The sequence numbers: " + i);
            i++;
        }while (i <= n);

    }
}
