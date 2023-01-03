package com.token.token.generation.exceptions;

public class UserNameAlreadyExistsException extends RuntimeException{
    public UserNameAlreadyExistsException(){
        super("UserName already exists");
    }
}
