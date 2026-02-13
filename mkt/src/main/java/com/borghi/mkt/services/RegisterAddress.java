package com.borghi.mkt.services;

import com.borghi.mkt.entity.Address;
import com.borghi.mkt.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class RegisterAddress {

    private ArrayList<Address> addressList = new ArrayList<>();


    public void addAddress(Address address) {
        addressList.add(address);
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void delAddress(Long id) {
        if (id.equals(null) || id <= 0) {
            throw new IllegalArgumentException("Id não pode ser zero ou null");
        }
        Address add = findAddressById(id);
        addressList.remove(add);
    }

    public Address findAddressById(Long id) {
        if (id.equals(null) || id <= 0) {
            throw new IllegalArgumentException("Id não pode ser zero ou null");
        }
        for (Address add : addressList) {
            if (add.getId().equals(id)) {
                return add;
            }
        }
        throw new IllegalArgumentException("Endereço não encontrado");
    }

    public List<Address> findAddressByName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("nome não pode estar em branco");
        }
        String wordSearch = name.toLowerCase();
        List<Address> result = new ArrayList<>();

        for (Address add : addressList) {
            if ((add.getCity().toLowerCase().equals(wordSearch)) ||
                    (add.getCountry().toLowerCase().equals(wordSearch)) ||
                    (add.getState().toLowerCase().equals(wordSearch)) ||
                    (add.getStreet().toLowerCase().equals(wordSearch))) {
                result.add(add);
            }

        }
        return result;
    }
}


