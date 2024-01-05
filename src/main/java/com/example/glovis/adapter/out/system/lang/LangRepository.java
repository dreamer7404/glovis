package com.example.glovis.adapter.out.system.lang;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LangRepository extends JpaRepository<LangEntity, LangId> {
    List<LangEntity> findByIdNatl(String natl);
}
