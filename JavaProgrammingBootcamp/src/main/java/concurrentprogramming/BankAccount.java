package concurrentprogramming;

public class BankAccount {

    private double balance;

    public synchronized void deposit(double amount){

        double newBalance = balance + amount;
        balance = newBalance;

    }

    public synchronized void withdraw(double amount) throws Exception{

        double newBalance = balance - amount;

        if(balance < 0){
            throw new Exception("Insufficient Funds!");
        }

        balance = newBalance;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
