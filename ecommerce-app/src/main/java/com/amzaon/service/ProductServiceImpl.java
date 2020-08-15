package com.amzaon.service;

import com.amzaon.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // spring bean // only one time/ singelton
public class ProductServiceImpl implements IProductService {

    private List<Product> products = new ArrayList<>();

    // non-static block. only once per object.
    {
        Product p = new Product();
        p.setId(1);
        p.setName("p1");
        p.setPrice(100.23d);

        Product p1 = new Product();
        p1.setId(2);
        p1.setName("p2");
        p1.setPrice(122.23d);

        products.add(p);
        products.add(p1);
        // 2
    }

    @Override
    public String add(Product product) {
         products.add(product);
         return "SUCCESS";
    }

    @Override
    public Product findById(Integer productId) {
        for(Product product: products)
        {
            if(product.getId().equals(productId))
            {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
