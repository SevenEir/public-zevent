package com.fatec.zevent.model;

import javax.validation.constraints.NotNull;

public class Address {

    @NotNull(message = "Organization's postal code must not be null")
    private String postalCode;

    @NotNull(message = "Organization's country must not be null")
    private String country;

    @NotNull(message = "Organization's state must not be null")
    private String state;

    @NotNull(message = "Organization's city must not be null")
    private String city;

    @NotNull(message = "Organization's neighborhood must not be null")
    private String neighborhood;

    @NotNull(message = "Organization's street must not be null")
    private String street;

    @NotNull(message = "Organization's number must not be null")
    private String number;
    private String complement;

    public String getPostalCode() {
        return postalCode;
    }

    public Address setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public Address setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Address setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getComplement() {
        return complement;
    }

    public Address setComplement(String complement) {
        this.complement = complement;
        return this;
    }
}
