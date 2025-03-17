package exerciseReadFromAFileAndCopyToANewFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public void copyFile(String sourcePath, String destinationPath) throws FileNotFoundException{

        try(FileReader reader = new FileReader(sourcePath);
            FileWriter writer = new FileWriter(destinationPath)){

            int data;

            while((data= reader.read())!= -1){

                writer.write((char) data);
            }

        }catch(IOException e){

            System.out.println("An I/0 Error has occurred!");
        }

    }
}
