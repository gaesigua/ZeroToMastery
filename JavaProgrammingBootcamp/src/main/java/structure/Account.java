package structure;

public class Account {

    private String user;
    private double balance;
    private double minimumBalance;

    public void deposit(double amount){
        //to build this
    }
    public void checkBalance(){
        //to build this
    }
    public void withdraw(double amount){
        //to build this
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public double calculateCreditWorthiness(){
        //to build this
        return 100;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}
