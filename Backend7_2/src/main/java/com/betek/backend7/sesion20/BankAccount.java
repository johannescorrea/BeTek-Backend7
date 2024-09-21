package com.betek.backend7.sesion20;

public interface BankAccount {

    String getAccountId();

    void deposit(double amount);

    //retirar
    void withdraw(double amount);

    double getBalance();

    void transfer(double amount, BankAccount toAccount);

    void cancel();

}
