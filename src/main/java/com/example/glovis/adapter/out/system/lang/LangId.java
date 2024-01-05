package com.example.glovis.adapter.out.system.lang;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class LangId implements Serializable {

    @Column(length = 2)
    private String natl;

    @Column(length = 20)
    private String code;
}
