package com.example.glovis.adapter.in.system;

import com.example.glovis.application.domain.system.Json;
import com.example.glovis.application.domain.system.Lang;
import com.example.glovis.application.domain.system.Menu;
import com.example.glovis.application.port.in.system.LangUseCase;
import com.example.glovis.application.port.in.system.MenuUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/system/lang")
public class LangController {
    private final LangUseCase langUseCase;

    @GetMapping(value = "/{natl}")
    public ResponseEntity<Map<String, String>> getJson(@PathVariable  String natl){//},  @PathVariable List<String> ids){
//        List<Menu> list = menuUseCase.getList();
//        return ResponseEntity.ok(list);

        List<Lang> langList = langUseCase.getList(natl);

        List<Json> list = new ArrayList<>();
        for (Lang lang : langList){
            list.add(new Json(lang.getCode(), lang.getLabel()));
        }

        Map<String, String> map = list.stream()
                .collect(Collectors.toMap(
                        Json::getValue,
                        Json::getName
                ));
        return ResponseEntity.ok(map);
    }
}
