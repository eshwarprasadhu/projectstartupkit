package com.nous.project.template.service;

import java.util.ArrayList;
import java.util.List;

import com.nous.project.template.model.Product;

public class ShoppingCartService {
	
    private static List<Product> products = new ArrayList<>();
	
	   static {
	    	
	        products.add(new Product(35.75d, 1000, "Pears baby soap for Kids", "Soap"));
	        products.add(new Product(45.50d, 500, "Signal Tooth Brushes Size in (L, M, S)", "Tooth Brushe"));
	        products.add(new Product(1500.0d, 100, "Casual Shirt imported from France", "Shirt"));
	        products.add(new Product(1000.0d, 400, "Leather bag imported from USA ", "Office Bag"));
	        products.add(new Product(450.0d, 800, "Hot Water Bottles", "Bottle"));
	        products.add(new Product(2500.0d, 800, "Imported wrist watches from swiss", "Wrist Watch"));
	        products.add(new Product(45000.0d, 800, "3G/4G capability", "Mobile Phone"));
	        products.add(new Product(300.0d, 800, "Head and Shoulders Shampoo", "Shampoo"));
	        products.add(new Product(550.0d, 800, "Imported Leather Wallets from AUS", "Leather Wallets"));
	        products.add(new Product(85000.0d, 800, "Imported Canon camera from USA", "Camera"));
	        
	    }
	
/*
 * ShoppingCartService class to add products to the cart and getProducts to the cart 
 * 
 * 
 */
	
//	public boolean addItem( List<Product> products, Long id ) {
//		return addProducts();
//	}
//	
//	
//	
//	public List<Product> getItem(Long id){
//		//return addProducts();
//	}
//	
//	
//	
//	public Boolean addProducts() {
//			boolean sucess=true;
//		List<Product> products = new ArrayList<>();
//
//		Product product1 = new Product();
//		product1.setId(21l);
//		product1.setName("gadget1");
//
//		Product product2 = new Product();
//		product2.setId(31l);
//		product2.setName("gadget2");
//
//		products.add(product1);
//		products.add(product2);
//
//		return sucess;
//	}
//	
//
//	public Boolean addProducts() {
//			boolean sucess=true;
//		List<Product> products = new ArrayList<>();
//
//		Product product1 = new Product();
//		product1.setId(21l);
//		product1.setName("gadget1");
//
//		Product product2 = new Product();
//		product2.setId(31l);
//		product2.setName("gadget2");
//
//		products.add(product1);
//		products.add(product2);
//
//		return sucess;
//	}
  
}
