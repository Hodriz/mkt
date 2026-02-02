package com.borghi.mkt.services;

import com.borghi.mkt.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterProductTest {

    private RegisterProduct registerProduct;
    private Product product1;
    private Product product2;

    @BeforeEach
      void setup(){

        registerProduct=new RegisterProduct();
        product1=new Product(
                 1l,
                 "Sabonete",
                 1.25,
                 12
        );

        product2=new Product(
                 2l,
                "Coca-Cola",
                11.5,
                35
        );

    }

    @Test
    void getProductList() {
        registerProduct.productAdd(product1);
        registerProduct.productAdd(product2);
        ArrayList<Product>listProduct=registerProduct.getProductList();

        assertTrue(listProduct.contains(product1));
        assertTrue(listProduct.contains(product2));
        assertEquals(2,listProduct.size());
        assertNotNull(listProduct);
    }

    @Test
    void setProductList() {
        registerProduct.productAdd(product1);
        registerProduct.productAdd(product2);
        ArrayList<Product>listProduct=registerProduct.getProductList();

        assertTrue(listProduct.contains(product1));
        assertTrue(listProduct.contains(product2));
        assertEquals(2,listProduct.size());
        assertNotNull(listProduct);
    }

    @Test
    void productAdd() {
        registerProduct.productAdd(product1);

        ArrayList<Product>listProduct=registerProduct.getProductList();
        assertTrue(listProduct.contains(product1));
        assertEquals(1,listProduct.size());
        assertNotNull(listProduct);
    }

    @Test
    void productDel() {
        registerProduct.productAdd(product1);
        registerProduct.productAdd(product2);
        ArrayList<Product>listProduct=registerProduct.getProductList();

        registerProduct.productDel(1L);
        assertFalse(listProduct.contains(product1));

    }

    @Test
    void findProductById() {

        registerProduct.productAdd(product1);
        registerProduct.productAdd(product2);
        ArrayList<Product>listProduct=registerProduct.getProductList();

        Product product=registerProduct.findProductById(1L);
        assertSame(product1, product);
        assertNotNull(product);

    }

    @Test
    void findProductByName() {
        registerProduct.productAdd(product1);
        registerProduct.productAdd(product2);
        ArrayList<Product>listProduct=registerProduct.getProductList();

        Product product=registerProduct.findProductByName("Sabonete");
        assertSame(product1.getName(),product.getName());
        assertNotNull(product);
        assertTrue(listProduct.contains(product));

    }
}