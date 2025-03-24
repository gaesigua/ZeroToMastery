package exerciseRewriteAForLoopUsingForEach;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {

        List<String> habenKonjugation = Arrays.asList("habe", "hast", "haben", "hat", "haben", "habt", "haben");

         habenKonjugation.forEach(s -> System.out.println(s));
    }
}
