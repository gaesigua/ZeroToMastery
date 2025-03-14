package exerciseThrowingExceptions2;

public class ThrowingExceptions {
    public static void main(String[] args) {

    }
    public void validateNumber(int number){

        if (number < 0){
            throw new IllegalArgumentException("Must be a non-negative number!");
        }

    }
}
