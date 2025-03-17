package exerciseWritingToAFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile{
    public void writeNames(String filepath, String[] names){

        try(FileWriter writer = new FileWriter(filepath)){

            for (String name: names){

                writer.write(name + '\n');
            }
        }catch(IOException e){

            System.out.println("Error Message: " + e.getMessage());

        }
    }
}