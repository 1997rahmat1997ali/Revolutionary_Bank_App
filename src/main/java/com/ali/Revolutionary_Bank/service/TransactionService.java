package com.ali.Revolutionary_Bank.service;

import com.ali.Revolutionary_Bank.dto.TransactionDto;
import com.ali.Revolutionary_Bank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
