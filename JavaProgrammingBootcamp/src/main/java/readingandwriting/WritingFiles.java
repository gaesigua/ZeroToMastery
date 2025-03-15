package readingandwriting;

//1. FileWriter is used to write "character" data to a file;
//2. you need a FileWriter class to write a/to log file, or you might need it to generate reports(write data to a file in a specific format)
//3. FileWriter is a subclass of OutputStreamWriter class
//4. FileWriter implements the writer interface
//5. Other built-in classes to writes files are BufferedWriter and PrintWriter

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {

//6. Here we are basically creating a new file called outputfile.txt and write on it right away
//7. the "true" we added means we don't want the program to replace whatever we have added before it;
    // When we don't add "true" for append(it is invisible), it will replace the text and write a new text everytime we run the program

        try(FileWriter writer = new FileWriter("outputfile.txt", true)){

            writer.write("Ich bin Softwareentwickler. du?\n");


        }catch(IOException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }


    }

}
