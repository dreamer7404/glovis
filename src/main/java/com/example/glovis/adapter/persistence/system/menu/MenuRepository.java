package com.example.glovis.adapter.persistence.system.menu;

import com.example.glovis.adapter.persistence.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
    List<MenuEntity> findAllByParentIsNull();
}
