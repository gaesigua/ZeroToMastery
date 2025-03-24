package exerciseFindMaximumValueUsingStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximumValueExample {
    public static void main(String[] args) {
        List<Integer> meineTelefonNummer = Arrays.asList(0,7,8,9,87,6,28,66,73);

        Optional<Integer> maxNummer = meineTelefonNummer.stream().max(Integer::compare);

        maxNummer.ifPresent(value-> System.out.println("The maximum number: " + value));
    }
}
