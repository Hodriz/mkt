package com.borghi.mkt.services;

import com.borghi.mkt.entity.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterAddressTest {

    RegisterAddress registerAddress;
    Address add1;
    Address add2;

    @BeforeEach
    void setup(){

        registerAddress=new RegisterAddress();

        add1=new Address(1L,"Rua Ametista","Marialva",232,"Brasil","Paraná");
        add2=new Address(2L,"Beco Diagonal","Paiçandu",17,"Brasil","Paraná");
    }

    @Test
    void addAddress() {
        registerAddress.addAddress(add1);
        registerAddress.addAddress(add2);
        ArrayList<Address>list=registerAddress.getAddressList();
        assertTrue(list.contains(add1));
        assertTrue(list.contains(add2));
    }

    @Test
    void getAddressList() {
        registerAddress.addAddress(add1);
        registerAddress.addAddress(add2);
        ArrayList<Address>list=registerAddress.getAddressList();
        assertTrue(list.contains(add1));
        assertTrue(list.contains(add2));
        assertFalse(list.isEmpty());
        assertSame(2,list.size());
    }

    @Test
    void delAddress() {
        registerAddress.addAddress(add1);
        registerAddress.addAddress(add2);
        System.out.println(registerAddress);
        ArrayList<Address>list=registerAddress.getAddressList();
        registerAddress.delAddress(1L);
        assertSame(1,list.size());
        assertTrue(list.contains(add2));
        assertFalse(list.contains(add1));


    }

    @Test
    void findAddressById(){
        registerAddress.addAddress(add1);
        registerAddress.addAddress(add2);
        Address addFound=registerAddress.findAddressById(1L);
        assertSame(add1,addFound);
    }

    @Test
    void findAddressByName() {
        registerAddress.addAddress(add1);
        registerAddress.addAddress(add2);
        List<Address> addFound=registerAddress.findAddressByName("Paraná");
        assertTrue(addFound.contains(add1));
        assertTrue(addFound.contains(add2));
        assertEquals(2, addFound.size());
        addFound.forEach(System.out::println);
        };

}