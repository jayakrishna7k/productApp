package com.app.productApp.controller.categoryApp;

import com.app.productApp.model.Category;
import com.app.productApp.service.categoryApp.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/v1/app/product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/all")
    public ResponseEntity<?> getAllCategories(){
       return new ResponseEntity<>(categoryService.getAllCategories(),HttpStatus.OK);
    }
}
