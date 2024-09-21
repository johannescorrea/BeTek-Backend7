package com.betek.backend7.sesion20;

public class SavingsAccount implements BankAccount {

    private String accountId;
    private double balance;

    public SavingsAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    @Override
    public String getAccountId() {
        return accountId;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void transfer(double amount, BankAccount toAccount) {
        withdraw(amount);
        toAccount.deposit(amount);
    }

    @Override
    public void cancel() {

    }
}
