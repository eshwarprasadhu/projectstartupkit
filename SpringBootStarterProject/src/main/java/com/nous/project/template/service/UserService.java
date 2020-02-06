package com.nous.project.template.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nous.project.template.model.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	User userObj;

	private static List<User> users = new ArrayList<>();
	
	static {
        users.add(new User("user1@gmail.com", "user1"));
        users.add(new User("user2@gmail.com", "user2"));
        users.add(new User("user2@gmail.com", "user3"));
        users.add(new User("user2@gmail.com", "user4"));
        users.add(new User("user2@gmail.com", "user5"));
    }
	
	
	 public List<User> displayUser(){
	    	
	    	return users;
	    }
	    
	    
	    public User addUser(User user)
	    {
	    	this.userObj=user;
	    	
	    	return userObj;
	    }
	    public User save(User user) {
	        // code to persist the User object
	        return user;
	    }
	 
	    public void delete(User user) {
	        // code to remove the User object
	    }

}
