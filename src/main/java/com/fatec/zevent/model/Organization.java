package com.fatec.zevent.model;

public class Organization {
    private String socialReason;
    private String fantasyName;
    private int CNPJ;
    private String actuationArea;
    private Address address;

    public String getSocialReason() {
        return socialReason;
    }

    public Organization setSocialReason(String socialReason) {
        this.socialReason = socialReason;
        return this;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public Organization setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
        return this;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public Organization setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
        return this;
    }

    public String getActuationArea() {
        return actuationArea;
    }

    public Organization setActuationArea(String actuationArea) {
        this.actuationArea = actuationArea;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Organization setAddress(Address address) {
        this.address = address;
        return this;
    }
}
