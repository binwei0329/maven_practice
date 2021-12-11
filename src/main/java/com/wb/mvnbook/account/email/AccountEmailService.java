package com.wb.mvnbook.account.email;

import com.wb.mvnbook.account.exception.AccountEmailException;

public interface AccountEmailService {
    void sendMail(String to, String subject, String htmlText) throws AccountEmailException;
}
