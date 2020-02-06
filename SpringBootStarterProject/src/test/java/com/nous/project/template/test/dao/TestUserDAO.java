package com.nous.project.template.test.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.nous.project.template.model.Product;
import com.nous.project.template.model.User;
import com.nous.project.template.service.ProductService;
import com.nous.project.template.service.UserService;

public class TestUserDAO {
	
    @Test
    public void testSaveUser() {
    	
    	UserService userService = new UserService();
       
        User user = new User();
        user = userService.save(user);
 
        assertNotNull(user);
    }
 
    
    @Test
    public void testDeleteUser() {
    	
    	UserService userService = new UserService();
       
        User user = new User();
        userService.delete(user);
 
        assertNotNull(user);
        
    }
 
   

}
