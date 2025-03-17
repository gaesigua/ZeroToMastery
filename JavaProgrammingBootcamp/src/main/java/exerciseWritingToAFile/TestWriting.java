package exerciseWritingToAFile;

public class TestWriting {
    public static void main(String[] args) {

        String filepath = "newtestfile.txt";

        String[] names = {"gaesigua", "tin", "kana", "uri", "ora", "jaja", "gwen", "gabby"};

        WriteToFile writeToFile = new WriteToFile();

        writeToFile.writeNames(filepath, names);

    }
}
