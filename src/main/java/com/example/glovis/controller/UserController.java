package com.example.glovis.controller;

import com.example.glovis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import com.example.glovis.domain.User;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
	
	@GetMapping(value = "/api/user")
    public User getUser(){
        User user = new User();
        user.setId(1L);
        user.setName("ahnks");
        return user;
    }

    @PostMapping(value = "/api/user")
    public ResponseEntity<String> postUser(@Validated  @RequestBody String name){

        String result = userService.postUser("no").get();
        return new ResponseEntity<>(result, null, HttpStatus.OK);
    }


}
