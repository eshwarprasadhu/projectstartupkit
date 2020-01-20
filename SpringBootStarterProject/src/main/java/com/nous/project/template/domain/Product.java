package com.nous.project.template.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sahan on 4/8/2016.
 */
public class Product implements Serializable {

    private Long id;
    private String name;
    private String description;
    private Integer quantity;
    private Double unitPrice;
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();

    public Product(){

    }

    public Product(Double unitPrice, Integer quantity, String description, String name) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.description = description;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
