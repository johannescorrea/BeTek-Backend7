package com.betek.backend7.sesion20;

import java.util.LinkedList;
import java.util.List;

public class TransactionHistoryService {

    private List<TransactionHistory> transactionHistories;

    public TransactionHistoryService() {
        transactionHistories = new LinkedList<>();
    }

    public void registerTransaction(TransactionHistory transactionHistory) {
        transactionHistories.add(transactionHistory);
    }

    public void printTransactionHistory() {
        transactionHistories.forEach(System.out::println);
    }
}
