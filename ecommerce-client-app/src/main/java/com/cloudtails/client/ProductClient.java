package com.cloudtails.client;

import com.cloudtails.model.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ProductClient {

    private static final String PRODUCT_BASE_URL = "http://localhost:8080/products/";

    public static void main(String[] args) {

      //  listAllProducts();
     //   getById();

      //  addProduct();

    }

    private static void addProduct()
    {
        Product p = new Product(101,"p101",122.34d);
        HttpEntity httpEntity = new HttpEntity(p);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(PRODUCT_BASE_URL, HttpMethod.POST, httpEntity,String.class);
        System.out.println(responseEntity.getBody());
        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getHeaders());
    }


    private static void getById()
    {
        String url = PRODUCT_BASE_URL + "1";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null,String.class);
        System.out.println(responseEntity.getBody());
        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getHeaders());
    }

    private  static void listAllProducts()
    {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.
                exchange(PRODUCT_BASE_URL, HttpMethod.GET, null,String.class);
        System.out.println(responseEntity.getBody());
        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getHeaders());
    }
}
