package com.nous.project.template.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.nous.project.template.model.Product;
import com.nous.project.template.service.ProductService;

public class ProductDAOTest {
	 
	
//  code to test Product function
    @Test
    public void testSaveProduct() {
        ProductService dao = new ProductService();
        Product product = new Product();
        String productValue = dao.save(product);
 
        assertNotNull(product);
    }
}