package com.app.productApp.service;

import com.app.productApp.jpa.model.Product;
import com.app.productApp.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductServiceTest {
    @InjectMocks
    ProductService productService;
    @Mock //spy
    ProductRepository productRepository;

    @Test
    public void testAllProducts(){
        Product prod1=new Product();
        prod1.setProductName("Test Product 1");
        prod1.setCategory("Test Cateory 1");
        prod1.setProductDescription("Test Description 1");
        prod1.setPrice("123");
        Product prod2=new Product();
        prod2.setProductName("Test Product 2");
        prod2.setCategory("Test Cateory 2");
        prod2.setProductDescription("Test Description 2");
        prod2.setPrice("1234");
        List<Product> mockedProducts=new ArrayList<>();
        mockedProducts.add(prod1);
        mockedProducts.add(prod2);
        when(productRepository.findAll()).thenReturn(mockedProducts);

        List<Product> products=productService.getAllProducts();
        assertEquals(2,products.size());
        assertEquals("Test Product 1",products.get(0).getProductName());
        assertEquals("Test Product 2",products.get(1).getProductName());
        assertNotNull(products.get(0));
        assertNotNull(products.get(1));
        assertFalse(products.size()==3);
        assertTrue(products.size()==2);
    }

    @Test
    public void testSaveProducts(){
        Product prod=new Product();
        prod.setProductName("Test Product 1");
        prod.setCategory("Test Cateory 1");
        prod.setProductDescription("Test Description 1");
        prod.setPrice("123");
        when(productRepository.save(any())).thenReturn(prod);
        Product product=productService.saveProduct(prod);
        assertEquals("Test Product 1",product.getProductName());
        assertEquals("Test Category 1",product.getCategory());
    }
}
