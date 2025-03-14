package exerciseCreateAClassBagWithATypeParameterAndCollection2;

public class BagExample {
    public static void main(String[] args) {
        Bag<String> myStringBag = new Bag<>();
        Bag<Integer> myIntBag = new Bag<>();

        myStringBag.addItem("Bitte wiederholen sie!");
        myStringBag.addItem("Enschuldigen sie bitte!");
        myStringBag.addItem("Was machen sie beruflich?");

        myIntBag.addItem(1);
        myIntBag.addItem(2);
        myIntBag.addItem(3);

    }
}
