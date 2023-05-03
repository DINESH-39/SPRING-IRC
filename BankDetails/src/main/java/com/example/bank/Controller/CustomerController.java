package com.example.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.Model.Customer;
import com.example.bank.Repository.CustomerRepo;

@RestController
@RequestMapping("/details")
public class CustomerController 
{

	@Autowired
	CustomerRepo crep;
	
	@PostMapping("")
	public Customer saveDetails(@RequestBody Customer cs)
	{
		return crep.save(cs);
	}
	
	@GetMapping("")
	public List<Customer> getDetails()
	{
		return crep.findAll();
	}
	
	@PutMapping("")
	public Customer updateDetails(@RequestBody Customer cup)
	{
		return crep.saveAndFlush(cup);
	}
	
}
