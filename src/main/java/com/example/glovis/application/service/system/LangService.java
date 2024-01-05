package com.example.glovis.application.service.system;

import com.example.glovis.application.domain.system.Lang;
import com.example.glovis.application.port.in.system.LangUseCase;
import com.example.glovis.application.port.out.system.LangPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LangService implements LangUseCase {

    private final LangPort langPort;

    @Override
    public List<Lang> getList(String natl) {
        return langPort.getList(natl);
    }
}
