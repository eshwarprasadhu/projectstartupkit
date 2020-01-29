package com.nous.project.template.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	
	@GetMapping
	public String getMethod() {
		
		return "Rakshitha";
		
	}	

}
