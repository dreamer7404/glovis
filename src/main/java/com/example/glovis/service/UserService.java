package com.example.glovis.service;

import com.example.glovis.exception.CustomException;
import com.example.glovis.exception.ErrorCode;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    public Optional<String> postUser(String name){

        if(name.isEmpty()){
            throw new CustomException(ErrorCode.DATA_NOT_FOUND);
        }
        if(name.equals("no")){
            throw new CustomException(ErrorCode.INVALID_PARAMETER);
        }

        return Optional.ofNullable("Hello");


    }
}
