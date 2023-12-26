package com.example.glovis.application.service.user;

import com.example.glovis.application.domain.User;
import com.example.glovis.application.port.in.user.*;
import com.example.glovis.application.port.out.user.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService implements UserUseCase {//GetUserUseCase , GetListUserUseCase, AddUserUseCase {// , PutUserUseCase, DeleteUserUseCase {



    private final PasswordEncoder passwordEncoder;
    private final UserPort userPort;

    @Override
    public User get(Long id) {
        return userPort.get(id);
    }

    @Override
    public List<User> getList() {
        return userPort.getList();
    }


    @Override
    public void add(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userPort.add(user);
    }

    @Override
    public void edit(User user) {
        userPort.edit(user);
    }

    @Override
    public void remove(Long id) {
        userPort.remove(id);
    }


}
