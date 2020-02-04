package com.nous.project.template.domain.abstractFDP;

/**
 * @author sachins
 * 
 *  This is a consumer class that will provide the entry point for the client classes to create sub-classes
 *
 */
public class ProductFactory {

	/**
	 * @param productAbstractFactory
	 * @return corresponding Product Object
	 */
	public static Product getProduct(ProductAbstractFactory productAbstractFactory) {
		return productAbstractFactory.createProduct();

	}

}
