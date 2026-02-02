package com.borghi.mkt.services;

import com.borghi.mkt.entity.Product;

import java.util.ArrayList;

public class RegisterProduct {

    private ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void productAdd(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Produto não pode ser vazio!");
        }
        productList.add(product);
    }

    public void productDel(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("id não pode ser vazio ou zero!");
        }
        Product product=findProductById(id);
        productList.remove(product);
    }

    public Product findProductById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("id não pode ser vazio ou zero!");
        }
        for (Product p : productList) {
            if (p.getId().equals(id))
                return p;
        }
        throw new IllegalArgumentException("Produto não encontrado!!");
    }

    public Product findProductByName(String name) {
        if (name.equals(null) || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Pesquisa precisa de um nome para busca!");
        }
        for (Product p : productList) {
            if (p.getName().equals(name))
                return p;
        }
            throw new IllegalArgumentException("Produto não encontrado!!");
        }
    }
