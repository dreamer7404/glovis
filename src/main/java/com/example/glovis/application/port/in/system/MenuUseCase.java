package com.example.glovis.application.port.in.system;

import com.example.glovis.application.domain.system.Menu;
import com.example.glovis.application.domain.user.User;

import java.util.List;

public interface MenuUseCase {
    List<Menu> getList();

}
