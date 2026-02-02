package com.borghi.mkt.services;

import com.borghi.mkt.entity.Person;

import java.util.ArrayList;

public class RegisterPerson {

    private ArrayList<Person> personList = new ArrayList<>();

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void delPerson(Long id) {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("id não pode ser igual a null e menor que zero");
        }
        Person person = findPersonById(id);
        personList.remove(person);

    }

    public Person findPersonById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID não pode ser nulo");
        }
        for (Person p : personList) {
            if (id.equals(p.getId())) {
                return p;
            }
        }
        throw new IllegalArgumentException("Pessoa não encontrada!");
    }

    public Person findByName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Busca com valor nulo");
        }
        for (Person p : personList) {
            if (name.equals(p.getName())) {
                return p;
            }

        }
        throw new IllegalArgumentException("Pessoa não encontrada!");

    }
}