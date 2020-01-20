package com.nous.project.template.service;

import java.util.ArrayList;
import java.util.List;

import com.nous.project.template.domain.Product;

public class ShoppingCartService {
	
	public List<Product> addProducts() {

		List<Product> products = new ArrayList<>();

		Product product1 = new Product();
		product1.setId(2l);
		product1.setName("abc");

		Product product2 = new Product();
		product2.setId(3l);
		product2.setName("ytr");

		products.add(product1);
		products.add(product2);

		return products;
	}
	
	public List<Product> addItem( List<Product> productName, Long id ) {
		
		return addProducts();
		
	}
	
	
	public List<Product> getItem(Long id){
		return addProducts();
	}
  
}
