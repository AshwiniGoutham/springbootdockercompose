package com.springbootcompose.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcompose.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
