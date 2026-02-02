package com.borghi.mkt.entity;

public class Address {
    private String street;
    private String city;
    private int number;
    private String country;
    private String state;


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", number=" + number +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Address(String street, String city, int number, String country, String state) {
        this.street = street;
        this.city = city;
        this.number = number;
        this.country = country;
        this.state = state;
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


}
