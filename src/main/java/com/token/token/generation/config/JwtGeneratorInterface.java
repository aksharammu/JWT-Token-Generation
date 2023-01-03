package com.token.token.generation.config;

import com.token.token.generation.model.entity.TokenEntity;

import java.util.Map;

public interface JwtGeneratorInterface {

     Map<String, String> generateToken(TokenEntity user);

}
