package com.betek.backend7.sesion20;

import java.time.LocalDate;

public class TransactionHistory {

    private String accountId;
    private double originalBalance;
    private double transactionAmount;
    private LocalDate date;
    private TransactionType transactionType;

    public TransactionHistory(String accountId, double originalBalance, double transactionAmount, LocalDate date,
                              TransactionType transactionType) {
        this.accountId = accountId;
        this.originalBalance = originalBalance;
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.transactionType = transactionType;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getOriginalBalance() {
        return originalBalance;
    }

    public void setOriginalBalance(double originalBalance) {
        this.originalBalance = originalBalance;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "accountId='" + accountId + '\'' +
                ", originalBalance=" + originalBalance +
                ", transactionAmount=" + transactionAmount +
                ", date=" + date +
                ", transactionType=" + transactionType +
                '}';
    }
}
