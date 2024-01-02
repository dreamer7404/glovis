package com.example.glovis.application.port.in.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String userName;
    private String role;
    private String token;


}
