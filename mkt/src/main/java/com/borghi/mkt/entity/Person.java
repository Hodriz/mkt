package com.borghi.mkt.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Long id;
    private String name;
    private int age;
    private char gender;
    private String cpf;
    private ArrayList<Address>addresses=new ArrayList<>();
    private ArrayList<Product>products=new ArrayList<>();

    public Person(Long id, String name, int age, char gender, String cpf, ArrayList<Address> addresses, ArrayList<Product> products) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cpf = cpf;
        this.addresses = addresses;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", cpf='" + cpf + '\'' +
                ", addresses=" + addresses +
                ", products=" + products +
                '}';
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

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
