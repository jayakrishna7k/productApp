package com.app.productApp.service;

import com.app.productApp.jpa.model.Product;
import com.app.productApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // public -specifier ,List <Product> return type ,getAllProducts - method name ,(//) empty method arguments
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        if (!products.isEmpty()) {
            return products;
        }
        return Collections.emptyList();
    }

    public Product saveProduct(Product product){
       return productRepository.save(product);
    }
}
