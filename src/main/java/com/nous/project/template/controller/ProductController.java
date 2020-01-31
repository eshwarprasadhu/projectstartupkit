package com.nous.project.template.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nous.project.template.dao.ProductDAO;
import com.nous.project.template.model.Product;
import com.nous.project.template.service.ProductService;


/*
 * Class for product CRUD operations to facilitate the flow of application related to products
 */

@RestController
@RequestMapping("/product")


public class ProductController {
	

	@Autowired
	ProductDAO productdao;
	
	
	@Autowired
	private ProductService productService;

	
	//Code to get all the products details
	@GetMapping
	public List<Product> getAll() {	
		return productService.addProducts();
	}
	

	//Code to get add new product
	@PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
	public void createProduct(@RequestBody Product product) {
		productService.addProduct(product);
	  productdao.save(product);
	 
	} 
	
	
	//Code to update product through productId
	@PutMapping(value = "/update/{id}")
	public void update(@PathVariable("id") Long productId, @RequestBody Product product) {
        // TODO: update logic 
		//return "Country updated successfully";
		
		productService.updateProduct(productId,product);
	}
	
	
	//Code to get product through productId
	@RequestMapping("/get/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		
		Product product = productService.findProduct(id).get();

		return product;
	}
	
//	//
//	public List<Product> getProductById(Long id){
//		 Product prod = productService.getProductById(id).get();
//		 return (List<Product>) prod;
//		
//	}
//	
//	public boolean updateProductById(Long id){
//		boolean update=productService.updateProductById(id);
//		return update;
//	}
//	
	
	//code to save product
	public boolean Saveproduct(Product product) {
		boolean save=productService.Saveproduct(product);
		return save;
		
	}
	
	
	//code to delete products through id
	public boolean deleteProductById(Long id) {
		boolean delete=productService.deleteProductById(id);
		return delete;
		
	}
		
	
	
	
}
