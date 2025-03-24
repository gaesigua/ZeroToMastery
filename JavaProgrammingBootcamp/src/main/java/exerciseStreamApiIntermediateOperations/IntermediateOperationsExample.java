package exerciseStreamApiIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationsExample {
    public static void main(String[] args) {

        List<String> myUnregelMasigeVerben = Arrays.asList("schlafen", "essen", "fahren", "kaufen", "gehen", "bringen");

        List<String> stringsLessThan6Characters = myUnregelMasigeVerben.stream()
                .filter(n->n.length() < 6)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Verbs filtered and transformed: " + stringsLessThan6Characters);
    }
}
