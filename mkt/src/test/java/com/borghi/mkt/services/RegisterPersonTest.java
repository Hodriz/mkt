package com.borghi.mkt.services;

import com.borghi.mkt.entity.Address;
import com.borghi.mkt.entity.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegisterPersonTest {

    private RegisterPerson registerPerson;
    private Person person1;
    private Person person2;

    @BeforeEach
    void setup(){
        registerPerson=new RegisterPerson();


        person1=new Person();
        person1.setName("Silvio Santos");
        person1.setAddresses(new Address(1L,"Rua Getulio Vargas","Maringá",33,"Paraná","Brazil"));
        person1.setAge(50);
        person1.setId(1L);
        person1.setCpf("064.568.216-56");
        person1.setGender('M');

        person2=new Person();
        person2.setName("Michael Jackson");
        person2.setAddresses(new Address(2l,"Rua Geraldo Geronimo","Paiçandu",54,"Paraná","Brazil"));
        person2.setAge(65);
        person2.setId(2L);
        person2.setCpf("063.528.116-33");
        person2.setGender('M');
    }

    @Test
    void getPersonList() {
        registerPerson.addPerson(person1);
        registerPerson.addPerson(person2);
        ArrayList<Person>list=registerPerson.getPersonList();
        assertTrue(list.contains(person1));
        assertTrue(list.contains(person2));
        assertEquals(2,list.size());
        assertNotNull(list);

    }

    @Test
    void setPersonList() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);

        registerPerson.setPersonList(list);

        assertEquals(2, registerPerson.getPersonList().size());
        assertTrue(registerPerson.getPersonList().contains(person1));
        assertTrue(registerPerson.getPersonList().contains(person2));

    }

    @Test
    void addPerson() {

        ArrayList<Person> list = registerPerson.getPersonList();
        Person personEmpty=new Person();
        registerPerson.addPerson(person1);
        assertTrue(list.contains(person1));

    }

    @Test
    void delPerson() {

        ArrayList<Person> list = registerPerson.getPersonList();
        registerPerson.addPerson(person1);
        registerPerson.addPerson(person2);
        registerPerson.delPerson(1L);
        assertFalse(list.contains(person1));

    }

    @Test
    void findPersonById() {

        person1.setId(1l);
        person2.setId(2l);
        registerPerson.addPerson(person1);
        registerPerson.addPerson(person2);
        Person p=registerPerson.findPersonById(1L);
        assertSame(p, person1);
    }

    @Test
    void findByName() {

        registerPerson.addPerson(person1);
        registerPerson.addPerson(person2);

        ArrayList<Person>list =registerPerson.getPersonList();
        Person p=registerPerson.findByName("Michael Jackson");
        assertSame(person2.getName(), p.getName());
        assertTrue(list.contains(p));

    }
}