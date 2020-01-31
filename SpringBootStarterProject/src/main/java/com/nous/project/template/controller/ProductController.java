package com.nous.project.template.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nous.project.template.domain.Product;
import com.nous.project.template.service.ProductService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/products")
public class ProductController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(ShoppingCartController.class);
	
	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Product> getAll() {
		try {
			log.info("Adding all the objets to the list");
			List<Product> list = new ArrayList<Product>();
			list.add(productData());
			log.info("Returning list of objects in shopping cart");
			return list;
		} catch (Exception e) {
			log.error("Please check the products which you are adding to the cart list");
			e.printStackTrace();
		}
		
		return null;
	}
	
	

	    public Product productData() {
	       log.info("Adding products data to the  product object");
	       Product product = new Product();
	       
	       product.setId(12345L);
	       product.setName("Air condition");
	       product.setQuantity(1);
	       product.setUnitPrice(3500.00);
	       product.setDescription("Which is used to cool the room");
	       
	       log.info("Returning product object");
	       return product;
	    }
}
