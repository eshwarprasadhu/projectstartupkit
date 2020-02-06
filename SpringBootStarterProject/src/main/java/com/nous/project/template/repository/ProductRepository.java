package com.nous.project.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.project.template.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
