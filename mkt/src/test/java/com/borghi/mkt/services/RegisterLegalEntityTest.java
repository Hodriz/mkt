package com.borghi.mkt.services;

import com.borghi.mkt.entity.Address;
import com.borghi.mkt.entity.LegalEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegisterLegalEntityTest {

    private RegisterLegalEntity registerLegalEntity;
    private LegalEntity legalEntity1;
    private LegalEntity legalEntity2;

    @BeforeEach
    void setup(){
        registerLegalEntity=new RegisterLegalEntity();

        legalEntity1=new LegalEntity(
                1l,
         "Silvo & Santos.Ltda",
         "Casa da Coxinha",
              "23.546.0001/01",
                    new ArrayList<>() {{
                    add(new Address("Rua JK", "Marialva", 34, "Brasil", "Paraná"));
                }}
        );

        legalEntity2=new LegalEntity(
                2l,
                "Biru & Liru.Ltda",
                "Shopping do Celular",
                "33.522.0001/37",
                new ArrayList<>() {{
                    add(new Address("Rua Foice de Assis", "Campo Mourão", 2145, "Brasil", "Paraná"));
                }}
        );

    }
    @Test
    void getLegalEntityList() {
        registerLegalEntity.addLegalEntity(legalEntity1);
        registerLegalEntity.addLegalEntity(legalEntity2);
        ArrayList<LegalEntity>list=registerLegalEntity.getLegalEntityList();
        assertEquals(2,list.size());
        assertTrue(list.contains(legalEntity1));
        assertTrue(list.contains(legalEntity2));

    }

    @Test
    void setLegalEntityList() {
    }

    @Test
    void addLegalEntity() {
        registerLegalEntity.addLegalEntity(legalEntity1);
        registerLegalEntity.addLegalEntity(legalEntity2);
        ArrayList<LegalEntity>list=registerLegalEntity.getLegalEntityList();
        assertEquals(2,list.size());
        assertTrue(list.contains(legalEntity1));
        assertTrue(list.contains(legalEntity2));
    }

    @Test
    void delLegalEntity() {
        registerLegalEntity.addLegalEntity(legalEntity1);
        registerLegalEntity.addLegalEntity(legalEntity2);
        ArrayList<LegalEntity>list=registerLegalEntity.getLegalEntityList();
        registerLegalEntity.delLegalEntity(1L);
        assertEquals(1,list.size());
        assertFalse(list.contains(legalEntity1));
        assertTrue(list.contains(legalEntity2));

    }

    @Test
    void findLegalEntityById() {
        registerLegalEntity.addLegalEntity(legalEntity1);
        registerLegalEntity.addLegalEntity(legalEntity2);
        LegalEntity le=registerLegalEntity.findLegalEntityById(1L);
        assertSame(le, legalEntity1);

    }

    @Test
    void findByName() {
        registerLegalEntity.addLegalEntity(legalEntity1);
        registerLegalEntity.addLegalEntity(legalEntity2);
        LegalEntity le=registerLegalEntity.findLegalEntityByName("Casa da Coxinha");
        assertSame(le,legalEntity1);
    }
}