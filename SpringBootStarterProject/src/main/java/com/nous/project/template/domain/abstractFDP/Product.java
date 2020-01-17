package com.nous.project.template.domain.abstractFDP;

/**
 * @author sachins
 * 
 *  Abstract super class with overridden toString()
 *
 */
public abstract class Product {

	public abstract Long getId();

	public abstract String getName();

	public abstract String getDescription();

	public abstract Integer getQuantity();

	public abstract Double getUnitPrice();

	@Override
	public String toString() {
		return "Product [Id=" + getId() + ", Name=" + getName() + ", Description=" + getDescription()
				+ ", Quantity=" + getQuantity() + ", UnitPrice=" + getUnitPrice() + ", Class="
				+ getClass() + ", hashCode=" + hashCode() + ", toString=" + super.toString() + "]";
	}

}
