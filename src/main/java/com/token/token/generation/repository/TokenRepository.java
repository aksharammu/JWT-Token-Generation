package com.token.token.generation.repository;

import com.token.token.generation.model.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity,String> {
    public TokenEntity findByUserNameAndPassword(String userName, String password);
}
