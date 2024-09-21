package com.betek.backend7.sesion20;

import java.util.HashMap;
import java.util.Map;

public class BankAccountService {

    private TransactionHistoryService transactionHistoryService;
    Map<String, BankAccount> accounts = new HashMap<>();

    public BankAccountService(TransactionHistoryService transactionHistoryService) {
        this.transactionHistoryService = transactionHistoryService;
    }

    public BankAccount openAccount(String accountId, double amount) {
        if (accounts.containsKey(accountId)) {
            throw new IllegalArgumentException("Account already exists");
        } else {
            BankAccount account = new SavingsAccount(accountId, amount);
            accounts.put(accountId, account);
            return new BankAccountAuditProxy(new BankAccountNotificationProxy(account), transactionHistoryService);
        }
    }

    public BankAccount getAccount(String accountId) {
        BankAccount account = accounts.get(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Account does not exist");
        }
        return new BankAccountAuditProxy(new BankAccountNotificationProxy(account), transactionHistoryService);
    }
}
