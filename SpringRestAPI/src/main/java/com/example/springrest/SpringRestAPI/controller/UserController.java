package com.example.springrest.SpringRestAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.SpringRestAPI.service.UserService;
import com.example.springrest.SpringRestAPI.model.User;

@RestController
public class UserController 
{

	@Autowired
	UserService usrService;
	@PostMapping("/checkLogin")
		public String validateUser(@RequestBody User u)
		{
		System.out.println(u.getUsername());
			return usrService.validateUser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	public Object User(@RequestBody User u)
	{
		return usrService.saveUser(u);
	}
	
	@GetMapping("/login")
	public String Login(@RequestBody User ph)
	{
		
		return usrService.validateUser(ph.getUsername(), ph.getPassword());
	}
}

	