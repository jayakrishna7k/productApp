package com.app.productApp.controller;

import com.app.productApp.jpa.model.Product;
import com.app.productApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/app/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/say/welcome")
    public ResponseEntity<?> sayWelcome(){
        return new ResponseEntity<>("Hi, Welcome to Product App", HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getProducts(){
        List<Product> products=productService.getAllProducts();
        if(!products.isEmpty()) {
            return new ResponseEntity<>(products, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(products, HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        Product savedProduct=productService.saveProduct(product);
        if(savedProduct!=null) {
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

        }
    }
}
