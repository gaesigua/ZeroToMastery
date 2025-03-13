package exceptionhandling;

//CREATING CUSTOM EXCEPTIONS
   //You can create custom exceptions to provide meaningful error messages and to handle specific error conditions in your application;

//1. LET'S CREATE A CUSTOM EXCEPTION

public class WrongInputException extends Exception{

//2. Let's create 3 constructors: One with no arguments, One that accepts a string message, and one that accepts another exception

    //a. A constructor with no argument

    public WrongInputException(){

        super();
    }

    //b. A constructor that accepts a string message

    public WrongInputException(String message){

        super(message);
    }

    //c. A constructor that accepts another exception

    public WrongInputException(Exception e){

        super(e);
    }

}
