package com.nous.project.template.controller;

import com.nous.project.template.domain.Product;
import com.nous.project.template.domain.ShoppingCart;
import com.nous.project.template.domain.User;
import com.nous.project.template.model.ShoppingCartDTO;
import com.nous.project.template.service.ShoppingCartService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;



/*
 * ShoppingCartTest for addProductsTest and updateProductsTest test method 
 *
 *
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartControllerTest {

	@Mock
	ShoppingCartService shoppingCartService;


	

	@Test
	public void addProductsTest() {
	
		List<Product> addItemresult = shoppingCartService.addItem(addProductsTestData(), getProductId());
		Assert.assertNotNull(addItemresult);
	}

	
	
	@Test
	public void updateProductsTest() {
	
		List<Product> addItemresult = shoppingCartService.getItem(getProductId());
		Assert.assertNotNull(addItemresult);
	}

	
	
	private Long getProductId() {
		
		return 12L;
	}

	
	
	public List<Product> addProductsTestData() {

		List<Product> products = new ArrayList<>();

		Product product1 = new Product();
		product1.setId(21l);
		product1.setName("gadget1");

		Product product2 = new Product();
		product2.setId(31l);
		product2.setName("gadget2");

		products.add(product1);
		products.add(product2);

		return products;
	}
}
