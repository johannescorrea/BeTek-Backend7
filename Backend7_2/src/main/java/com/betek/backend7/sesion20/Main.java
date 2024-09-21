package com.betek.backend7.sesion20;

public class Main {

    public static void main(String[] args) {

        TransactionHistoryService transactionHistoryService = new TransactionHistoryService();
        BankAccountService accountService = new BankAccountService(transactionHistoryService);

        BankAccount account1 = accountService.openAccount("10380823962", 1000);
        BankAccount account2 = accountService.openAccount("10380823963", 2000);

        account1.deposit(100);
        account1.withdraw(50);
        account1.transfer(100, account2);

        transactionHistoryService.printTransactionHistory();
    }
}
