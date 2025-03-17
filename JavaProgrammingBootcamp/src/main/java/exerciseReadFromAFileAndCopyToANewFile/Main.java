package exerciseReadFromAFileAndCopyToANewFile;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

            String sourcePath = "abc.txt";
            String destinationPath = "destinationfile.txt";

            try{
                CopyFile copyFile = new CopyFile();

                copyFile.copyFile(sourcePath, destinationPath);

            }catch(FileNotFoundException e){

                System.out.println("Error! File Not Found!!");

            }
            }

    }
