package com.example.glovis.common.generator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class IdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
//        return Generators.timeBasedGenerator().generate().toString().replaceAll("-", "");
        String millisecond = String.valueOf(System.currentTimeMillis() - 943887600000L); // 2000년 빼기
        String random =  String.valueOf((int)(Math.random() * (99999 - 10000 + 1)) + 10000); // 5자리 random
        return Long.parseLong(millisecond + random);
    }
}
