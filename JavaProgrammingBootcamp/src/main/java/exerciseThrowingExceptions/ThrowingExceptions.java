package exerciseThrowingExceptions;

public class ThrowingExceptions {
    public static void main(String[] args) {
        validateNumber(-3);
    }

    public static void validateNumber(int number){

        if(number<0){
            throw new IllegalArgumentException("The number must be non-negative");
        }

        System.out.println("Done compiling!!!");
    }
}
