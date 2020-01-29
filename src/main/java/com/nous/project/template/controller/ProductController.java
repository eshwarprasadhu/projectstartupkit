package com.nous.project.template.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nous.project.template.model.Product;
import com.nous.project.template.service.ProductService;




@RestController
@RequestMapping("/product")

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
		product = productService.findProduct(id).get();

		return product;
	}

	@GetMapping
	public List<Product> getAllproducts() {
			
		return productService.getProduct();
		
	}
	
	public List<Product> getProductById(Long id) {
		 Product prod = productService.getProductById(id).get();
		 return (List<Product>) prod;
		
	}
	
	public boolean updateProductById(Long id) {


		boolean update=productService.updateProductById(id);
		return update;
		
		
	}
	
	public boolean Saveproduct(Product product) {
		boolean save=productService.Saveproduct(product);
		return save;
		
	}
	
	public boolean deleteProductById(Long id) {
		boolean delete=productService.deleteProductById(id);
		return delete;
		
	}
	
	
	

	
//	@RequestMapping(value="post",method = RequestMethod.POST)
//	@ResponseBody
//	public List<Product> postAll() {
//	
//		return addProducts();
//	  
//	}
	
	
	
}
