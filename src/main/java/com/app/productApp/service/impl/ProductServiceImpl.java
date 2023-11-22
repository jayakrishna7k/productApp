package com.app.productApp.service.impl;

import com.app.productApp.jpa.model.Product;
import com.app.productApp.repository.ProductRepository;
import com.app.productApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    // public -specifier ,List <Product> return type ,getAllProducts - method name ,(//) empty method arguments
   @Override
   //concrete methods
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        if (!products.isEmpty()) {
            return products;
        }
        return Collections.emptyList();
    }
    //concrete methods
    @Override
    public Product saveProduct(Product product){
       return productRepository.save(product);
    }
}
