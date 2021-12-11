package com.wb.mvnbook.account.exception;

public class AccountEmailException extends Exception{
    public AccountEmailException(){
        super();
    }

    public AccountEmailException(String exceptionInfo, Throwable throwable){
        super(exceptionInfo, throwable);
    }
}
