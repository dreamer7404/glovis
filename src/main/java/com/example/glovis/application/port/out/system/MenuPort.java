package com.example.glovis.application.port.out.system;

import com.example.glovis.application.domain.system.Menu;
import com.example.glovis.application.domain.user.User;

import java.util.List;

public interface MenuPort {
    List<Menu> getList();

}
