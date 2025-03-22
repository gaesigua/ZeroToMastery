package exerciseMethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {

        List<String> relationships = Arrays.asList("Schwester", "Bruder", "Mutter", "Eltern", "Vatter");

        List<String> uppercasedRelationships = relationships.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercased: " + uppercasedRelationships);
    }
}
