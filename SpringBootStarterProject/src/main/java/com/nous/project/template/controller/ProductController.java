package com.nous.project.template.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nous.project.template.domain.Product;
import com.nous.project.template.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public List<Product> getAll() {
		return productService.findAll();
	}

	@RequestMapping("/get/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		Product product = null;
		try {
			product = productService.findProduct(id).get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return product;
	}
}
