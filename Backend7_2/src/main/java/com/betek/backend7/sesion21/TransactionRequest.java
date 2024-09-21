package com.betek.backend7.sesion21;

import lombok.Getter;

@Getter
public class TransactionRequest {

    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;
}
