package com.example.glovis.application.domain.user;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
public class User {

    private Long id;
    private String userId;
    private String password;
    private String userName;
    private String email;

}
