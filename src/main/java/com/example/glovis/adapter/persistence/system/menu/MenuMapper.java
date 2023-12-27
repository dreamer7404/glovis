package com.example.glovis.adapter.persistence.system.menu;

import com.example.glovis.application.domain.system.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MenuMapper {

    Menu toDomain(MenuEntity menuEntity);

    List<Menu> toDomainList(List<MenuEntity> list);






}
