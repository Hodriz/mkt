package com.borghi.mkt.entity;

public class Address {
    private Long id;
    private String street;
    private String city;
    private int number;
    private String country;
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(Long id, String street, String city, int number, String country, String state) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.number = number;
        this.country = country;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", number=" + number +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
