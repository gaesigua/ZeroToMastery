package exerciseReadingFromAFile;

public class TestReading {
    public static void main(String[] args) {

        String filepath = "testfile.txt";

        ReadFromFile readFromFile = new ReadFromFile();

        readFromFile.readFile(filepath);
    }
}
