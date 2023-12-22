package com.example.glovis.adapter.in;

import com.example.glovis.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserController {

    /**
     * 사용자 정보
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable Long id){
        return User.builder()
                .id(id)
                .name("hello")
                .email("aaa@bb.com")
                .build();
    }

    /**
     * 사용자 목록
     * @return
     */
    @GetMapping(value = "/rows")
    public List<User> getUserList(){

        List<User> list = new ArrayList<>();
        list.add(User.builder()
                .id(1L)
                .name("hello")
                .email("aaa@bb.com")
                .build());
        list.add(User.builder()
                .id(2L)
                .name("hello2")
                .email("aaa2@bb.com")
                .build());

         return list;
    }

    /**
     * 사용자 추가
     * @param user
     * @return
     */
    @PutMapping
    public String putUser(@RequestBody User user){
        return "1";
    }

    /**
     * 사용자 삭제
     * @param id: 사용자아이디
     * @return 삭제성공여부
     */
    @DeleteMapping(value = "/{id}")
    public String deleteUser(@PathVariable Long id){

        return "1";
    }
}
