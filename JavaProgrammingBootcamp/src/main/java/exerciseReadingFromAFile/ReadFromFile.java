package exerciseReadingFromAFile;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public void readFile(String filepath){

        try(FileReader reader = new FileReader(filepath)){
            int data;

            while((data = reader.read()) != -1){
                System.out.println((char) data);
            }

        }catch(IOException e){
            System.out.println("I/0 unexpected error!");
        }
    }
}
