package com.betek.backend7.sesion21;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionStatus {

    private String transactionId;
    private boolean success;
    private String message;


}
