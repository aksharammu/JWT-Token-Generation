package com.token.token.generation.service;

import com.token.token.generation.exceptions.UserNotFoundException;
import com.token.token.generation.model.entity.TokenEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(TokenEntity user);
    public TokenEntity getUserByNameAndPassword(String name, String password) throws UserNotFoundException;
}
