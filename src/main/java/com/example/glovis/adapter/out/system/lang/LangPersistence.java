package com.example.glovis.adapter.out.system.lang;

import com.example.glovis.application.domain.system.Lang;
import com.example.glovis.application.port.out.system.LangPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class LangPersistence implements LangPort {

    private final LangMapper langMapper;
    private final LangRepository langRepository;

    @Override
    public List<Lang> getList(String natl) {
        List<LangEntity> list = langRepository.findByIdNatl(natl);
        return langMapper.toDomainList(list);
//        return null;
    }
}
