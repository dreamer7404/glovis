package com.example.glovis.application.port.out.user;

import com.example.glovis.application.domain.User;

import java.util.List;

public interface UserPort {
    List<User> getList();
    User get(Long id);
    void add(User user);
    void edit(User user);
    void remove(Long id);
}