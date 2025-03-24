package exerciseSumOfSquaresUsingReduce;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresExample {
    public static void main(String[] args) {

        List<Integer> meineZahlen = Arrays.asList(0, 7, 8, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        int sumOfSquares = meineZahlen.stream()
                .map(integer -> integer*integer)
                .reduce(0, Integer::sum);

        System.out.println("The sum: " + sumOfSquares);
    }
}
