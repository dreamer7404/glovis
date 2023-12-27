package com.example.glovis.adapter.persistence.system.menu;

import com.example.glovis.adapter.persistence.user.UserEntity;
import com.example.glovis.application.domain.system.Menu;
import com.example.glovis.application.port.out.system.MenuPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class MenuPersistence implements MenuPort {
    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;
    @Override
    public List<Menu> getList() {
        List<MenuEntity> list = menuRepository.findAllByParentIsNull();
        return menuMapper.toDomainList(list);
//        List<Menu> list2 = list.stream().map(Menu::new).collect(Collectors.toList());
//        return list2;
    }
}
