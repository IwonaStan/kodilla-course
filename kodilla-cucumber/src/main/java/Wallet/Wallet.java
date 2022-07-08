package Wallet;

public class Wallet {

    private int balance;

    public Wallet() {
        this.balance = balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }
    public int getBalance() {
        return this.balance;
    }
    public void debit(int money) {
        //if (getBalance()>=money)
        this.balance -= money;
        //else this.balance = 0;
    }
}
