package com.nous.project.template.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sahan on 4/9/2016.
 */
public class User implements Serializable{

    private Long id;
    private String name;
    private String email;
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public User(){
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
