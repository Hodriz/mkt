package com.borghi.mkt.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Long id;
    private String name;
    private int age;
    private char gender;
    private String cpf;
    private Address address;
    private List<String> personList =new ArrayList<String>();

    public Person(Long id, String name, int age, char gender, String cpf, Address address, List<String> personList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cpf = cpf;
        this.address = address;
        this.personList = personList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getPersonList() {
        return personList;
    }

    public void setPersonList(List<String> personList) {
        this.personList = personList;
    }
}
