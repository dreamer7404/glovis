package com.example.glovis.application.port.in.user;

import com.example.glovis.application.domain.user.User;

public interface GetUserUseCase {

    User get(Long id);
}
