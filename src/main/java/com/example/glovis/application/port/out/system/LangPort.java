package com.example.glovis.application.port.out.system;

import com.example.glovis.application.domain.system.Lang;

import java.util.List;

public interface LangPort {
    List<Lang> getList(String natl);
}
