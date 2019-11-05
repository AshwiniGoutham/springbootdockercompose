package com.springbootcompose.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class User {

	public User() {

	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Id
	private Long id;

	@Size(max = 10)
	@NotNull
	private String name;

	@NotNull
	@Email
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
