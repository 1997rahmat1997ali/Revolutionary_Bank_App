package com.ali.Revolutionary_Bank.service;

import com.ali.Revolutionary_Bank.dto.*;
import com.ali.Revolutionary_Bank.entity.User;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);

    BankResponse debitAccount(CreditDebitRequest request);

    BankResponse transfer(TransferRequest request);
}
