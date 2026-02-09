package com.borghi.mkt.services;

import com.borghi.mkt.entity.LegalEntity;

import java.util.ArrayList;

public class RegisterLegalEntity {

    private ArrayList<LegalEntity>legalEntityList=new ArrayList<>();

    public ArrayList<LegalEntity> getLegalEntityList() {
        return legalEntityList;
    }

    public void setLegalEntityList(ArrayList<LegalEntity> legalEntityList) {
        this.legalEntityList = legalEntityList;
    }

    public void addLegalEntity(LegalEntity legalEntity){
        if(legalEntity.equals(null)||legalEntity.getLegalName().isBlank()){
            throw new IllegalArgumentException("Pessoa Juridica não pode estar fazia!");
        }
        legalEntityList.add(legalEntity);
    }

    public void delLegalEntity(Long id){
        if(id.equals(null)||id<=0){
            throw new IllegalArgumentException("id não pode ser 0");
        }
        LegalEntity le =findLegalEntityById(id);
        legalEntityList.remove(le);
    }

    public LegalEntity findLegalEntityById(Long id) {
        if(id.equals(null)||id<=0){
            throw new IllegalArgumentException("id não pode ser 0");
        }
        for(LegalEntity le : legalEntityList){
            if(id.equals(le.getId()))
                return le;
        }
        throw new IllegalArgumentException("Empresa não encontrada!");
    }

    public LegalEntity findLegalEntityByName(String name){
        if(name.isBlank()||name.isEmpty()||name.equals("")){
            throw new IllegalArgumentException("Nome em branco não pode ser usado para busca!");
        }
        for (LegalEntity le : legalEntityList){
            if(le.getLegalName().equals(name))
                return le;
        }
        for (LegalEntity le : legalEntityList){
            if(le.getTradeName().equals(name))
                return le;
        }
        throw new IllegalArgumentException("Empresa não encontrada!");
    }


}
