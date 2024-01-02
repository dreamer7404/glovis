package com.example.glovis.adapter.in.auth;

import com.example.glovis.application.port.in.auth.AuthUseCase;
import com.example.glovis.application.port.in.auth.LoginRequest;
import com.example.glovis.application.port.in.auth.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/auth")
public class AuthController {

    private final AuthUseCase authUseCase;
    @PostMapping(value = "/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
//        User responseUser =  getUserUseCase.get(loginRequest.getUserId());
//        LoginResponse.builder().userName()
//        return ResponseEntity.ok(responseUser);

        LoginResponse loginResponse = authUseCase.getLogin(loginRequest);
        return ResponseEntity.ok(loginResponse);
    }
}
