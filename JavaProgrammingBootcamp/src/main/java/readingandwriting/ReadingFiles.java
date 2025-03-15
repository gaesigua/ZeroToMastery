package readingandwriting;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("abc.txt")){
           int data;

            while((data = reader.read()) != -1){

               System.out.print((char) data);
           }
        }catch(IOException e){
            System.out.println("An I/0 Error occurred! (File Not Found)!!");
        }
    }
}