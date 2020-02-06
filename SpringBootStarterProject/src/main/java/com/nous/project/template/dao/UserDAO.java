package com.nous.project.template.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.project.template.domain.Product;

public interface UserDAO extends JpaRepository<Product, Long>{

}
