package com.betek.backend7.sesion21.templatemethod;

import com.betek.backend7.sesion21.TransactionRequest;
import com.betek.backend7.sesion21.TransactionStatus;

public abstract class BaseTransaction {

    public TransactionStatus processTransaction(TransactionRequest txRequest) {
        TransactionStatus status = new TransactionStatus();
        try {
            validateRequest(txRequest);
            process(txRequest);
            status.setSuccess(true);
        } catch (Exception e) {
            status.setSuccess(false);
            status.setMessage(e.getMessage());
        }
        return status;
    }

    protected abstract void validateRequest(TransactionRequest request);

    protected abstract void process(TransactionRequest request);

}
