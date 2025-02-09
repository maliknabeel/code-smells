package edu.pafiast.codesmells.couplers.middleman.good;

public class Customer {
    private BankAccount account;

    public Customer(BankAccount account) {
        this.account = account;
    }

    public void makeDeposit(double amount) {
        account.deposit(amount);
    }

    public void makeWithdrawal(double amount) {
        account.withdraw(amount);
    }

    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }
}