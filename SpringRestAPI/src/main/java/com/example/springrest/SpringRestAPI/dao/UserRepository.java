package com.example.springrest.SpringRestAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springrest.SpringRestAPI.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
