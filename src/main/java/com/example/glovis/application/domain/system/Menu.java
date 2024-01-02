package com.example.glovis.application.domain.system;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Menu {
//    private Long key; // id
//    private String label; // name
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
