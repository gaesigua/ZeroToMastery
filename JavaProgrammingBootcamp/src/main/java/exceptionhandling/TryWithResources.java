package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//1. How do we handle exceptions using the try with resources statements

public class TryWithResources {
        public static void main(String[] args) {

            try(FileReader reader = new FileReader("sample.txt")) {
            } catch (FileNotFoundException e) {
                System.out.println("Oops! File not found!");
            } catch (IOException e) {
                System.out.println("IO Problem");
            }
            System.out.println("Program is done running!");
        }
    }
