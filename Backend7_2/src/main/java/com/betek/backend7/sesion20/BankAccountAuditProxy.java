package com.betek.backend7.sesion20;

import java.time.LocalDate;

public class BankAccountAuditProxy implements BankAccount {

    private BankAccount bankAccount;
    private TransactionHistoryService transactionHistoryService;

    public BankAccountAuditProxy(BankAccount bankAccount, TransactionHistoryService transactionHistoryService) {
        this.bankAccount = bankAccount;
        this.transactionHistoryService = transactionHistoryService;
    }

    @Override
    public String getAccountId() {
        return bankAccount.getAccountId();
    }

    @Override
    public void deposit(double amount) {
        TransactionHistory history = new TransactionHistory(getAccountId(), getBalance(), amount, LocalDate.now(), TransactionType.DEPOSIT);
        bankAccount.deposit(amount);
        transactionHistoryService.registerTransaction(history);
    }

    @Override
    public void withdraw(double amount) {
        TransactionHistory history = new TransactionHistory(getAccountId(), getBalance(), amount, LocalDate.now(), TransactionType.WITHDRAWAL);
        bankAccount.withdraw(amount);
        transactionHistoryService.registerTransaction(history);
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void transfer(double amount, BankAccount toAccount) {
        TransactionHistory history = new TransactionHistory(getAccountId(), getBalance(), amount, LocalDate.now(), TransactionType.TRANSFER);
        bankAccount.transfer(amount, toAccount);
        transactionHistoryService.registerTransaction(history);
    }

    @Override
    public void cancel() {
        TransactionHistory history = new TransactionHistory(getAccountId(), getBalance(), 0, LocalDate.now(), TransactionType.CANCEL);
        bankAccount.cancel();
        transactionHistoryService.registerTransaction(history);
    }
}
