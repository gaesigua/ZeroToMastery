package exceptionhandling;

//1. Java throws an exception when something goes wrong;
//2. Exceptions are not supposed to happen but they happen sometimes during the execution of a program
//3. Exceptions are special Java Objects
//4. They are used to signal that something unexpected has happened

//5. Checked vs Unchecked Exceptions

//6. Checked Exceptions: These are exceptions that the Java compiler requires you to deal with (requires handling)
//   by using the method signature: throws ..............or the try/catch

//7. Let's try read a file
    // remember that a file can be moved anytime by an external programmer/user; so you must know how to handle that situation

//8. We could either use the "throws" or use the "try/catch" statement
    //the try/catch is better

//9. Since there is no file called sample.txt available, it will be able to handle the exception and let us know what is going on(that the file is not available)

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            File file = new File("sample.txt");
            FileReader reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Oops! File not found!");
        }
        System.out.println("Program is done running!");
    }
}
