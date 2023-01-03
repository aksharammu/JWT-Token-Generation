package com.token.token.generation.exceptions;

public class PasswordNotMatchingException extends RuntimeException{
    public PasswordNotMatchingException(){
        super("Password not matching for given user");
    }
}
