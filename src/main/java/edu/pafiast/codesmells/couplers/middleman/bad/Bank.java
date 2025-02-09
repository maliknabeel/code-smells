package edu.pafiast.codesmells.couplers.middleman.bad;


/*
Not required class as it is just forwarding message, and doing nothing
This class can be eliminated
 */
public class Bank {
    private BankAccount account;

    public Bank(BankAccount account) {
        this.account = account;
    }

    // Middleman methods
    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public double getBalance() {
        return account.getBalance();
    }
}