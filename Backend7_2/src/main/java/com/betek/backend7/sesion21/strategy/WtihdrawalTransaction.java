package com.betek.backend7.sesion21.strategy;

import com.betek.backend7.sesion21.BankAccount;
import com.betek.backend7.sesion21.TransactionRequest;
import com.betek.backend7.sesion21.TransactionStatus;

public class WtihdrawalTransaction extends BankTransaction {

    public WtihdrawalTransaction(BankAccount account) {
        super(account);
    }

    @Override
    public TransactionStatus execute(TransactionRequest request) {
        TransactionStatus status = new TransactionStatus();
        status.setTransactionId("1234");
        if (request.getAmount() > account.getBalance()) {
            status.setSuccess(false);
            status.setMessage("Insufficient funds");
        } else {
            account.addAmount(-request.getAmount());
            status.setSuccess(true);
            status.setMessage("Withdrawal successful");
        }
        return status;
    }
}
