package main.Account;

public class Account {
    private String password;
    private int balance;


    public Account(int balance, String password) {
        this.balance = balance;
        this.password = password;
    }


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        boolean amountIsNotNegative = amount > 0;
        if (amountIsNotNegative) balance += amount;
    }

    public void withdraw(int amount, String pin) {
        boolean amountIsNotNegative = amount > 0;
        if (amountIsNotNegative && balance > amount && password.equals(pin)) balance -= amount;
    }

}
