package exerciseHandlingExceptionsTryCatch;

import exerciseThrowingExceptions.ThrowingExceptions;

public class HandlingExceptions {
    public static void main(String[] args) {
        try{
            ThrowingExceptions.validateNumber(-235);

        }catch(IllegalArgumentException e){

            System.out.println(e.getMessage());
        }
        System.out.println("Done compiling!");
    }
}
