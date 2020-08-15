package com.amzaon.controller;

import com.amzaon.model.Product;
import com.amzaon.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public List<Product> getAll()
    {
        return productService.findAll();
    }

    @GetMapping("/{productId}")
    public Product getById(@PathVariable  Integer productId)
    {
        return productService.findById(productId);
    }

    @PostMapping("/")
    public String add(@RequestBody Product product)
    {
        return productService.add(product);
    }
}
