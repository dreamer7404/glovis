package com.example.glovis.application.port.in.user;

import com.example.glovis.application.domain.user.User;

import java.util.List;

public interface GetListUserUseCase {

    List<User> getList();
}
