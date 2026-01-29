package com.borghi.mkt.entity;

import java.util.ArrayList;

public class LegalEntity {

    private long id;
    private String tradeName;
    private String legalName;
    private String cnpj;
    private ArrayList<Address>addresses=new ArrayList<>();

    @Override
    public String toString() {
        return "LegalEntity{" +
                "id=" + id +
                ", tradeName='" + tradeName + '\'' +
                ", legalName='" + legalName + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    public LegalEntity(long id, String tradeName, String legalName, String cnpj, ArrayList<Address> addresses) {
        this.id = id;
        this.tradeName = tradeName;
        this.legalName = legalName;
        this.cnpj = cnpj;
        this.addresses = addresses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }
}