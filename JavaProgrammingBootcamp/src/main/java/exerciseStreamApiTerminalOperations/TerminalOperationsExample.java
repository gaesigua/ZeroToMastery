package exerciseStreamApiTerminalOperations;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationsExample {
    public static void main(String[] args) {

        List<Integer> meineHandyNummer = Arrays.asList(0,7,8,8,3,2,4,7,9,8,12);

        long countedNumbers = meineHandyNummer.stream()
                .filter(zahl->zahl%2==0)
                .count();

        System.out.println("Total Number of Counted Even Numbers: " + countedNumbers);
    }
}
