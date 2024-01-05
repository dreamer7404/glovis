package com.example.glovis.application.port.in.system;

import com.example.glovis.application.domain.system.Lang;
import com.example.glovis.application.domain.system.Menu;

import java.util.List;

public interface LangUseCase {
    List<Lang> getList(String natl);
}
