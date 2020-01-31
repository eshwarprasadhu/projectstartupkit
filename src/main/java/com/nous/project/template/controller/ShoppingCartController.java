package com.nous.project.template.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nous.project.template.model.Product;
import com.nous.project.template.model.User;
import com.nous.project.template.service.ProductService;

@RestController
@RequestMapping("/shoppingCart/#")
public class ShoppingCartController {
	
	@Autowired
	ProductService productservice;
	
	@GetMapping
	public List<Product> getMethod() {
		
		return productservice.addProducts();
	  
	}	
	public List<User> getUsers(){
		return null;
		
	}

}
