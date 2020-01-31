package com.nous.project.template.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.nous.project.template.domain.User;

@Service
@Transactional
public class UserService {

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User("user1@gmail.com", "user1"));
		users.add(new User("user2@gmail.com", "user2"));
	}

}
