package com.example.glovis.application.service.auth;

import com.example.glovis.adapter.out.user.UserMapper;
import com.example.glovis.application.domain.user.User;
import com.example.glovis.application.port.in.auth.AuthUseCase;
import com.example.glovis.application.port.in.auth.LoginRequest;
import com.example.glovis.application.port.in.auth.LoginResponse;
import com.example.glovis.application.port.out.user.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService implements AuthUseCase {

    private final UserPort userPort;
    private final UserMapper userMapper;

    @Override
    public LoginResponse getLogin(LoginRequest loginRequest) {
        User user  = userPort.get(loginRequest.getUserId());
        user.setToken("thisistoken");
        LoginResponse loginResponse = userMapper.toLoginResponse(user);
        return loginResponse;
    }
}
