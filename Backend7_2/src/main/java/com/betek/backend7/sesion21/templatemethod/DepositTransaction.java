package com.betek.backend7.sesion21.templatemethod;


import com.betek.backend7.sesion21.BankAccount;
import com.betek.backend7.sesion21.TransactionRequest;

public class DepositTransaction extends BaseTransaction{

    @Override
    protected void validateRequest(TransactionRequest request) {

        if(request.getFromAccount() == null){
            throw new IllegalArgumentException("From account is required");
        }
        if(request.getAmount() < 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }

    }

    @Override
    protected void process(TransactionRequest request) {
        BankAccount fromAccount = request.getFromAccount();
        fromAccount.addAmount(request.getAmount());
    }
}
