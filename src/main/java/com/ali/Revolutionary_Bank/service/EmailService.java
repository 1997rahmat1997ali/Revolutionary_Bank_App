package com.ali.Revolutionary_Bank.service;

import com.ali.Revolutionary_Bank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);

    void sendEmailWithAttachment(EmailDetails emailDetails);

}
