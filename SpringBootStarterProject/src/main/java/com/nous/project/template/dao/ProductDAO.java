package com.nous.project.template.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.project.template.domain.Product;

/*
 * Product Repository
 */
public interface ProductDAO extends JpaRepository<Product, Long> {

}
