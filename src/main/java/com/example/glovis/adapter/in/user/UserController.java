package com.example.glovis.adapter.in.user;

import com.example.glovis.application.domain.user.User;
import com.example.glovis.application.port.in.user.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserController {

    private final GetUserUseCase getUserUseCase;
    private final GetListUserUseCase getListUserUseCase;
    private final AddUserUseCase addUserUseCase;
    private final RemoveUserUseCase removeUserUseCase;
    private final EditUserUseCase editUserUseCase;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> get(@PathVariable Long id){
        User user =  getUserUseCase.get(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<User>> getList(){
        List<User> list = getListUserUseCase.getList();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public void add(@RequestBody User user){
        addUserUseCase.add(user);
    }

    @PutMapping
    public void edit(@RequestBody User user){
        editUserUseCase.edit(user);
    }

    @DeleteMapping(value = "/{id}")
    public void remove(@PathVariable Long id){
        removeUserUseCase.remove(id);
    }



}
