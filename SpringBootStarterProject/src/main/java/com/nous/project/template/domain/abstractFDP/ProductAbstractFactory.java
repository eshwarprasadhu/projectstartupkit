package com.nous.project.template.domain.abstractFDP;

/**
 * @author sachins
 *
 *  created an Abstract Factory interface (or abstract class)
 *
 */
public interface ProductAbstractFactory {

	/**
	 * @return corresponding sub-class of Product
	 * 
	 * This method is returning an instance of super class Product. Now our factory classes will implement this interface and return their respective sub-class
	 * 
	 */
	public Product createProduct();

}
