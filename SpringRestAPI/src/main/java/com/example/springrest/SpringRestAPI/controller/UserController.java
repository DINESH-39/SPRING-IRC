package com.example.springrest.SpringRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//sorting
	@GetMapping("/sortdes/{pname}")
	public List<User> sortPlayer(@PathVariable("pname") String pname)
	{
		return usrService.sortDesc(pname);
	}
		
	//Pagination
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<User> paginationData(@PathVariable("pnu") int pnu,@PathVariable("psize") int psize)
	{
		return usrService.paginationData(pnu, psize);
	}
	
	@GetMapping("/paginationSorting/{pnu}/{psize}/{pname}")
	public List<User> paginationSorting(@PathVariable("pnu") int pnu,@PathVariable("psize") int psize,@PathVariable("pname") String pname)
	{
		return usrService.paginationandSorting(pnu, psize, pname);
	}
}

	