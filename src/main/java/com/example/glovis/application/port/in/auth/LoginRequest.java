package com.example.glovis.application.port.in.auth;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Setter
@Getter
public class LoginRequest {

    @NotNull @Size(min = 8, max = 12)
    private String userId;

    @NotNull @Size(min = 8, max = 12)
    private String password;

}
