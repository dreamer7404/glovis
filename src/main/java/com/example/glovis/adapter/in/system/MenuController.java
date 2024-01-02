package com.example.glovis.adapter.in.system;

import com.example.glovis.application.domain.system.Menu;
import com.example.glovis.application.port.in.system.MenuUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/system/menu")
public class MenuController {
    private final MenuUseCase menuUseCase;

    @GetMapping(value = "/list")
    public ResponseEntity<List<Menu>> getList(){
        List<Menu> list = menuUseCase.getList();
        return ResponseEntity.ok(list);
    }
}
