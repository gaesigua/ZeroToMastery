package exerciseCheckedvsUncheckedExceptions;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

        try {

            validateString("");
        }catch (EmptyStringException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Done!!");
    }
    public static void validateString(String text) throws EmptyStringException{

        if (text.isEmpty()){
            throw new EmptyStringException("The text is empty!");
        }else {
            System.out.println(text);
        }
    }
}
