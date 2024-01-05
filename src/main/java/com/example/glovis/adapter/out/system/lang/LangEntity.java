package com.example.glovis.adapter.out.system.lang;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="lang")
public class LangEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long  id;
//
//    @Column(nullable = false, length = 20)
//    private String natl;
//
//    @Column(nullable = false, length = 20)
//    private String code;

    @EmbeddedId
    private LangId id;

    @Column(nullable = false, length = 20)
    private String label;


}
