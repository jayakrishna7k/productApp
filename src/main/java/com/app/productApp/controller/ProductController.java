package com.app.productApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1/app/product")
public class ProductController {

    @GetMapping("/say/welcome")
    public ResponseEntity<?> sayWelcome(){
        return new ResponseEntity<>("Hi, Welcome to Product App", HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getProducts(){
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }
}
