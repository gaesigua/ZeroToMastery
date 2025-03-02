package accessmodifiersprotected;

public class Zahlen {
    protected int a = 1;
    protected int b = 7;
    protected String tag1;
    protected String begrussung;

    protected void getTag(String day){
        System.out.println(day);
    }

    protected void greet(){
        System.out.println("In German, you say \"" + begrussung + "\" to wish someone a good night!");
    }
}
