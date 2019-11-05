package com.springbootcompose.demo.service;

import java.util.List;

import com.springbootcompose.demo.model.User;

public interface UserService {
	List<User> getAll();
	void addUser(User user);
}
