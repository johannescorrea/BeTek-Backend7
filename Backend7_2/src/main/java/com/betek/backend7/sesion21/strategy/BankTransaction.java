package com.betek.backend7.sesion21.strategy;

import com.betek.backend7.sesion21.BankAccount;
import com.betek.backend7.sesion21.TransactionRequest;
import com.betek.backend7.sesion21.TransactionStatus;

public abstract class BankTransaction {

    protected BankAccount account;

    public BankTransaction(BankAccount account){
        this.account = account;
    }

    public abstract TransactionStatus execute(TransactionRequest request);

}
