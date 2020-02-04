package com.nous.project.template.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nous.project.template.domain.Product;
import com.nous.project.template.exception.ProductNotPurchased;
import com.nous.project.template.service.ProductService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/products")
public class ProductController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(ShoppingCartController.class);
	
	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public List<Product> getAll() {
	
		log.info("Finding all the products in cart list");
		List<Product> result=productService.findAll();
    	if(result==null || result.isEmpty() ) {
			log.error("Please check the products which you are adding to the cart list");
    		throw new ProductNotPurchased("There are no purchased items");
    	}
        return result;
	}

	@RequestMapping("/get/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		Product product = null;
		try {
			log.info("Getting the products by product ID");
			product = productService.findProduct(id).get();
		} catch (InterruptedException e) {
			log.error("Please check the products which you are adding to the cart list", e.getMessage());
		}

		return product;
	}
	
	
}
