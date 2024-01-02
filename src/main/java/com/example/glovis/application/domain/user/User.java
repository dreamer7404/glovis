package com.example.glovis.application.domain.user;


import com.example.glovis.application.port.in.auth.LoginResponse;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

// @Builer하면, mapstruct build에러남.
@Getter
@Setter
public class User {

    private Long id;
    private String userId;
    private String password;
    private String userName;
    private String email;

    private String role;


}
