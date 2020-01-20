package com.nous.project.template.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nous.project.template.domain.Product;
import com.nous.project.template.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Product> getAll() {
		return null;
	}
}
