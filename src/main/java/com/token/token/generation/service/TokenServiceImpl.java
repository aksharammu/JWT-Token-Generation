package com.token.token.generation.service;

import com.token.token.generation.exceptions.UserNotFoundException;
import com.token.token.generation.model.entity.TokenEntity;
import com.token.token.generation.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements UserService{
    private TokenRepository tokenRepository;

    @Autowired
    public TokenServiceImpl( TokenRepository tokenRepository){
        this.tokenRepository = tokenRepository;
    }
    @Override
    public void saveUser(TokenEntity user) {
        tokenRepository.save(user);
    }
    @Override
    public TokenEntity getUserByNameAndPassword(String name, String password) throws UserNotFoundException {
        TokenEntity user = tokenRepository.findByUserNameAndPassword(name, password);
        if(user == null){
            throw new UserNotFoundException("Invalid id and password");
        }
        return user;
    }

}
