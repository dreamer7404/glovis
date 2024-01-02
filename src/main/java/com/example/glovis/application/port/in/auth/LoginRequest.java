package com.example.glovis.application.port.in.auth;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequest {
    private String userId;
    private String password;
}
