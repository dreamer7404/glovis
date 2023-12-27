package com.example.glovis.application.domain.system;

import com.example.glovis.adapter.persistence.system.menu.MenuEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Menu {
    private Long id;
    private String name;
    private Integer seq;
    private List<Menu> children;

//    public Menu(final MenuEntity menuEntity) {
//        this.id = menuEntity.getId();
//        this.name = menuEntity.getName();
//        this.seq = menuEntity.getSeq();
//        this.children = menuEntity.getChildren().stream().map(Menu::new).collect(Collectors.toList());
//    }
}
