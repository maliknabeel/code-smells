package edu.pafiast.codesmells.couplers.middleman.bad;

public class Customer {
    private Bank bank;

    public Customer(Bank bank) {
        this.bank = bank;
    }

    public void makeDeposit(double amount) {
        bank.deposit(amount);
    }

    public void makeWithdrawal(double amount) {
        bank.withdraw(amount);
    }

    public void checkBalance() {
        System.out.println("Current balance: " + bank.getBalance());
    }
}