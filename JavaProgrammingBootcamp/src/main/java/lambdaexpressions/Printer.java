package lambdaexpressions;

//1. Let's create another functional interface; with an abstract method as usual, but this time with not returning anything (void)

@FunctionalInterface
public interface Printer {

    void print(String s);
}
