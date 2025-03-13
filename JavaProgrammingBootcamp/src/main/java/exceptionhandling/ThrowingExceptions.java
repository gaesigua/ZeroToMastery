package exceptionhandling;

import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) throws Exception {
        divide(2,0);
    }
    public static void divide(int a, int b) throws IOException {

        if(b==0){
            throw new ArithmeticException("Oops! You can't divide a number by 0!");
        }else {
            System.out.println("a divided by b equals: " + a / b);
        }
    }
}
