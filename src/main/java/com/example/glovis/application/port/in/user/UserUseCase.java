package com.example.glovis.application.port.in.user;

import com.example.glovis.application.domain.user.User;

import java.util.List;

public interface UserUseCase {
    List<User> getList();
    User get(Long id);
    void add(User user);
    void edit(User user);
    void remove(Long id);
}
