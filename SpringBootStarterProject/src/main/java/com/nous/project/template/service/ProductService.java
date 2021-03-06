package com.nous.project.template.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.nous.project.template.model.Product;
import com.nous.project.template.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	private static List<Product> products = new ArrayList<>();

	static {
		products.add(new Product(35.75d, 1000, "Pears baby soap for Kids", "Soap"));
		products.add(new Product(45.50d, 500, "Signal Tooth Brushes Size in (L, M, S)", "Tooth Brushe"));
		products.add(new Product(1500.0d, 100, "Casual Shirt imported from France", "Shirt"));
		products.add(new Product(1000.0d, 400, "Leather bag imported from USA ", "Office Bag"));
		products.add(new Product(450.0d, 800, "Hot Water Bottles", "Bottle"));
		products.add(new Product(2500.0d, 800, "Imported wrist watches from swiss", "Wrist Watch"));
		products.add(new Product(45000.0d, 800, "3G/4G capability", "Mobile Phone"));
		products.add(new Product(300.0d, 800, "Head and Shoulders Shampoo", "Shampoo"));
		products.add(new Product(550.0d, 800, "Imported Leather Wallets from AUS", "Leather Wallets"));
		products.add(new Product(85000.0d, 800, "Imported Canon camera from USA", "Camera"));
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	/**
	 * @param id
	 * @return Product
	 * @throws InterruptedException
	 * 
	 * The findProduct() call will first check the cache product before actually invoking the method and then caching the result
	 * 
	 */
	@Cacheable("product")
	public Optional<Product> findProduct(Long id) throws InterruptedException{
			Thread.sleep(4000);
			return productRepository.findAll().stream().filter(p -> p.getId().equals(id)).findFirst();
	}
	 @Autowired
	    private ProductRepository productDAO;
	
	 public List<Product> addProducts(){
	    	
	       	return products;
		}
	    
	    
	    
	    public void addProduct(Product product){
	    	
	    	products.add(product);
	    }
	    
	    
	    public void updateProduct(Long id,Product products) {
	    	
	    	Optional<Product> product=productDAO.findById(id);
	    	
	    }
	    
	    
	    
	    // code to find all products
	    public List<Product> findAllProduct() {
			return productDAO.findAll();
		}
	    
	    
	    
	    public List<Product> getProduct() {
			return productDAO.findAll();
		}
		

	   //  code to find product by Id
	    public Optional<Product> getProductById(Long id) {
	    	
	    	return productDAO.findById(id);
	    
	    }
	    
	    
	    //  code to update product by Id
	    public boolean updateProductById(Long id) {
	    	
	    	Optional<Product> product=productDAO.findById(id);
	    	Product products = null;
	    	
			productDAO.save(products);
			
	    	return true;
	    }
	    
	    
	    //  code to save product
	    public boolean Saveproduct(Product product) {    	
	    	
	    	productDAO.save(product);
	    	
	    	return true;
	    }
	    
	 
	    //  code to delete product
	    public boolean deleteProductById(Long id) {
	    	
	    	Optional<Product> product=  productDAO.findById(id);
	    	
	    	Product products = null;
	    	productDAO.delete(products);
	    	
	    	return true;
	    	
	    }

		
	    public Product save(Product product) {
	        // code to persist the Product object
	    	
	    	
	        return product;
	        
	    }
	 
	    public Product delete(Product product) {
	    	
	        return product;
	    	
	    }
}
