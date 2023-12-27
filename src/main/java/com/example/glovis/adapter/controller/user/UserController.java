package com.example.glovis.adapter.controller.user;

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

    private final UserUseCase userUseCase;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> get(@PathVariable Long id){
        User user =  userUseCase.get(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<User>> getList(){
        List<User> list = userUseCase.getList();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public void add(@RequestBody User user){
        userUseCase.add(user);
    }

    @PutMapping
    public void edit(@RequestBody User user){
        userUseCase.edit(user);
    }

    @DeleteMapping(value = "/{id}")
    public void remove(@PathVariable Long id){
        userUseCase.remove(id);
    }

}
