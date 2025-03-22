package exerciseStreamApiFilteringAndMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> meineZahlen = Arrays.asList(0,7,8,8,1,3,5,7,9,2);

        List<Integer> squaredOddNumbers = meineZahlen.stream().filter(zahl -> zahl % 2 != 0)
                .map(zahl -> zahl * zahl)
                .collect(Collectors.toList());

        System.out.println("Squared Odd Numbers: " + squaredOddNumbers);

    }
}
