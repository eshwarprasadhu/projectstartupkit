package com.nous.project.template.controller;

import com.nous.project.template.domain.Product;
import com.nous.project.template.exception.ProductNotPurchased;
import com.nous.project.template.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sahan on 4/9/2016.
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Product> getAll() {
    	List<Product> result=productService.getProducts();
    	if(result.isEmpty()) {
    		throw new ProductNotPurchased("There are no purchased items");
    	}
        return result;
    }
}
