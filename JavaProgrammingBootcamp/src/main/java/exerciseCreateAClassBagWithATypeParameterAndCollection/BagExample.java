package exerciseCreateAClassBagWithATypeParameterAndCollection;

public class BagExample {
    public static void main(String[] args) {

        Bag<String> stringBag = new Bag<>();
        Bag<Integer> intBag = new Bag<>();

        stringBag.addItem("Ich verstehe nicht!");
        stringBag.addItem("Keine Ahnung!");
        stringBag.addItem("Einen moment, bitte!");

        System.out.println("Added String: " + stringBag);

        intBag.addItem(322);
        intBag.addItem(21);
        intBag.addItem(19);

        System.out.println("Add Integers: " + intBag);

        intBag.removeItem(1);

        System.out.println("Integers after removing one item: " + intBag);
    }
}
