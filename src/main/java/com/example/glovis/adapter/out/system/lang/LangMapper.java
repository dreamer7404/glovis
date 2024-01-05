package com.example.glovis.adapter.out.system.lang;

import com.example.glovis.adapter.out.system.menu.MenuEntity;
import com.example.glovis.application.domain.system.Lang;
import com.example.glovis.application.domain.system.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface LangMapper {

    @Mapping(target = "code", source = "id.code")
    @Mapping(target = "natl", ignore = true)
    Lang toDomain(LangEntity langEntity);
    List<Lang> toDomainList(List<LangEntity> list);
}
