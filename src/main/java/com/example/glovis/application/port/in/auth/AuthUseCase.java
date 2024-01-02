package com.example.glovis.application.port.in.auth;

public interface AuthUseCase {
    LoginResponse getLogin(LoginRequest loginRequest);
}
