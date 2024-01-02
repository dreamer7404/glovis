package com.example.glovis.adapter.out.user;

import com.example.glovis.application.domain.user.User;
import com.example.glovis.application.port.out.user.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserPersistence implements UserPort{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User get(Long id) {
        UserEntity entity = userRepository.findById(id).orElse(null);
        return userMapper.toDomain(entity);
    }

    @Override
    public List<User> getList() {
        List<UserEntity> list = userRepository.findAll();
        return userMapper.toDomainList(list);
    }

    @Override
    public void add(User user) {
        UserEntity entity = userMapper.toEntity(user);
        userRepository.save(entity);
    }

    @Override
    public void edit(User user) {
        Optional<UserEntity> optional = userRepository.findById(user.getId());
        optional.ifPresent(item -> {
            if(user.getUserName() != null) {
                item.setUserName(user.getUserName());
            }
            if(user.getEmail() != null) {
                item.setEmail(user.getEmail());
            }
            userRepository.save(item);
        });

    }

    @Override
    public void remove(Long id) {
        Optional<UserEntity> optional = userRepository.findById(id);
        optional.ifPresent(item -> {
            userRepository.delete(item);
        });
    }

    @Override
    public User get(String userId) {
        return null;
    }

}
