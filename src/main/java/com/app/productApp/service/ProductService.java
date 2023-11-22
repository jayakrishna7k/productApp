package com.app.productApp.service;

import com.app.productApp.jpa.model.Product;

import java.util.List;

public interface ProductService {
    //abstract methods
     List<Product> getAllProducts();
    //abstract methods
    Product saveProduct(Product product);

}
