package com.nous.project.template.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nous.project.template.domain.User;
import com.nous.project.template.service.UserService;


/*
 * 
 * Class for User CRUD operations and to facilitate the flow of application related to Users
 * 
 */

@RestController
@RequestMapping("/User")
public class UserController {
	
	
	@Autowired
	UserService userservice;
	
	
	//code to display UserDetails
	@GetMapping
	public List<User> getMethod() {
		return  userservice.displayUser();
	}	
	
	
	//code to Add UserDetails
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopics(@RequestBody User user) {
			userservice.addUser(user);
	}
}