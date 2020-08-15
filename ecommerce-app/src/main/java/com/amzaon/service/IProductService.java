package com.amzaon.service;

import com.amzaon.model.Product;

import java.util.List;

public interface IProductService {

    // add , findById, findAll
    public String add(Product product);

    public Product findById(Integer productId);

    public List<Product> findAll();

    // update method
}
