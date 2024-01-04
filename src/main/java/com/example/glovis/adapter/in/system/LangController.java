package com.example.glovis.adapter.in.system;

import com.example.glovis.application.domain.system.Json;
import com.example.glovis.application.domain.system.Menu;
import com.example.glovis.application.port.in.system.MenuUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/system/lang")
public class LangController {
//    private final MenuUseCase menuUseCase;

    @GetMapping(value = "/{natl}")
    public ResponseEntity<Map<String, String>> getJson(@PathVariable  String natl){
//        List<Menu> list = menuUseCase.getList();
//        return ResponseEntity.ok(list);
        List<Json> list = new ArrayList<>();

        if("ko".equals(natl)) {
            list.add(new Json("BTN_OK", "확인"));
            list.add(new Json("BTN_CANCEL", "취소"));
        }else{
            list.add(new Json("BTN_OK", "OK"));
            list.add(new Json("BTN_CANCEL", "CANCEL"));
        }

        Map<String, String> map = list.stream()
                .collect(Collectors.toMap(
//                    Lang::getValue,
//                    Lang::getName
                        i1 -> i1.getValue(),
                        i2 -> i2.getName()
                ));
        return ResponseEntity.ok(map);
    }
}
