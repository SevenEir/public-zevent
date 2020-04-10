package com.fatec.zevent.model;

import javax.validation.constraints.NotNull;

public class Organization {

    @NotNull(message = "Organization's social reason must not be null")
    private String socialReason;

    @NotNull(message = "Organization's fantasy name must not be null")
    private String fantasyName;

    @NotNull(message = "Organization's CNPJ must not be null")
    private String CNPJ;

    @NotNull(message = "Organization's actuation area must not be null")
    private String actuationArea;

    @NotNull(message = "Organization's address must not be null")
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

    public String getCNPJ() {
        return CNPJ;
    }

    public Organization setCNPJ(String CNPJ) {
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
