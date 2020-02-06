package com.nous.project.template.test.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.nous.project.template.domain.Product;
import com.nous.project.template.service.ProductService;


public class TestProductDAO {
	 
    @Test
    public void testSaveProduct() {
    	 
    	ProductService dao = new ProductService();
    	        Product product = new Product();
    	        product = dao.save(product);
    	 
    	        assertNotNull(product);
    }
    
    
    @Test
    public void testSaveProduct1() {
    	 
    	        ProductService dao = new ProductService();
    	        Product product = new Product();
    	        product = dao.delete(product);
    	 
    	        assertNotNull(product);
    }
    	 
    	 

}