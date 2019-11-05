package com.springbootcompose.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcompose.demo.model.User;
import com.springbootcompose.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@PostMapping(value="/add-user")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

}
