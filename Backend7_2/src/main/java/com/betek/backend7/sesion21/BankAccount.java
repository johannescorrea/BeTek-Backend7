package com.betek.backend7.sesion21;

public class BankAccount {

    private String accountId;
    private double balance;
    private boolean active;

    public BankAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
        this.active = true;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public void addAmount(double amount) {
        this.balance += amount;
    }
}
