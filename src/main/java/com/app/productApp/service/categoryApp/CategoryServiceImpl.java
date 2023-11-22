package com.app.productApp.service.categoryApp;

import com.app.productApp.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private RestTemplate restTemplate;
    public List<Category> getAllCategories() {
        ResponseEntity<List<Category>> response= restTemplate.exchange("http://localhost:8083/v1/app/category/all", HttpMethod.GET,null,new ParameterizedTypeReference<List<Category>>() {});
        if(response.getStatusCode().equals(HttpStatus.OK)) {
            return response.getBody();
        }
        else{
           return Collections.emptyList();
        }
    }
}
