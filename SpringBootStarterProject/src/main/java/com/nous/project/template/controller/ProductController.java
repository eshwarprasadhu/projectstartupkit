package com.nous.project.template.controller;

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

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Product> getAll() {
		logerMethod();
		return null;
	}
	
	 private static final Logger log = (Logger) LoggerFactory.getLogger(ShoppingCartController.class);

	    public void logerMethod() {
	       log.info("Hello world");
	    }
}
