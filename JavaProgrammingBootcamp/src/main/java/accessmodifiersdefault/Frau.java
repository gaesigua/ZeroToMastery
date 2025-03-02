package accessmodifiersdefault;

public class Frau {
    //let's set a default x variable;
    int x;

    //let's set a default String name variable;

    String name;

    //let's set a private String secret variable;
    private String secret;

    public int getX() {
        return x;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    private void tellSecret(String secret) {
        this.secret = secret;
    }
}
