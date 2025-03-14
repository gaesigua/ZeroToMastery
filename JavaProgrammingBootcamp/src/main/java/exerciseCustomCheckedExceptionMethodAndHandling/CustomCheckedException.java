package exerciseCustomCheckedExceptionMethodAndHandling;

public class CustomCheckedException {
    public static void main(String[] args) {

        try{
            validateAge(150);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Done compiling!");
    }
    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 0 || age > 120){
           throw new InvalidAgeException("The Age is invalid!");
        }
    }
}
