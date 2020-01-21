package com.nous.project.template.service;

import java.util.ArrayList;
import java.util.List;

import com.nous.project.template.domain.Product;

public class ShoppingCartService {
	
/*
 * ShoppingCartService class to creat
 * 
 * 
 */
	
	public List<Product> addItem( List<Product> productName, Long id ) {
		return addProducts();
	}
	
	
	
	public List<Product> getItem(Long id){
		return addProducts();
	}
	
	
	
	public List<Product> addProducts() {

		List<Product> products = new ArrayList<>();

		Product product1 = new Product();
		product1.setId(21l);
		product1.setName("gadget1");

		Product product2 = new Product();
		product2.setId(31l);
		product2.setName("gadget2");

		products.add(product1);
		products.add(product2);

		return products;
	}
  
}
