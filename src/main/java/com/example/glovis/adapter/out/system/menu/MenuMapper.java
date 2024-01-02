package com.example.glovis.adapter.out.system.menu;

import com.example.glovis.application.domain.system.Menu;
import org.mapstruct.Condition;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MenuMapper {

//    @Mapping(source = "id", target = "key")
//    @Mapping(source = "name", target = "label")
    Menu toDomain(MenuEntity menuEntity);

    List<Menu> toDomainList(List<MenuEntity> list);

    /**
     * children(0) => null 처리
     * 하위메뉴없으면 downArrow 없애기.
     */
    @Condition
    default boolean isNotEmpty(List<MenuEntity> list) {
        return list != null && !list.isEmpty();
    }






}
