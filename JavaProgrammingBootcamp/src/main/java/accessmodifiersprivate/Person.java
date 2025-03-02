package accessmodifiersprivate;

public class Person {
    //Here I am initializing a String name, that is PUBLIC (can be accessed from anywhere within the while application)
    public String name;

    //Here I am initializing a String secret, that is PRIVATE (can be accessed from anywhere within the SAME CLASS)
    private String secret;

    public void sayHi(){
        System.out.println("Guten Morgen, Ich bin " + name);

        //we can call the tellSecret method here even though it is private; because they belong to the same class;
        //but if we called this method from the Main class, we would get a null value for tellSecret,
        // since we have not set the secret yet, and we can only set it within this class because it is private

        tellSecret();

    }

    private void tellSecret(){
        System.out.println("My secret is: " + secret);
    }
}
