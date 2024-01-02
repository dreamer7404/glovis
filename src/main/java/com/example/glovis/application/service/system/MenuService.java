package com.example.glovis.application.service.system;

import com.example.glovis.application.domain.system.Menu;
import com.example.glovis.application.port.in.system.MenuUseCase;
import com.example.glovis.application.port.out.system.MenuPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService implements MenuUseCase {

    private final MenuPort menuPort;
    @Override
    public List<Menu> getList() {
        return menuPort.getList();
    }
}
