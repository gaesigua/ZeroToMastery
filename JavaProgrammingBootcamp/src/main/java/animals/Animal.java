//Exercise: Fix the Problem
//Fix the issue that arises when a default access modifier should be protected.
//Steps:
//
//        1. Create a package named animals.
//        2. Inside the animals package, create a class named Animal.
//        3. Inside the Animal class, create a field named species with the default access modifier.
//        4. Create another package named main. Put this on the same level as the animals package.
//        5. In the main package, create a class named Dog that extends Animal in the same package.
//        6. In the Dog class, add a method printSpecies that displays the value of the species. Ignore the red squiggly line for now.
//        7. Inside the main package, create a class named Main.
//        8. In the main method of the Main class, create an instance of the Dog class and call the printSpecies method.
//        9. Fix the issue by changing the access modifier of the species field to protected.
//        10. Was there another way to fix the issue?

package animals;

public class Animal {
    protected String species = "Canine";

}
