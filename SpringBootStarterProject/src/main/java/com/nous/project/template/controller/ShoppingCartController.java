package com.nous.project.template.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nous.project.template.domain.Product;
import com.nous.project.template.domain.User;
import com.nous.project.template.service.ProductService;
import com.nous.project.template.service.UserService;


/*
 * Class for product shopping cart CRUD operations  and to facilitate the flow of application related
 */
@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	
	@Autowired
	UserService user;
	
	@Autowired
	ProductService productservice;
	
	
	// Get the products in the shopping cart 
	@GetMapping
	public List<Product> getMethod() {
		
		return productservice.addProducts();
	  
	}	
	
	//Get the User details
	
	public List<User> getUsers(){
		return user.displayUser();
		
	}

}
