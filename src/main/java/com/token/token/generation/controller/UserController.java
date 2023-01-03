package com.token.token.generation.controller;

import com.token.token.generation.config.JwtGeneratorInterface;
import com.token.token.generation.exceptions.UserNotFoundException;
import com.token.token.generation.model.entity.TokenEntity;
import com.token.token.generation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;
    private JwtGeneratorInterface jwtGeneratorInterface;

    @Autowired
    public UserController(UserService userService, JwtGeneratorInterface jwtGenerator){
        this.userService=userService;
        this.jwtGeneratorInterface=jwtGenerator;
    }
    @PostMapping("/register")
    public ResponseEntity<?> postUser(@RequestBody TokenEntity user){
        try{
            userService.saveUser(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody TokenEntity user) {
        try {
            if(user.getUserName() == null || user.getPassword() == null) {
                throw new UserNotFoundException("UserName or Password is Empty");
            }
            TokenEntity userData = userService.getUserByNameAndPassword(user.getUserName(), user.getPassword());
            if(userData == null){
                throw new UserNotFoundException("UserName or Password is Invalid");
            }
            return new ResponseEntity<>(jwtGeneratorInterface.generateToken(user), HttpStatus.OK);
        } catch (UserNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
}

