package com.nous.project.template.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.project.template.model.User;


public interface UserDAO extends JpaRepository<User, Long>{

}
