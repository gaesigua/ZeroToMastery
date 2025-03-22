package functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipelineExamples {
    public static void main(String[] args) {

        //LET'S DEMONSTRATE HOW TO USE STREAM API, WITH SOME PRACTICAL EXAMPLES

        //We will combine: SOURCE Operations, INTERMEDIATE Operations, and TERMINAL Operations To create Stream Pipelines that can process data


        //Example 1: Filtering and Collecting a list of Drink Names in German

        List<String> trinkeNamen = Arrays.asList("OrangeSaft", "Milche", "Wasser", "Apfelwein", "Wein");

        List<String> drinksThatStartsWithO = trinkeNamen.stream()
                .filter(name -> name.startsWith("O"))
                .toList();
        System.out.println("Drinks That Start With \"O\": " + drinksThatStartsWithO);


        //Example 2: Finding the longest Drink name

        Optional<String> longestDrink = trinkeNamen.stream()
                .max(Comparator.comparingInt(String::length));

        System.out.println("The Longest Drink: " + longestDrink);


        //Example 3: Transforming a list of strings into a set of integers

        //here we are first creating a stream, secondly we use a map operator to turn all the strings in the stream into ints length, meaning the number of characters,
        //and then we use the distinct, we because we want each value once, and then we use Collectors.toSet to set a unique set of integers
       Set<Integer> uniqueIntegers = trinkeNamen.stream()
                .map(String:: length)
                .distinct()
                .collect(Collectors.toSet());
        System.out.println("Unique Integers: " + uniqueIntegers);


        //Example 4: Concantenating strings with a custom separator

        String concantenatedDrinks = trinkeNamen.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Concantenated Drinks: " + concantenatedDrinks);


    }
}
