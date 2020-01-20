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

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartControllerTest {

	@Mock
	ShoppingCartService shoppingCartService;


	/*
	 * Test data for updateProduct method of ShoppingCartService with valid data
	 *
	 *
	 *
	 */
//	public ShoppingCartDTO getproductdetails() {
//
//		ShoppingCartDTO shoppingCart = new ShoppingCartDTO();
//		shoppingCart.setProductId(2L);
//		shoppingCart.setStatus("PURCHASED");
//		shoppingCart.setStock(200);
//		return shoppingCart;
//
//	}

//	public ShoppingCart getShoppingCartResponse() {
//
//		ShoppingCart shoppingCart = new ShoppingCart();
//		shoppingCart.setAmount(20000d);
//		shoppingCart.setDate(null);
//		shoppingCart.setId(1346L);
//		shoppingCart.setStatus("PURCHASED");
//		shoppingCart.setStock(200);
//
//		User user = new User();
//		user.setEmail("exampple123@gmail.com");
//		user.setName("user");
//		user.setId(10L);
//		shoppingCart.setUser(user);
//
//		return shoppingCart;
//	}

	public List<Product> addProducts() {

		List<Product> products = new ArrayList<>();

		Product product1 = new Product();
		product1.setId(2l);
		product1.setName("abc");

		Product product2 = new Product();
		product2.setId(3l);
		product2.setName("ytr");

		products.add(product1);
		products.add(product2);

		return products;
	}

	
	@Test
	public void testUpdateProduct() {
	
		List<Product> addItemresult = shoppingCartService.addItem(addProducts(), 12L);
		Assert.assertNotNull(addItemresult);
	}

}
